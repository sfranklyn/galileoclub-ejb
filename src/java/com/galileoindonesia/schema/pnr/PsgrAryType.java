//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-548 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.03.31 at 11:27:25 AM ICT 
//


package com.galileoindonesia.schema.pnr;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PsgrAryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PsgrAryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}PsgrAry"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PsgrAryType", propOrder = {
    "psgrAry"
})
public class PsgrAryType
    implements Serializable
{

    @XmlElement(name = "PsgrAry", required = true)
    protected PsgrAry psgrAry;

    /**
     * Gets the value of the psgrAry property.
     * 
     * @return
     *     possible object is
     *     {@link PsgrAry }
     *     
     */
    public PsgrAry getPsgrAry() {
        return psgrAry;
    }

    /**
     * Sets the value of the psgrAry property.
     * 
     * @param value
     *     allowed object is
     *     {@link PsgrAry }
     *     
     */
    public void setPsgrAry(PsgrAry value) {
        this.psgrAry = value;
    }

}