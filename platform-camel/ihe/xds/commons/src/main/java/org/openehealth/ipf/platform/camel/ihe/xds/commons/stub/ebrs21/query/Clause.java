//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.9-03/31/2009 04:14 PM(snajper)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.05.19 at 10:15:07 AM CEST 
//


package org.openehealth.ipf.platform.camel.ihe.xds.commons.stub.ebrs21.query;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1}SimpleClause"/>
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:query:xsd:2.1}CompoundClause"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "simpleClause",
    "compoundClause"
})
@XmlRootElement(name = "Clause")
public class Clause {

    @XmlElement(name = "SimpleClause")
    protected SimpleClause simpleClause;
    @XmlElement(name = "CompoundClause")
    protected CompoundClause compoundClause;

    /**
     * Gets the value of the simpleClause property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleClause }
     *     
     */
    public SimpleClause getSimpleClause() {
        return simpleClause;
    }

    /**
     * Sets the value of the simpleClause property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleClause }
     *     
     */
    public void setSimpleClause(SimpleClause value) {
        this.simpleClause = value;
    }

    /**
     * Gets the value of the compoundClause property.
     * 
     * @return
     *     possible object is
     *     {@link CompoundClause }
     *     
     */
    public CompoundClause getCompoundClause() {
        return compoundClause;
    }

    /**
     * Sets the value of the compoundClause property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompoundClause }
     *     
     */
    public void setCompoundClause(CompoundClause value) {
        this.compoundClause = value;
    }

}
