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
 *       &lt;sequence>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}AgntSine"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}Duty"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}UnableInd"/>
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
    "agntSine",
    "duty",
    "unableInd"
})
@XmlRootElement(name = "AdditionalFareInfo")
public class AdditionalFareInfo implements Serializable
{

    @XmlElement(name = "AgntSine", required = true)
    protected String agntSine;
    @XmlElement(name = "Duty", required = true)
    protected String duty;
    @XmlElement(name = "UnableInd", required = true)
    protected String unableInd;

    /**
     * Gets the value of the agntSine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgntSine() {
        return agntSine;
    }

    /**
     * Sets the value of the agntSine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgntSine(String value) {
        this.agntSine = value;
    }

    /**
     * Gets the value of the duty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuty() {
        return duty;
    }

    /**
     * Sets the value of the duty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuty(String value) {
        this.duty = value;
    }

    /**
     * Gets the value of the unableInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnableInd() {
        return unableInd;
    }

    /**
     * Sets the value of the unableInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnableInd(String value) {
        this.unableInd = value;
    }

}
