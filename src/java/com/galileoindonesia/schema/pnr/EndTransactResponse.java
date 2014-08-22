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
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}FileAddr"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}RecCodeCheck"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}RecLoc"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}ErrSeverityInd"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}LangPref"/>
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
    "fileAddr",
    "recCodeCheck",
    "recLoc",
    "errSeverityInd",
    "langPref"
})
@XmlRootElement(name = "EndTransactResponse")
public class EndTransactResponse
    implements Serializable
{

    @XmlElement(name = "FileAddr", required = true)
    protected String fileAddr;
    @XmlElement(name = "RecCodeCheck", required = true)
    protected String recCodeCheck;
    @XmlElement(name = "RecLoc", required = true)
    protected String recLoc;
    @XmlElement(name = "ErrSeverityInd", required = true)
    protected String errSeverityInd;
    @XmlElement(name = "LangPref", required = true)
    protected String langPref;

    /**
     * Gets the value of the fileAddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileAddr() {
        return fileAddr;
    }

    /**
     * Sets the value of the fileAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileAddr(String value) {
        this.fileAddr = value;
    }

    /**
     * Gets the value of the recCodeCheck property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecCodeCheck() {
        return recCodeCheck;
    }

    /**
     * Sets the value of the recCodeCheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecCodeCheck(String value) {
        this.recCodeCheck = value;
    }

    /**
     * Gets the value of the recLoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecLoc() {
        return recLoc;
    }

    /**
     * Sets the value of the recLoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecLoc(String value) {
        this.recLoc = value;
    }

    /**
     * Gets the value of the errSeverityInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrSeverityInd() {
        return errSeverityInd;
    }

    /**
     * Sets the value of the errSeverityInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrSeverityInd(String value) {
        this.errSeverityInd = value;
    }

    /**
     * Gets the value of the langPref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLangPref() {
        return langPref;
    }

    /**
     * Sets the value of the langPref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLangPref(String value) {
        this.langPref = value;
    }

}