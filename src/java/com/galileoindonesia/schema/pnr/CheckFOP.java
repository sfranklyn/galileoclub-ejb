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
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}ID"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}Type"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}Currency"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}Amt"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}AdditionalInfoAry"/>
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
    "id",
    "type",
    "currency",
    "amt",
    "additionalInfoAry"
})
@XmlRootElement(name = "CheckFOP")
public class CheckFOP implements Serializable
{

    @XmlElement(name = "ID", required = true)
    protected String id;
    @XmlElement(name = "Type", required = true)
    protected String type;
    @XmlElement(name = "Currency", required = true)
    protected String currency;
    @XmlElement(name = "Amt", required = true)
    protected String amt;
    @XmlElement(name = "AdditionalInfoAry", required = true)
    protected AdditionalInfoAry additionalInfoAry;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmt(String value) {
        this.amt = value;
    }

    /**
     * Gets the value of the additionalInfoAry property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalInfoAry }
     *     
     */
    public AdditionalInfoAry getAdditionalInfoAry() {
        return additionalInfoAry;
    }

    /**
     * Sets the value of the additionalInfoAry property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalInfoAry }
     *     
     */
    public void setAdditionalInfoAry(AdditionalInfoAry value) {
        this.additionalInfoAry = value;
    }

}