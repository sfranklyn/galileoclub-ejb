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
 *         &lt;choice>
 *           &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}TkDesignator"/>
 *           &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}NVBDt"/>
 *           &lt;sequence>
 *             &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}AllowCnt"/>
 *             &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}AllowInd"/>
 *           &lt;/sequence>
 *         &lt;/choice>
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
    "tkDesignator",
    "nvbDt",
    "allowCnt",
    "allowInd"
})
@XmlRootElement(name = "SegNumInfo")
public class SegNumInfo
    implements Serializable
{

    @XmlElement(name = "SegNum", required = true)
    protected String segNum;
    @XmlElement(name = "TkDesignator")
    protected String tkDesignator;
    @XmlElement(name = "NVBDt")
    protected String nvbDt;
    @XmlElement(name = "AllowCnt")
    protected String allowCnt;
    @XmlElement(name = "AllowInd")
    protected String allowInd;

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
     * Gets the value of the tkDesignator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTkDesignator() {
        return tkDesignator;
    }

    /**
     * Sets the value of the tkDesignator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTkDesignator(String value) {
        this.tkDesignator = value;
    }

    /**
     * Gets the value of the nvbDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNVBDt() {
        return nvbDt;
    }

    /**
     * Sets the value of the nvbDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNVBDt(String value) {
        this.nvbDt = value;
    }

    /**
     * Gets the value of the allowCnt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowCnt() {
        return allowCnt;
    }

    /**
     * Sets the value of the allowCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowCnt(String value) {
        this.allowCnt = value;
    }

    /**
     * Gets the value of the allowInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowInd() {
        return allowInd;
    }

    /**
     * Sets the value of the allowInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowInd(String value) {
        this.allowInd = value;
    }

}
