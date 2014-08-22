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
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}NegotiatedRate"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}CDAcct"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}CCV"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}CCAcct"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}ExpYear"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}ExpMonth"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}SpclInfo"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}AirV"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}AirFreqCustAcct"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}HtlV"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}HtlFreqCustAcct"/>
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
    "negotiatedRate",
    "cdAcct",
    "ccv",
    "ccAcct",
    "expYear",
    "expMonth",
    "spclInfo",
    "airV",
    "airFreqCustAcct",
    "htlV",
    "htlFreqCustAcct"
})
@XmlRootElement(name = "HtlSellOpts")
public class HtlSellOpts
    implements Serializable
{

    @XmlElement(name = "NegotiatedRate", required = true)
    protected String negotiatedRate;
    @XmlElement(name = "CDAcct", required = true)
    protected String cdAcct;
    @XmlElement(name = "CCV", required = true)
    protected String ccv;
    @XmlElement(name = "CCAcct", required = true)
    protected String ccAcct;
    @XmlElement(name = "ExpYear", required = true)
    protected String expYear;
    @XmlElement(name = "ExpMonth", required = true)
    protected String expMonth;
    @XmlElement(name = "SpclInfo", required = true)
    protected String spclInfo;
    @XmlElement(name = "AirV", required = true)
    protected String airV;
    @XmlElement(name = "AirFreqCustAcct", required = true)
    protected String airFreqCustAcct;
    @XmlElement(name = "HtlV", required = true)
    protected String htlV;
    @XmlElement(name = "HtlFreqCustAcct", required = true)
    protected String htlFreqCustAcct;

    /**
     * Gets the value of the negotiatedRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNegotiatedRate() {
        return negotiatedRate;
    }

    /**
     * Sets the value of the negotiatedRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNegotiatedRate(String value) {
        this.negotiatedRate = value;
    }

    /**
     * Gets the value of the cdAcct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDAcct() {
        return cdAcct;
    }

    /**
     * Sets the value of the cdAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDAcct(String value) {
        this.cdAcct = value;
    }

    /**
     * Gets the value of the ccv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCV() {
        return ccv;
    }

    /**
     * Sets the value of the ccv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCV(String value) {
        this.ccv = value;
    }

    /**
     * Gets the value of the ccAcct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCAcct() {
        return ccAcct;
    }

    /**
     * Sets the value of the ccAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCAcct(String value) {
        this.ccAcct = value;
    }

    /**
     * Gets the value of the expYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpYear() {
        return expYear;
    }

    /**
     * Sets the value of the expYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpYear(String value) {
        this.expYear = value;
    }

    /**
     * Gets the value of the expMonth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpMonth() {
        return expMonth;
    }

    /**
     * Sets the value of the expMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpMonth(String value) {
        this.expMonth = value;
    }

    /**
     * Gets the value of the spclInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpclInfo() {
        return spclInfo;
    }

    /**
     * Sets the value of the spclInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpclInfo(String value) {
        this.spclInfo = value;
    }

    /**
     * Gets the value of the airV property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirV() {
        return airV;
    }

    /**
     * Sets the value of the airV property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirV(String value) {
        this.airV = value;
    }

    /**
     * Gets the value of the airFreqCustAcct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirFreqCustAcct() {
        return airFreqCustAcct;
    }

    /**
     * Sets the value of the airFreqCustAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirFreqCustAcct(String value) {
        this.airFreqCustAcct = value;
    }

    /**
     * Gets the value of the htlV property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHtlV() {
        return htlV;
    }

    /**
     * Sets the value of the htlV property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHtlV(String value) {
        this.htlV = value;
    }

    /**
     * Gets the value of the htlFreqCustAcct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHtlFreqCustAcct() {
        return htlFreqCustAcct;
    }

    /**
     * Sets the value of the htlFreqCustAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHtlFreqCustAcct(String value) {
        this.htlFreqCustAcct = value;
    }

}