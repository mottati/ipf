/*
 * Copyright 2009 the original author or authors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *     
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.openehealth.ipf.platform.camel.ihe.xds.commons.transform.requests;

import static org.apache.commons.lang.Validate.notNull;

import java.util.List;
import java.util.Map;

import javax.activation.DataHandler;

import org.openehealth.ipf.platform.camel.ihe.xds.commons.ebxml.EbXMLClassification;
import org.openehealth.ipf.platform.camel.ihe.xds.commons.ebxml.EbXMLAssociation;
import org.openehealth.ipf.platform.camel.ihe.xds.commons.ebxml.EbXMLFactory;
import org.openehealth.ipf.platform.camel.ihe.xds.commons.ebxml.EbXMLExtrinsicObject;
import org.openehealth.ipf.platform.camel.ihe.xds.commons.ebxml.EbXMLObjectLibrary;
import org.openehealth.ipf.platform.camel.ihe.xds.commons.ebxml.EbXMLProvideAndRegisterDocumentSetRequest;
import org.openehealth.ipf.platform.camel.ihe.xds.commons.ebxml.EbXMLRegistryPackage;
import org.openehealth.ipf.platform.camel.ihe.xds.commons.metadata.Association;
import org.openehealth.ipf.platform.camel.ihe.xds.commons.metadata.Document;
import org.openehealth.ipf.platform.camel.ihe.xds.commons.metadata.DocumentEntry;
import org.openehealth.ipf.platform.camel.ihe.xds.commons.metadata.Folder;
import org.openehealth.ipf.platform.camel.ihe.xds.commons.metadata.SubmissionSet;
import org.openehealth.ipf.platform.camel.ihe.xds.commons.metadata.Vocabulary;
import org.openehealth.ipf.platform.camel.ihe.xds.commons.requests.ProvideAndRegisterDocumentSet;
import org.openehealth.ipf.platform.camel.ihe.xds.commons.transform.ebxml.AssociationTransformer;
import org.openehealth.ipf.platform.camel.ihe.xds.commons.transform.ebxml.DocumentEntryTransformer;
import org.openehealth.ipf.platform.camel.ihe.xds.commons.transform.ebxml.FolderTransformer;
import org.openehealth.ipf.platform.camel.ihe.xds.commons.transform.ebxml.SubmissionSetTransformer;

/**
 * Transforms between a {@link ProvideAndRegisterDocumentSet} and its ebXML representation.
 * @author Jens Riemschneider
 */
public class ProvideAndRegisterDocumentSetTransformer {
    private final EbXMLFactory factory;    
    private final SubmissionSetTransformer submissionSetTransformer;
    private final DocumentEntryTransformer documentEntryTransformer;
    private final FolderTransformer folderTransformer;
    private final AssociationTransformer associationTransformer;
    
    /**
     * Constructs the transformer
     * @param factory
     *          factory for version independent ebXML objects. 
     */
    public ProvideAndRegisterDocumentSetTransformer(EbXMLFactory factory) {
        notNull(factory, "factory cannot be null");
        this.factory = factory;
        
        submissionSetTransformer = new SubmissionSetTransformer(factory);
        documentEntryTransformer = new DocumentEntryTransformer(factory);
        folderTransformer = new FolderTransformer(factory);
        associationTransformer = new AssociationTransformer(factory);
    }
    
    /**
     * Transforms a request into its ebXML representation.
     * @param request
     *          the request. Can be <code>null</code>.
     * @return the ebXML representation. <code>null</code> if the input was <code>null</code>.
     */
    public EbXMLProvideAndRegisterDocumentSetRequest toEbXML(ProvideAndRegisterDocumentSet request) {
        if (request == null) {
            return null;
        }
        
        EbXMLObjectLibrary library = factory.createObjectLibrary();        
        EbXMLProvideAndRegisterDocumentSetRequest ebXML = factory.createProvideAndRegisterDocumentSetRequest(library);
        
        for (Document doc : request.getDocuments()) {
            DocumentEntry docEntry = doc.getDocumentEntry();
            if (docEntry != null) {
                ebXML.addExtrinsicObject(documentEntryTransformer.toEbXML(docEntry, library));
                ebXML.addDocument(docEntry.getEntryUUID(), doc.getDataHandler());
            }
        }
        
        int classId = 0;
        for (Folder folder : request.getFolders()) {
            ebXML.addRegistryPackage(folderTransformer.toEbXML(folder, library));
            addClassification(ebXML, folder.getEntryUUID(), Vocabulary.FOLDER_CLASS_NODE, library, ++classId);
        }
        
        SubmissionSet submissionSet = request.getSubmissionSet();
        ebXML.addRegistryPackage(submissionSetTransformer.toEbXML(submissionSet, library));
        String entryUUID = submissionSet != null ? submissionSet.getEntryUUID() : null;
        addClassification(ebXML, entryUUID, Vocabulary.SUBMISSION_SET_CLASS_NODE, library, ++classId);
        
        for (Association association : request.getAssociations()) {
            ebXML.addAssociation(associationTransformer.toEbXML(association, library));
        }
        
        return ebXML;
    }

    /**
     * Transforms an ebXML representation or a request.
     * @param ebXML
     *          the ebXML representation. Can be <code>null</code>.
     * @return the request. <code>null</code> if the input was <code>null</code>.
     */
    public ProvideAndRegisterDocumentSet fromEbXML(EbXMLProvideAndRegisterDocumentSetRequest ebXML) {
        if (ebXML == null) {
            return null;
        }
        
        ProvideAndRegisterDocumentSet request = new ProvideAndRegisterDocumentSet();
        
        Map<String, DataHandler> documents = ebXML.getDocuments();
        for (EbXMLExtrinsicObject extrinsic : ebXML.getExtrinsicObjects(Vocabulary.DOC_ENTRY_CLASS_NODE)) {
            DocumentEntry docEntry = documentEntryTransformer.fromEbXML(extrinsic);
            if (docEntry != null) {
                Document document = new Document();
                document.setDocumentEntry(docEntry);
                if (docEntry.getEntryUUID() != null) {
                    String id = docEntry.getEntryUUID();
                    document.setDataHandler(documents.get(id));
                }
                request.getDocuments().add(document);
            }
        }

        for (EbXMLRegistryPackage regPackage : ebXML.getRegistryPackages(Vocabulary.FOLDER_CLASS_NODE)) {
            request.getFolders().add(folderTransformer.fromEbXML(regPackage));
        }

        List<EbXMLRegistryPackage> regPackages = ebXML.getRegistryPackages(Vocabulary.SUBMISSION_SET_CLASS_NODE);
        if (regPackages.size() > 0) {
            request.setSubmissionSet(submissionSetTransformer.fromEbXML(regPackages.get(0)));
        }
        
        for (EbXMLAssociation association : ebXML.getAssociations()) {
            request.getAssociations().add(associationTransformer.fromEbXML(association));
        }
        
        return request;
    }

    private void addClassification(EbXMLProvideAndRegisterDocumentSetRequest ebXML, String classified, String node, EbXMLObjectLibrary library, int classId) {
        EbXMLClassification classification = factory.createClassification(library);
        classification.setClassifiedObject(classified);
        classification.setClassificationNode(node);
        classification.setId("class_id_" + classId);
        ebXML.addClassification(classification);
    }    
}
