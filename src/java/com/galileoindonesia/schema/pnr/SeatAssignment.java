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
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}LNameNum"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}PsgrNum"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}AbsNameNum"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}Locn"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}AttribAry"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}Comment"/>
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
    "lNameNum",
    "psgrNum",
    "absNameNum",
    "status",
    "locn",
    "attribAry",
    "comment"
})
@XmlRootElement(name = "SeatAssignment")
public class SeatAssignment implements Serializable
{

    @XmlElement(name = "LNameNum", required = true)
    protected String lNameNum;
    @XmlElement(name = "PsgrNum", required = true)
    protected String psgrNum;
    @XmlElement(name = "AbsNameNum", required = true)
    protected String absNameNum;
    @XmlElement(name = "Status", required = true)
    protected String status;
    @XmlElement(name = "Locn", required = true)
    protected String locn;
    @XmlElement(name = "AttribAry", required = true)
    protected AttribAry attribAry;
    @XmlElement(name = "Comment", required = true)
    protected String comment;

    /**
     * Gets the value of the lNameNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLNameNum() {
        return lNameNum;
    }

    /**
     * Sets the value of the lNameNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLNameNum(String value) {
        this.lNameNum = value;
    }

    /**
     * Gets the value of the psgrNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPsgrNum() {
        return psgrNum;
    }

    /**
     * Sets the value of the psgrNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPsgrNum(String value) {
        this.psgrNum = value;
    }

    /**
     * Gets the value of the absNameNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbsNameNum() {
        return absNameNum;
    }

    /**
     * Sets the value of the absNameNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbsNameNum(String value) {
        this.absNameNum = value;
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

    /**
     * Gets the value of the locn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocn() {
        return locn;
    }

    /**
     * Sets the value of the locn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocn(String value) {
        this.locn = value;
    }

    /**
     * Gets the value of the attribAry property.
     * 
     * @return
     *     possible object is
     *     {@link AttribAry }
     *     
     */
    public AttribAry getAttribAry() {
        return attribAry;
    }

    /**
     * Sets the value of the attribAry property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttribAry }
     *     
     */
    public void setAttribAry(AttribAry value) {
        this.attribAry = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

}
