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
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}SegNum"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}Dt"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}AirV"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}NumPsgrs"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}StartAirp"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}EndAirp"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}StartTm"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}BIC"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}FlownInd"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}StopoverIgnoreInd"/>
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
    "segNum",
    "status",
    "dt",
    "airV",
    "numPsgrs",
    "startAirp",
    "endAirp",
    "startTm",
    "bic",
    "flownInd",
    "stopoverIgnoreInd"
})
@XmlRootElement(name = "OpenAirSeg")
public class OpenAirSeg implements Serializable
{

    @XmlElement(name = "SegNum", required = true)
    protected String segNum;
    @XmlElement(name = "Status", required = true)
    protected String status;
    @XmlElement(name = "Dt", required = true)
    protected String dt;
    @XmlElement(name = "AirV", required = true)
    protected String airV;
    @XmlElement(name = "NumPsgrs", required = true)
    protected String numPsgrs;
    @XmlElement(name = "StartAirp", required = true)
    protected String startAirp;
    @XmlElement(name = "EndAirp", required = true)
    protected String endAirp;
    @XmlElement(name = "StartTm", required = true)
    protected String startTm;
    @XmlElement(name = "BIC", required = true)
    protected String bic;
    @XmlElement(name = "FlownInd", required = true)
    protected String flownInd;
    @XmlElement(name = "StopoverIgnoreInd", required = true)
    protected String stopoverIgnoreInd;

    /**
     * Gets the value of the segNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegNum() {
        return segNum;
    }

    /**
     * Sets the value of the segNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegNum(String value) {
        this.segNum = value;
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
     * Gets the value of the numPsgrs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumPsgrs() {
        return numPsgrs;
    }

    /**
     * Sets the value of the numPsgrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumPsgrs(String value) {
        this.numPsgrs = value;
    }

    /**
     * Gets the value of the startAirp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartAirp() {
        return startAirp;
    }

    /**
     * Sets the value of the startAirp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartAirp(String value) {
        this.startAirp = value;
    }

    /**
     * Gets the value of the endAirp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndAirp() {
        return endAirp;
    }

    /**
     * Sets the value of the endAirp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndAirp(String value) {
        this.endAirp = value;
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
     * Gets the value of the flownInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlownInd() {
        return flownInd;
    }

    /**
     * Sets the value of the flownInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlownInd(String value) {
        this.flownInd = value;
    }

    /**
     * Gets the value of the stopoverIgnoreInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStopoverIgnoreInd() {
        return stopoverIgnoreInd;
    }

    /**
     * Sets the value of the stopoverIgnoreInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStopoverIgnoreInd(String value) {
        this.stopoverIgnoreInd = value;
    }

}
