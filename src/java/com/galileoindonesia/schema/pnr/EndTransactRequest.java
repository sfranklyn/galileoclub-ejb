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
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}ETInd"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}EmailType" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}SpareInd"/>
 *           &lt;sequence>
 *             &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}CustPNRName"/>
 *             &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}ConsRetrvKey"/>
 *             &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}LangPref"/>
 *             &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}SuperPNRInd"/>
 *             &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}ContIntInd"/>
 *             &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}IntContPrgDt"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}RcvdFrom"/>
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
    "etInd",
    "emailType",
    "spareInd",
    "custPNRName",
    "consRetrvKey",
    "langPref",
    "superPNRInd",
    "contIntInd",
    "intContPrgDt",
    "rcvdFrom"
})
@XmlRootElement(name = "EndTransactRequest")
public class EndTransactRequest
    implements Serializable
{

    @XmlElement(name = "ETInd", required = true)
    protected String etInd;
    @XmlElement(name = "EmailType")
    protected String emailType;
    @XmlElement(name = "SpareInd")
    protected String spareInd;
    @XmlElement(name = "CustPNRName")
    protected String custPNRName;
    @XmlElement(name = "ConsRetrvKey")
    protected String consRetrvKey;
    @XmlElement(name = "LangPref")
    protected String langPref;
    @XmlElement(name = "SuperPNRInd")
    protected String superPNRInd;
    @XmlElement(name = "ContIntInd")
    protected String contIntInd;
    @XmlElement(name = "IntContPrgDt")
    protected String intContPrgDt;
    @XmlElement(name = "RcvdFrom", required = true)
    protected String rcvdFrom;

    /**
     * Gets the value of the etInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getETInd() {
        return etInd;
    }

    /**
     * Sets the value of the etInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setETInd(String value) {
        this.etInd = value;
    }

    /**
     * Gets the value of the emailType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailType() {
        return emailType;
    }

    /**
     * Sets the value of the emailType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailType(String value) {
        this.emailType = value;
    }

    /**
     * Gets the value of the spareInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpareInd() {
        return spareInd;
    }

    /**
     * Sets the value of the spareInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpareInd(String value) {
        this.spareInd = value;
    }

    /**
     * Gets the value of the custPNRName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustPNRName() {
        return custPNRName;
    }

    /**
     * Sets the value of the custPNRName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustPNRName(String value) {
        this.custPNRName = value;
    }

    /**
     * Gets the value of the consRetrvKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsRetrvKey() {
        return consRetrvKey;
    }

    /**
     * Sets the value of the consRetrvKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsRetrvKey(String value) {
        this.consRetrvKey = value;
    }

    /**
     * Gets the value of the langPref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLangPref() {
        return langPref;
    }

    /**
     * Sets the value of the langPref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLangPref(String value) {
        this.langPref = value;
    }

    /**
     * Gets the value of the superPNRInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuperPNRInd() {
        return superPNRInd;
    }

    /**
     * Sets the value of the superPNRInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuperPNRInd(String value) {
        this.superPNRInd = value;
    }

    /**
     * Gets the value of the contIntInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContIntInd() {
        return contIntInd;
    }

    /**
     * Sets the value of the contIntInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContIntInd(String value) {
        this.contIntInd = value;
    }

    /**
     * Gets the value of the intContPrgDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntContPrgDt() {
        return intContPrgDt;
    }

    /**
     * Sets the value of the intContPrgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntContPrgDt(String value) {
        this.intContPrgDt = value;
    }

    /**
     * Gets the value of the rcvdFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcvdFrom() {
        return rcvdFrom;
    }

    /**
     * Sets the value of the rcvdFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRcvdFrom(String value) {
        this.rcvdFrom = value;
    }

}
