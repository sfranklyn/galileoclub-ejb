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
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}PIC"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}PersonalGeoType"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}PersonalGeoData"/>
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
    "pic",
    "personalGeoType",
    "personalGeoData"
})
@XmlRootElement(name = "PICOptMod")
public class PICOptMod implements Serializable
{

    @XmlElement(name = "PIC", required = true)
    protected String pic;
    @XmlElement(name = "PersonalGeoType", required = true)
    protected String personalGeoType;
    @XmlElement(name = "PersonalGeoData", required = true)
    protected String personalGeoData;

    /**
     * Gets the value of the pic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPIC() {
        return pic;
    }

    /**
     * Sets the value of the pic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPIC(String value) {
        this.pic = value;
    }

    /**
     * Gets the value of the personalGeoType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalGeoType() {
        return personalGeoType;
    }

    /**
     * Sets the value of the personalGeoType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalGeoType(String value) {
        this.personalGeoType = value;
    }

    /**
     * Gets the value of the personalGeoData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalGeoData() {
        return personalGeoData;
    }

    /**
     * Sets the value of the personalGeoData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalGeoData(String value) {
        this.personalGeoData = value;
    }

}