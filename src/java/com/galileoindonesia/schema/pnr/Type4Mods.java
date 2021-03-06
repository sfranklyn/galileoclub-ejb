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
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}SpclCondInd"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}FIC"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}OWFare"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}RTFare"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}AirV1"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}AirV2"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}AirV3"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}AirV4"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}Via1"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}Via2"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}FareCabinClsSeg"/>
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
    "spclCondInd",
    "fic",
    "owFare",
    "rtFare",
    "airV1",
    "airV2",
    "airV3",
    "airV4",
    "via1",
    "via2",
    "fareCabinClsSeg"
})
@XmlRootElement(name = "Type4Mods")
public class Type4Mods
    implements Serializable
{

    @XmlElement(name = "SpclCondInd", required = true)
    protected String spclCondInd;
    @XmlElement(name = "FIC", required = true)
    protected String fic;
    @XmlElement(name = "OWFare", required = true)
    protected String owFare;
    @XmlElement(name = "RTFare", required = true)
    protected String rtFare;
    @XmlElement(name = "AirV1", required = true)
    protected String airV1;
    @XmlElement(name = "AirV2", required = true)
    protected String airV2;
    @XmlElement(name = "AirV3", required = true)
    protected String airV3;
    @XmlElement(name = "AirV4", required = true)
    protected String airV4;
    @XmlElement(name = "Via1", required = true)
    protected String via1;
    @XmlElement(name = "Via2", required = true)
    protected String via2;
    @XmlElement(name = "FareCabinClsSeg", required = true)
    protected String fareCabinClsSeg;

    /**
     * Gets the value of the spclCondInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpclCondInd() {
        return spclCondInd;
    }

    /**
     * Sets the value of the spclCondInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpclCondInd(String value) {
        this.spclCondInd = value;
    }

    /**
     * Gets the value of the fic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIC() {
        return fic;
    }

    /**
     * Sets the value of the fic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIC(String value) {
        this.fic = value;
    }

    /**
     * Gets the value of the owFare property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOWFare() {
        return owFare;
    }

    /**
     * Sets the value of the owFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOWFare(String value) {
        this.owFare = value;
    }

    /**
     * Gets the value of the rtFare property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRTFare() {
        return rtFare;
    }

    /**
     * Sets the value of the rtFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRTFare(String value) {
        this.rtFare = value;
    }

    /**
     * Gets the value of the airV1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirV1() {
        return airV1;
    }

    /**
     * Sets the value of the airV1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirV1(String value) {
        this.airV1 = value;
    }

    /**
     * Gets the value of the airV2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirV2() {
        return airV2;
    }

    /**
     * Sets the value of the airV2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirV2(String value) {
        this.airV2 = value;
    }

    /**
     * Gets the value of the airV3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirV3() {
        return airV3;
    }

    /**
     * Sets the value of the airV3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirV3(String value) {
        this.airV3 = value;
    }

    /**
     * Gets the value of the airV4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirV4() {
        return airV4;
    }

    /**
     * Sets the value of the airV4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirV4(String value) {
        this.airV4 = value;
    }

    /**
     * Gets the value of the via1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVia1() {
        return via1;
    }

    /**
     * Sets the value of the via1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVia1(String value) {
        this.via1 = value;
    }

    /**
     * Gets the value of the via2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVia2() {
        return via2;
    }

    /**
     * Sets the value of the via2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVia2(String value) {
        this.via2 = value;
    }

    /**
     * Gets the value of the fareCabinClsSeg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareCabinClsSeg() {
        return fareCabinClsSeg;
    }

    /**
     * Sets the value of the fareCabinClsSeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareCabinClsSeg(String value) {
        this.fareCabinClsSeg = value;
    }

}
