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
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}Tok"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}SegNum"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "tok",
    "segNum",
    "status"
})
@XmlRootElement(name = "SegCancelInfo")
public class SegCancelInfo
    implements Serializable
{

    @XmlElement(name = "Tok", required = true)
    protected String tok;
    @XmlElement(name = "SegNum", required = true)
    protected String segNum;
    @XmlElement(name = "Status", required = true)
    protected String status;

    /**
     * Gets the value of the tok property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTok() {
        return tok;
    }

    /**
     * Sets the value of the tok property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTok(String value) {
        this.tok = value;
    }

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

}
