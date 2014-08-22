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
 *         &lt;sequence minOccurs="0">
 *           &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}SellCity"/>
 *           &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}TktCity"/>
 *           &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}AltCurrency"/>
 *           &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}EquivCurrency"/>
 *           &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}TkDt"/>
 *           &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}BkDtOverride"/>
 *           &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}EUROverride"/>
 *           &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}LCUOverride"/>
 *           &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}TkType"/>
 *           &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}AltCitiesRequired"/>
 *           &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}AltDatesRequired"/>
 *           &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}NetFaresOnly"/>
 *           &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}TkAgncyPCC"/>
 *         &lt;/sequence>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}RulesProcess"/>
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
    "sellCity",
    "tktCity",
    "altCurrency",
    "equivCurrency",
    "tkDt",
    "bkDtOverride",
    "eurOverride",
    "lcuOverride",
    "tkType",
    "altCitiesRequired",
    "altDatesRequired",
    "netFaresOnly",
    "tkAgncyPCC",
    "rulesProcess"
})
@XmlRootElement(name = "GenQuoteInfo")
public class GenQuoteInfo implements Serializable
{

    @XmlElement(name = "SellCity")
    protected String sellCity;
    @XmlElement(name = "TktCity")
    protected String tktCity;
    @XmlElement(name = "AltCurrency")
    protected String altCurrency;
    @XmlElement(name = "EquivCurrency")
    protected String equivCurrency;
    @XmlElement(name = "TkDt")
    protected String tkDt;
    @XmlElement(name = "BkDtOverride")
    protected String bkDtOverride;
    @XmlElement(name = "EUROverride")
    protected String eurOverride;
    @XmlElement(name = "LCUOverride")
    protected String lcuOverride;
    @XmlElement(name = "TkType")
    protected String tkType;
    @XmlElement(name = "AltCitiesRequired")
    protected String altCitiesRequired;
    @XmlElement(name = "AltDatesRequired")
    protected String altDatesRequired;
    @XmlElement(name = "NetFaresOnly")
    protected String netFaresOnly;
    @XmlElement(name = "TkAgncyPCC")
    protected String tkAgncyPCC;
    @XmlElement(name = "RulesProcess", required = true)
    protected String rulesProcess;

    /**
     * Gets the value of the sellCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellCity() {
        return sellCity;
    }

    /**
     * Sets the value of the sellCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellCity(String value) {
        this.sellCity = value;
    }

    /**
     * Gets the value of the tktCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTktCity() {
        return tktCity;
    }

    /**
     * Sets the value of the tktCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTktCity(String value) {
        this.tktCity = value;
    }

    /**
     * Gets the value of the altCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltCurrency() {
        return altCurrency;
    }

    /**
     * Sets the value of the altCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltCurrency(String value) {
        this.altCurrency = value;
    }

    /**
     * Gets the value of the equivCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquivCurrency() {
        return equivCurrency;
    }

    /**
     * Sets the value of the equivCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquivCurrency(String value) {
        this.equivCurrency = value;
    }

    /**
     * Gets the value of the tkDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTkDt() {
        return tkDt;
    }

    /**
     * Sets the value of the tkDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTkDt(String value) {
        this.tkDt = value;
    }

    /**
     * Gets the value of the bkDtOverride property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBkDtOverride() {
        return bkDtOverride;
    }

    /**
     * Sets the value of the bkDtOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBkDtOverride(String value) {
        this.bkDtOverride = value;
    }

    /**
     * Gets the value of the eurOverride property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEUROverride() {
        return eurOverride;
    }

    /**
     * Sets the value of the eurOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEUROverride(String value) {
        this.eurOverride = value;
    }

    /**
     * Gets the value of the lcuOverride property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLCUOverride() {
        return lcuOverride;
    }

    /**
     * Sets the value of the lcuOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLCUOverride(String value) {
        this.lcuOverride = value;
    }

    /**
     * Gets the value of the tkType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTkType() {
        return tkType;
    }

    /**
     * Sets the value of the tkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTkType(String value) {
        this.tkType = value;
    }

    /**
     * Gets the value of the altCitiesRequired property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltCitiesRequired() {
        return altCitiesRequired;
    }

    /**
     * Sets the value of the altCitiesRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltCitiesRequired(String value) {
        this.altCitiesRequired = value;
    }

    /**
     * Gets the value of the altDatesRequired property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltDatesRequired() {
        return altDatesRequired;
    }

    /**
     * Sets the value of the altDatesRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltDatesRequired(String value) {
        this.altDatesRequired = value;
    }

    /**
     * Gets the value of the netFaresOnly property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetFaresOnly() {
        return netFaresOnly;
    }

    /**
     * Sets the value of the netFaresOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetFaresOnly(String value) {
        this.netFaresOnly = value;
    }

    /**
     * Gets the value of the tkAgncyPCC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTkAgncyPCC() {
        return tkAgncyPCC;
    }

    /**
     * Sets the value of the tkAgncyPCC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTkAgncyPCC(String value) {
        this.tkAgncyPCC = value;
    }

    /**
     * Gets the value of the rulesProcess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRulesProcess() {
        return rulesProcess;
    }

    /**
     * Sets the value of the rulesProcess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRulesProcess(String value) {
        this.rulesProcess = value;
    }

}