//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.9-03/31/2009 04:14 PM(snajper)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.05.19 at 10:15:07 AM CEST 
//


package org.openehealth.ipf.platform.camel.ihe.xds.commons.stub.ebrs21.rs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.openehealth.ipf.platform.camel.ihe.xds.commons.stub.ebrs21.rim.ObjectRefList;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1}ObjectRefList"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "objectRefList"
})
@XmlRootElement(name = "ApproveObjectsRequest")
public class ApproveObjectsRequest {

    @XmlElement(name = "ObjectRefList", namespace = "urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1", required = true)
    protected ObjectRefList objectRefList;

    /**
     * Gets the value of the objectRefList property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRefList }
     *     
     */
    public ObjectRefList getObjectRefList() {
        return objectRefList;
    }

    /**
     * Sets the value of the objectRefList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRefList }
     *     
     */
    public void setObjectRefList(ObjectRefList value) {
        this.objectRefList = value;
    }

}
