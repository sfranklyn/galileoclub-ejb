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
 *         &lt;choice>
 *           &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}AirV"/>
 *           &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}CarV"/>
 *           &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}HtlV"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}Acct"/>
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
    "airV",
    "carV",
    "htlV",
    "acct"
})
@XmlRootElement(name = "FreqCust")
public class FreqCust
    implements Serializable
{

    @XmlElement(name = "AirV")
    protected String airV;
    @XmlElement(name = "CarV")
    protected String carV;
    @XmlElement(name = "HtlV")
    protected String htlV;
    @XmlElement(name = "Acct", required = true)
    protected String acct;

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
     * Gets the value of the carV property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarV() {
        return carV;
    }

    /**
     * Sets the value of the carV property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarV(String value) {
        this.carV = value;
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
     * Gets the value of the acct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcct() {
        return acct;
    }

    /**
     * Sets the value of the acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcct(String value) {
        this.acct = value;
    }

}
