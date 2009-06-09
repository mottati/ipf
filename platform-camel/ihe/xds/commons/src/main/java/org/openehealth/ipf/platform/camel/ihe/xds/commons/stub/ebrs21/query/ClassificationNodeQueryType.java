//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.9-03/31/2009 04:14 PM(snajper)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.05.19 at 10:15:07 AM CEST 
//


package org.openehealth.ipf.platform.camel.ihe.xds.commons.stub.ebrs21.query;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClassificationNodeQueryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClassificationNodeQueryType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1}RegistryObjectQueryType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1}ClassificationNodeFilter" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1}ClassificationSchemeQuery" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1}ClassificationNodeParentBranch" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1}ClassificationNodeChildrenBranch" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClassificationNodeQueryType", propOrder = {
    "classificationNodeFilter",
    "classificationSchemeQuery",
    "classificationNodeParentBranch",
    "classificationNodeChildrenBranch"
})
public class ClassificationNodeQueryType
    extends RegistryObjectQueryType
{

    @XmlElement(name = "ClassificationNodeFilter")
    protected FilterType classificationNodeFilter;
    @XmlElement(name = "ClassificationSchemeQuery")
    protected ClassificationSchemeQueryType classificationSchemeQuery;
    @XmlElement(name = "ClassificationNodeParentBranch")
    protected ClassificationNodeQueryType classificationNodeParentBranch;
    @XmlElement(name = "ClassificationNodeChildrenBranch")
    protected List<ClassificationNodeQueryType> classificationNodeChildrenBranch;

    /**
     * Gets the value of the classificationNodeFilter property.
     * 
     * @return
     *     possible object is
     *     {@link FilterType }
     *     
     */
    public FilterType getClassificationNodeFilter() {
        return classificationNodeFilter;
    }

    /**
     * Sets the value of the classificationNodeFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterType }
     *     
     */
    public void setClassificationNodeFilter(FilterType value) {
        this.classificationNodeFilter = value;
    }

    /**
     * Gets the value of the classificationSchemeQuery property.
     * 
     * @return
     *     possible object is
     *     {@link ClassificationSchemeQueryType }
     *     
     */
    public ClassificationSchemeQueryType getClassificationSchemeQuery() {
        return classificationSchemeQuery;
    }

    /**
     * Sets the value of the classificationSchemeQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificationSchemeQueryType }
     *     
     */
    public void setClassificationSchemeQuery(ClassificationSchemeQueryType value) {
        this.classificationSchemeQuery = value;
    }

    /**
     * Gets the value of the classificationNodeParentBranch property.
     * 
     * @return
     *     possible object is
     *     {@link ClassificationNodeQueryType }
     *     
     */
    public ClassificationNodeQueryType getClassificationNodeParentBranch() {
        return classificationNodeParentBranch;
    }

    /**
     * Sets the value of the classificationNodeParentBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificationNodeQueryType }
     *     
     */
    public void setClassificationNodeParentBranch(ClassificationNodeQueryType value) {
        this.classificationNodeParentBranch = value;
    }

    /**
     * Gets the value of the classificationNodeChildrenBranch property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classificationNodeChildrenBranch property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassificationNodeChildrenBranch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassificationNodeQueryType }
     * 
     * 
     */
    public List<ClassificationNodeQueryType> getClassificationNodeChildrenBranch() {
        if (classificationNodeChildrenBranch == null) {
            classificationNodeChildrenBranch = new ArrayList<ClassificationNodeQueryType>();
        }
        return this.classificationNodeChildrenBranch;
    }

}
