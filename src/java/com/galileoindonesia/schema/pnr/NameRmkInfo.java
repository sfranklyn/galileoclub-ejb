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
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}LNameNum"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}PsgrNum"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}AbsNameNum"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}NameRmk"/>
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
    "lNameNum",
    "psgrNum",
    "absNameNum",
    "nameRmk"
})
@XmlRootElement(name = "NameRmkInfo")
public class NameRmkInfo implements Serializable
{

    @XmlElement(name = "LNameNum", required = true)
    protected String lNameNum;
    @XmlElement(name = "PsgrNum", required = true)
    protected String psgrNum;
    @XmlElement(name = "AbsNameNum", required = true)
    protected String absNameNum;
    @XmlElement(name = "NameRmk", required = true)
    protected String nameRmk;

    /**
     * Gets the value of the lNameNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLNameNum() {
        return lNameNum;
    }

    /**
     * Sets the value of the lNameNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLNameNum(String value) {
        this.lNameNum = value;
    }

    /**
     * Gets the value of the psgrNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPsgrNum() {
        return psgrNum;
    }

    /**
     * Sets the value of the psgrNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPsgrNum(String value) {
        this.psgrNum = value;
    }

    /**
     * Gets the value of the absNameNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbsNameNum() {
        return absNameNum;
    }

    /**
     * Sets the value of the absNameNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbsNameNum(String value) {
        this.absNameNum = value;
    }

    /**
     * Gets the value of the nameRmk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameRmk() {
        return nameRmk;
    }

    /**
     * Sets the value of the nameRmk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameRmk(String value) {
        this.nameRmk = value;
    }

}
