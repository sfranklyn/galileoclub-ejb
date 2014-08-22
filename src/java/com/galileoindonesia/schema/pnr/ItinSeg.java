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
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}AirV"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}FltNum"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}StartDt"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}StartPt"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}EndPt"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}SegType"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}DayDifferential"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}NoStopAtBoardPt"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}BreakInJrny"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}BreakNoDirectService"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}FictitiousPt"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}MoreDistantPt"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}FQSGenFictitiousPt"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}StartCityNotPrevOffCity"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}Spare1"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}StartTm"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}EndTm"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}BIC"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}Spare2"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}Spare3"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}Mile"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}IntlStartCity"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}IntlEndCity"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}Spare4"/>
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
    "airV",
    "fltNum",
    "startDt",
    "startPt",
    "endPt",
    "segType",
    "dayDifferential",
    "noStopAtBoardPt",
    "breakInJrny",
    "breakNoDirectService",
    "fictitiousPt",
    "moreDistantPt",
    "fqsGenFictitiousPt",
    "startCityNotPrevOffCity",
    "spare1",
    "startTm",
    "endTm",
    "bic",
    "spare2",
    "spare3",
    "mile",
    "intlStartCity",
    "intlEndCity",
    "spare4"
})
@XmlRootElement(name = "ItinSeg")
public class ItinSeg
    implements Serializable
{

    @XmlElement(name = "UniqueKey", required = true)
    protected String uniqueKey;
    @XmlElement(name = "AirV", required = true)
    protected String airV;
    @XmlElement(name = "FltNum", required = true)
    protected String fltNum;
    @XmlElement(name = "StartDt", required = true)
    protected String startDt;
    @XmlElement(name = "StartPt", required = true)
    protected String startPt;
    @XmlElement(name = "EndPt", required = true)
    protected String endPt;
    @XmlElement(name = "SegType", required = true)
    protected String segType;
    @XmlElement(name = "DayDifferential", required = true)
    protected String dayDifferential;
    @XmlElement(name = "NoStopAtBoardPt", required = true)
    protected String noStopAtBoardPt;
    @XmlElement(name = "BreakInJrny", required = true)
    protected String breakInJrny;
    @XmlElement(name = "BreakNoDirectService", required = true)
    protected String breakNoDirectService;
    @XmlElement(name = "FictitiousPt", required = true)
    protected String fictitiousPt;
    @XmlElement(name = "MoreDistantPt", required = true)
    protected String moreDistantPt;
    @XmlElement(name = "FQSGenFictitiousPt", required = true)
    protected String fqsGenFictitiousPt;
    @XmlElement(name = "StartCityNotPrevOffCity", required = true)
    protected String startCityNotPrevOffCity;
    @XmlElement(name = "Spare1", required = true)
    protected String spare1;
    @XmlElement(name = "StartTm", required = true)
    protected String startTm;
    @XmlElement(name = "EndTm", required = true)
    protected String endTm;
    @XmlElement(name = "BIC", required = true)
    protected String bic;
    @XmlElement(name = "Spare2", required = true)
    protected String spare2;
    @XmlElement(name = "Spare3", required = true)
    protected String spare3;
    @XmlElement(name = "Mile", required = true)
    protected String mile;
    @XmlElement(name = "IntlStartCity", required = true)
    protected String intlStartCity;
    @XmlElement(name = "IntlEndCity", required = true)
    protected String intlEndCity;
    @XmlElement(name = "Spare4", required = true)
    protected String spare4;

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
     * Gets the value of the startDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDt() {
        return startDt;
    }

    /**
     * Sets the value of the startDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDt(String value) {
        this.startDt = value;
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
     * Gets the value of the endPt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndPt() {
        return endPt;
    }

    /**
     * Sets the value of the endPt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndPt(String value) {
        this.endPt = value;
    }

    /**
     * Gets the value of the segType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegType() {
        return segType;
    }

    /**
     * Sets the value of the segType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegType(String value) {
        this.segType = value;
    }

    /**
     * Gets the value of the dayDifferential property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDayDifferential() {
        return dayDifferential;
    }

    /**
     * Sets the value of the dayDifferential property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDayDifferential(String value) {
        this.dayDifferential = value;
    }

    /**
     * Gets the value of the noStopAtBoardPt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoStopAtBoardPt() {
        return noStopAtBoardPt;
    }

    /**
     * Sets the value of the noStopAtBoardPt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoStopAtBoardPt(String value) {
        this.noStopAtBoardPt = value;
    }

    /**
     * Gets the value of the breakInJrny property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBreakInJrny() {
        return breakInJrny;
    }

    /**
     * Sets the value of the breakInJrny property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBreakInJrny(String value) {
        this.breakInJrny = value;
    }

    /**
     * Gets the value of the breakNoDirectService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBreakNoDirectService() {
        return breakNoDirectService;
    }

    /**
     * Sets the value of the breakNoDirectService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBreakNoDirectService(String value) {
        this.breakNoDirectService = value;
    }

    /**
     * Gets the value of the fictitiousPt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFictitiousPt() {
        return fictitiousPt;
    }

    /**
     * Sets the value of the fictitiousPt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFictitiousPt(String value) {
        this.fictitiousPt = value;
    }

    /**
     * Gets the value of the moreDistantPt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoreDistantPt() {
        return moreDistantPt;
    }

    /**
     * Sets the value of the moreDistantPt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoreDistantPt(String value) {
        this.moreDistantPt = value;
    }

    /**
     * Gets the value of the fqsGenFictitiousPt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFQSGenFictitiousPt() {
        return fqsGenFictitiousPt;
    }

    /**
     * Sets the value of the fqsGenFictitiousPt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFQSGenFictitiousPt(String value) {
        this.fqsGenFictitiousPt = value;
    }

    /**
     * Gets the value of the startCityNotPrevOffCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartCityNotPrevOffCity() {
        return startCityNotPrevOffCity;
    }

    /**
     * Sets the value of the startCityNotPrevOffCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartCityNotPrevOffCity(String value) {
        this.startCityNotPrevOffCity = value;
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
     * Gets the value of the bic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBIC() {
        return bic;
    }

    /**
     * Sets the value of the bic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBIC(String value) {
        this.bic = value;
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
     * Gets the value of the mile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMile() {
        return mile;
    }

    /**
     * Sets the value of the mile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMile(String value) {
        this.mile = value;
    }

    /**
     * Gets the value of the intlStartCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntlStartCity() {
        return intlStartCity;
    }

    /**
     * Sets the value of the intlStartCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntlStartCity(String value) {
        this.intlStartCity = value;
    }

    /**
     * Gets the value of the intlEndCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntlEndCity() {
        return intlEndCity;
    }

    /**
     * Sets the value of the intlEndCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntlEndCity(String value) {
        this.intlEndCity = value;
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

}