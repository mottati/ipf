//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.9-03/31/2009 04:14 PM(snajper)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.05.19 at 10:15:07 AM CEST 
//


package org.openehealth.ipf.platform.camel.ihe.xds.commons.stub.ebrs21.rs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.openehealth.ipf.platform.camel.ihe.xds.commons.stub.ebrs21.query.AdhocQueryResponse;
import org.openehealth.ipf.platform.camel.ihe.xds.commons.stub.ebrs21.query.GetContentResponse;


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
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1}AdhocQueryResponse"/>
 *           &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1}GetContentResponse"/>
 *         &lt;/choice>
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:registry:xsd:2.1}RegistryErrorList" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="status" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="Success"/>
 *             &lt;enumeration value="Failure"/>
 *             &lt;enumeration value="Unavailable"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "adhocQueryResponse",
    "getContentResponse",
    "registryErrorList"
})
@XmlRootElement(name = "RegistryResponse")
public class RegistryResponse {

    @XmlElement(name = "AdhocQueryResponse", namespace = "urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1")
    protected AdhocQueryResponse adhocQueryResponse;
    @XmlElement(name = "GetContentResponse", namespace = "urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1")
    protected GetContentResponse getContentResponse;
    @XmlElement(name = "RegistryErrorList")
    protected RegistryErrorList registryErrorList;
    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String status;

    /**
     * Gets the value of the adhocQueryResponse property.
     * 
     * @return
     *     possible object is
     *     {@link AdhocQueryResponse }
     *     
     */
    public AdhocQueryResponse getAdhocQueryResponse() {
        return adhocQueryResponse;
    }

    /**
     * Sets the value of the adhocQueryResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdhocQueryResponse }
     *     
     */
    public void setAdhocQueryResponse(AdhocQueryResponse value) {
        this.adhocQueryResponse = value;
    }

    /**
     * Gets the value of the getContentResponse property.
     * 
     * @return
     *     possible object is
     *     {@link GetContentResponse }
     *     
     */
    public GetContentResponse getGetContentResponse() {
        return getContentResponse;
    }

    /**
     * Sets the value of the getContentResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetContentResponse }
     *     
     */
    public void setGetContentResponse(GetContentResponse value) {
        this.getContentResponse = value;
    }

    /**
     * Gets the value of the registryErrorList property.
     * 
     * @return
     *     possible object is
     *     {@link RegistryErrorList }
     *     
     */
    public RegistryErrorList getRegistryErrorList() {
        return registryErrorList;
    }

    /**
     * Sets the value of the registryErrorList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistryErrorList }
     *     
     */
    public void setRegistryErrorList(RegistryErrorList value) {
        this.registryErrorList = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
