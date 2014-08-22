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
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}PassiveSegType"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}Vnd"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}NumItems"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}City"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}StartDt"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}EndDt"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}Type" minOccurs="0"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}DuePaidTextInd"/>
 *           &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}AmtDuePaid"/>
 *         &lt;/sequence>
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
    "passiveSegType",
    "vnd",
    "status",
    "numItems",
    "city",
    "startDt",
    "endDt",
    "type",
    "duePaidTextInd",
    "amtDuePaid"
})
@XmlRootElement(name = "PassiveSegmentSellRequest")
public class PassiveSegmentSellRequest
    implements Serializable
{

    @XmlElement(name = "PassiveSegType", required = true)
    protected String passiveSegType;
    @XmlElement(name = "Vnd", required = true)
    protected String vnd;
    @XmlElement(name = "Status", required = true)
    protected String status;
    @XmlElement(name = "NumItems", required = true)
    protected String numItems;
    @XmlElement(name = "City", required = true)
    protected String city;
    @XmlElement(name = "StartDt", required = true)
    protected String startDt;
    @XmlElement(name = "EndDt", required = true)
    protected String endDt;
    @XmlElement(name = "Type")
    protected String type;
    @XmlElement(name = "DuePaidTextInd")
    protected String duePaidTextInd;
    @XmlElement(name = "AmtDuePaid")
    protected String amtDuePaid;

    /**
     * Gets the value of the passiveSegType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassiveSegType() {
        return passiveSegType;
    }

    /**
     * Sets the value of the passiveSegType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassiveSegType(String value) {
        this.passiveSegType = value;
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
     * Gets the value of the numItems property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumItems() {
        return numItems;
    }

    /**
     * Sets the value of the numItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumItems(String value) {
        this.numItems = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
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
     * Gets the value of the endDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDt() {
        return endDt;
    }

    /**
     * Sets the value of the endDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDt(String value) {
        this.endDt = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the duePaidTextInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuePaidTextInd() {
        return duePaidTextInd;
    }

    /**
     * Sets the value of the duePaidTextInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuePaidTextInd(String value) {
        this.duePaidTextInd = value;
    }

    /**
     * Gets the value of the amtDuePaid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmtDuePaid() {
        return amtDuePaid;
    }

    /**
     * Sets the value of the amtDuePaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmtDuePaid(String value) {
        this.amtDuePaid = value;
    }

}