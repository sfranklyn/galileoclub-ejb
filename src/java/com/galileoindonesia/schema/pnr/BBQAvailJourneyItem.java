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
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}UniqueKey1"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}UniqueKey2"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}SegSeq"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}Vnd"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}FltNum"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}StartPt"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}EndCity"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}Dt"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}StartTm"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}EndTm"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}Equip"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}Stops"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}DaysDif"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}AirpChg"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}FltConx"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}Avail"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}StartMultiAirp"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}EndMutliAirp"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}Spare1"/>
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
    "uniqueKey1",
    "uniqueKey2",
    "segSeq",
    "vnd",
    "fltNum",
    "startPt",
    "endCity",
    "dt",
    "startTm",
    "endTm",
    "equip",
    "stops",
    "daysDif",
    "airpChg",
    "fltConx",
    "avail",
    "startMultiAirp",
    "endMutliAirp",
    "spare1"
})
@XmlRootElement(name = "BBQAvailJourneyItem")
public class BBQAvailJourneyItem
    implements Serializable
{

    @XmlElement(name = "UniqueKey1", required = true)
    protected String uniqueKey1;
    @XmlElement(name = "UniqueKey2", required = true)
    protected String uniqueKey2;
    @XmlElement(name = "SegSeq", required = true)
    protected String segSeq;
    @XmlElement(name = "Vnd", required = true)
    protected String vnd;
    @XmlElement(name = "FltNum", required = true)
    protected String fltNum;
    @XmlElement(name = "StartPt", required = true)
    protected String startPt;
    @XmlElement(name = "EndCity", required = true)
    protected String endCity;
    @XmlElement(name = "Dt", required = true)
    protected String dt;
    @XmlElement(name = "StartTm", required = true)
    protected String startTm;
    @XmlElement(name = "EndTm", required = true)
    protected String endTm;
    @XmlElement(name = "Equip", required = true)
    protected String equip;
    @XmlElement(name = "Stops", required = true)
    protected String stops;
    @XmlElement(name = "DaysDif", required = true)
    protected String daysDif;
    @XmlElement(name = "AirpChg", required = true)
    protected String airpChg;
    @XmlElement(name = "FltConx", required = true)
    protected String fltConx;
    @XmlElement(name = "Avail", required = true)
    protected String avail;
    @XmlElement(name = "StartMultiAirp", required = true)
    protected String startMultiAirp;
    @XmlElement(name = "EndMutliAirp", required = true)
    protected String endMutliAirp;
    @XmlElement(name = "Spare1", required = true)
    protected String spare1;

    /**
     * Gets the value of the uniqueKey1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueKey1() {
        return uniqueKey1;
    }

    /**
     * Sets the value of the uniqueKey1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueKey1(String value) {
        this.uniqueKey1 = value;
    }

    /**
     * Gets the value of the uniqueKey2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueKey2() {
        return uniqueKey2;
    }

    /**
     * Sets the value of the uniqueKey2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueKey2(String value) {
        this.uniqueKey2 = value;
    }

    /**
     * Gets the value of the segSeq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegSeq() {
        return segSeq;
    }

    /**
     * Sets the value of the segSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegSeq(String value) {
        this.segSeq = value;
    }

    /**
     * Gets the value of the vnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVnd() {
        return vnd;
    }

    /**
     * Sets the value of the vnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVnd(String value) {
        this.vnd = value;
    }

    /**
     * Gets the value of the fltNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFltNum() {
        return fltNum;
    }

    /**
     * Sets the value of the fltNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFltNum(String value) {
        this.fltNum = value;
    }

    /**
     * Gets the value of the startPt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartPt() {
        return startPt;
    }

    /**
     * Sets the value of the startPt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartPt(String value) {
        this.startPt = value;
    }

    /**
     * Gets the value of the endCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndCity() {
        return endCity;
    }

    /**
     * Sets the value of the endCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndCity(String value) {
        this.endCity = value;
    }

    /**
     * Gets the value of the dt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDt() {
        return dt;
    }

    /**
     * Sets the value of the dt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDt(String value) {
        this.dt = value;
    }

    /**
     * Gets the value of the startTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartTm() {
        return startTm;
    }

    /**
     * Sets the value of the startTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTm(String value) {
        this.startTm = value;
    }

    /**
     * Gets the value of the endTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndTm() {
        return endTm;
    }

    /**
     * Sets the value of the endTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndTm(String value) {
        this.endTm = value;
    }

    /**
     * Gets the value of the equip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquip() {
        return equip;
    }

    /**
     * Sets the value of the equip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquip(String value) {
        this.equip = value;
    }

    /**
     * Gets the value of the stops property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStops() {
        return stops;
    }

    /**
     * Sets the value of the stops property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStops(String value) {
        this.stops = value;
    }

    /**
     * Gets the value of the daysDif property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDaysDif() {
        return daysDif;
    }

    /**
     * Sets the value of the daysDif property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDaysDif(String value) {
        this.daysDif = value;
    }

    /**
     * Gets the value of the airpChg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirpChg() {
        return airpChg;
    }

    /**
     * Sets the value of the airpChg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirpChg(String value) {
        this.airpChg = value;
    }

    /**
     * Gets the value of the fltConx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFltConx() {
        return fltConx;
    }

    /**
     * Sets the value of the fltConx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFltConx(String value) {
        this.fltConx = value;
    }

    /**
     * Gets the value of the avail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvail() {
        return avail;
    }

    /**
     * Sets the value of the avail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvail(String value) {
        this.avail = value;
    }

    /**
     * Gets the value of the startMultiAirp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartMultiAirp() {
        return startMultiAirp;
    }

    /**
     * Sets the value of the startMultiAirp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartMultiAirp(String value) {
        this.startMultiAirp = value;
    }

    /**
     * Gets the value of the endMutliAirp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndMutliAirp() {
        return endMutliAirp;
    }

    /**
     * Sets the value of the endMutliAirp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndMutliAirp(String value) {
        this.endMutliAirp = value;
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

}