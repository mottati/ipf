//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.9-03/31/2009 04:14 PM(snajper)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.05.19 at 10:15:07 AM CEST 
//


package org.openehealth.ipf.platform.camel.ihe.xds.commons.stub.ebrs21.rim;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LeafRegistryObjectListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LeafRegistryObjectListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1}ObjectRef"/>
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1}Association"/>
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1}AuditableEvent"/>
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1}Classification"/>
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1}ClassificationNode"/>
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1}ClassificationScheme"/>
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1}ExternalIdentifier"/>
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1}ExternalLink"/>
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1}ExtrinsicObject"/>
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1}Organization"/>
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1}RegistryPackage"/>
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1}Service"/>
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1}ServiceBinding"/>
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1}SpecificationLink"/>
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1}User"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LeafRegistryObjectListType", propOrder = {
    "objectRefOrAssociationOrAuditableEvent"
})
@XmlSeeAlso({
    RegistryObjectListType.class
})
public class LeafRegistryObjectListType {

    @XmlElements({
        @XmlElement(name = "Organization", type = OrganizationType.class),
        @XmlElement(name = "User", type = UserType.class),
        @XmlElement(name = "SpecificationLink", type = SpecificationLinkType.class),
        @XmlElement(name = "ClassificationScheme", type = ClassificationSchemeType.class),
        @XmlElement(name = "ObjectRef", type = ObjectRefType.class),
        @XmlElement(name = "ExtrinsicObject", type = ExtrinsicObjectType.class),
        @XmlElement(name = "RegistryPackage", type = RegistryPackageType.class),
        @XmlElement(name = "ServiceBinding", type = ServiceBindingType.class),
        @XmlElement(name = "ExternalLink", type = ExternalLinkType.class),
        @XmlElement(name = "ClassificationNode", type = ClassificationNodeType.class),
        @XmlElement(name = "AuditableEvent", type = AuditableEventType.class),
        @XmlElement(name = "Service", type = ServiceType.class),
        @XmlElement(name = "Association", type = AssociationType1 .class),
        @XmlElement(name = "Classification", type = ClassificationType.class),
        @XmlElement(name = "ExternalIdentifier", type = ExternalIdentifierType.class)
    })
    protected List<Object> objectRefOrAssociationOrAuditableEvent;

    /**
     * Gets the value of the objectRefOrAssociationOrAuditableEvent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objectRefOrAssociationOrAuditableEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjectRefOrAssociationOrAuditableEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganizationType }
     * {@link UserType }
     * {@link SpecificationLinkType }
     * {@link ClassificationSchemeType }
     * {@link ObjectRefType }
     * {@link ExtrinsicObjectType }
     * {@link RegistryPackageType }
     * {@link ServiceBindingType }
     * {@link ExternalLinkType }
     * {@link ClassificationNodeType }
     * {@link AuditableEventType }
     * {@link ServiceType }
     * {@link AssociationType1 }
     * {@link ClassificationType }
     * {@link ExternalIdentifierType }
     * 
     * 
     */
    public List<Object> getObjectRefOrAssociationOrAuditableEvent() {
        if (objectRefOrAssociationOrAuditableEvent == null) {
            objectRefOrAssociationOrAuditableEvent = new ArrayList<Object>();
        }
        return this.objectRefOrAssociationOrAuditableEvent;
    }

}
