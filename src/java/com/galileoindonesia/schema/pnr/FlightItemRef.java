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
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}ODNum"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}ODNumLegs"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}FltItemAry"/>
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
    "odNum",
    "odNumLegs",
    "fltItemAry"
})
@XmlRootElement(name = "FlightItemRef")
public class FlightItemRef
    implements Serializable
{

    @XmlElement(name = "UniqueKey", required = true)
    protected String uniqueKey;
    @XmlElement(name = "ODNum", required = true)
    protected String odNum;
    @XmlElement(name = "ODNumLegs", required = true)
    protected String odNumLegs;
    @XmlElement(name = "FltItemAry", required = true)
    protected FltItemAry fltItemAry;

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
     * Gets the value of the odNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getODNum() {
        return odNum;
    }

    /**
     * Sets the value of the odNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setODNum(String value) {
        this.odNum = value;
    }

    /**
     * Gets the value of the odNumLegs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getODNumLegs() {
        return odNumLegs;
    }

    /**
     * Sets the value of the odNumLegs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setODNumLegs(String value) {
        this.odNumLegs = value;
    }

    /**
     * Gets the value of the fltItemAry property.
     * 
     * @return
     *     possible object is
     *     {@link FltItemAry }
     *     
     */
    public FltItemAry getFltItemAry() {
        return fltItemAry;
    }

    /**
     * Sets the value of the fltItemAry property.
     * 
     * @param value
     *     allowed object is
     *     {@link FltItemAry }
     *     
     */
    public void setFltItemAry(FltItemAry value) {
        this.fltItemAry = value;
    }

}