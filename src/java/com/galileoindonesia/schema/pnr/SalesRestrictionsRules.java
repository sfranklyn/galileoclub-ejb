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
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}UniqueKey"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}QuoteNum"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}FareComponentNum"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}PriceUnitNum"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}Spare1"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}Spare2"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}Spare3"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}Spare4"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}EarliestRsvnDtExists"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}EarliestTkDtExists"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}LatestRsvnDtExists"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}LatestTkDtExists"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}EarliestRsvnDt"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}EarliestTkDt"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}LatestRsvnDt"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}LatestTkDt"/>
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
    "uniqueKey",
    "quoteNum",
    "fareComponentNum",
    "priceUnitNum",
    "spare1",
    "spare2",
    "spare3",
    "spare4",
    "earliestRsvnDtExists",
    "earliestTkDtExists",
    "latestRsvnDtExists",
    "latestTkDtExists",
    "earliestRsvnDt",
    "earliestTkDt",
    "latestRsvnDt",
    "latestTkDt"
})
@XmlRootElement(name = "SalesRestrictionsRules")
public class SalesRestrictionsRules
    implements Serializable
{

    @XmlElement(name = "UniqueKey", required = true)
    protected String uniqueKey;
    @XmlElement(name = "QuoteNum", required = true)
    protected String quoteNum;
    @XmlElement(name = "FareComponentNum", required = true)
    protected String fareComponentNum;
    @XmlElement(name = "PriceUnitNum", required = true)
    protected String priceUnitNum;
    @XmlElement(name = "Spare1", required = true)
    protected String spare1;
    @XmlElement(name = "Spare2", required = true)
    protected String spare2;
    @XmlElement(name = "Spare3", required = true)
    protected String spare3;
    @XmlElement(name = "Spare4", required = true)
    protected String spare4;
    @XmlElement(name = "EarliestRsvnDtExists", required = true)
    protected String earliestRsvnDtExists;
    @XmlElement(name = "EarliestTkDtExists", required = true)
    protected String earliestTkDtExists;
    @XmlElement(name = "LatestRsvnDtExists", required = true)
    protected String latestRsvnDtExists;
    @XmlElement(name = "LatestTkDtExists", required = true)
    protected String latestTkDtExists;
    @XmlElement(name = "EarliestRsvnDt", required = true)
    protected String earliestRsvnDt;
    @XmlElement(name = "EarliestTkDt", required = true)
    protected String earliestTkDt;
    @XmlElement(name = "LatestRsvnDt", required = true)
    protected String latestRsvnDt;
    @XmlElement(name = "LatestTkDt", required = true)
    protected String latestTkDt;

    /**
     * Gets the value of the uniqueKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueKey() {
        return uniqueKey;
    }

    /**
     * Sets the value of the uniqueKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueKey(String value) {
        this.uniqueKey = value;
    }

    /**
     * Gets the value of the quoteNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuoteNum() {
        return quoteNum;
    }

    /**
     * Sets the value of the quoteNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuoteNum(String value) {
        this.quoteNum = value;
    }

    /**
     * Gets the value of the fareComponentNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareComponentNum() {
        return fareComponentNum;
    }

    /**
     * Sets the value of the fareComponentNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareComponentNum(String value) {
        this.fareComponentNum = value;
    }

    /**
     * Gets the value of the priceUnitNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceUnitNum() {
        return priceUnitNum;
    }

    /**
     * Sets the value of the priceUnitNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceUnitNum(String value) {
        this.priceUnitNum = value;
    }

    /**
     * Gets the value of the spare1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpare1() {
        return spare1;
    }

    /**
     * Sets the value of the spare1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpare1(String value) {
        this.spare1 = value;
    }

    /**
     * Gets the value of the spare2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpare2() {
        return spare2;
    }

    /**
     * Sets the value of the spare2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpare2(String value) {
        this.spare2 = value;
    }

    /**
     * Gets the value of the spare3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpare3() {
        return spare3;
    }

    /**
     * Sets the value of the spare3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpare3(String value) {
        this.spare3 = value;
    }

    /**
     * Gets the value of the spare4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpare4() {
        return spare4;
    }

    /**
     * Sets the value of the spare4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpare4(String value) {
        this.spare4 = value;
    }

    /**
     * Gets the value of the earliestRsvnDtExists property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEarliestRsvnDtExists() {
        return earliestRsvnDtExists;
    }

    /**
     * Sets the value of the earliestRsvnDtExists property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEarliestRsvnDtExists(String value) {
        this.earliestRsvnDtExists = value;
    }

    /**
     * Gets the value of the earliestTkDtExists property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEarliestTkDtExists() {
        return earliestTkDtExists;
    }

    /**
     * Sets the value of the earliestTkDtExists property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEarliestTkDtExists(String value) {
        this.earliestTkDtExists = value;
    }

    /**
     * Gets the value of the latestRsvnDtExists property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatestRsvnDtExists() {
        return latestRsvnDtExists;
    }

    /**
     * Sets the value of the latestRsvnDtExists property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatestRsvnDtExists(String value) {
        this.latestRsvnDtExists = value;
    }

    /**
     * Gets the value of the latestTkDtExists property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatestTkDtExists() {
        return latestTkDtExists;
    }

    /**
     * Sets the value of the latestTkDtExists property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatestTkDtExists(String value) {
        this.latestTkDtExists = value;
    }

    /**
     * Gets the value of the earliestRsvnDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEarliestRsvnDt() {
        return earliestRsvnDt;
    }

    /**
     * Sets the value of the earliestRsvnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEarliestRsvnDt(String value) {
        this.earliestRsvnDt = value;
    }

    /**
     * Gets the value of the earliestTkDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEarliestTkDt() {
        return earliestTkDt;
    }

    /**
     * Sets the value of the earliestTkDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEarliestTkDt(String value) {
        this.earliestTkDt = value;
    }

    /**
     * Gets the value of the latestRsvnDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatestRsvnDt() {
        return latestRsvnDt;
    }

    /**
     * Sets the value of the latestRsvnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatestRsvnDt(String value) {
        this.latestRsvnDt = value;
    }

    /**
     * Gets the value of the latestTkDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatestTkDt() {
        return latestTkDt;
    }

    /**
     * Sets the value of the latestTkDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatestTkDt(String value) {
        this.latestTkDt = value;
    }

}