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
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}QuoteNum" minOccurs="0"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}MsgNum"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}AppNum"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}MsgType"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}Lang"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}Text"/>
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
    "quoteNum",
    "msgNum",
    "appNum",
    "msgType",
    "lang",
    "text"
})
@XmlRootElement(name = "InfoMsg")
public class InfoMsg implements Serializable
{

    @XmlElement(name = "UniqueKey", required = true)
    protected String uniqueKey;
    @XmlElement(name = "QuoteNum")
    protected String quoteNum;
    @XmlElement(name = "MsgNum", required = true)
    protected String msgNum;
    @XmlElement(name = "AppNum", required = true)
    protected String appNum;
    @XmlElement(name = "MsgType", required = true)
    protected String msgType;
    @XmlElement(name = "Lang", required = true)
    protected String lang;
    @XmlElement(name = "Text", required = true)
    protected String text;

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
     * Gets the value of the quoteNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuoteNum() {
        return quoteNum;
    }

    /**
     * Sets the value of the quoteNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuoteNum(String value) {
        this.quoteNum = value;
    }

    /**
     * Gets the value of the msgNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgNum() {
        return msgNum;
    }

    /**
     * Sets the value of the msgNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgNum(String value) {
        this.msgNum = value;
    }

    /**
     * Gets the value of the appNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppNum() {
        return appNum;
    }

    /**
     * Sets the value of the appNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppNum(String value) {
        this.appNum = value;
    }

    /**
     * Gets the value of the msgType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * Sets the value of the msgType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgType(String value) {
        this.msgType = value;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

}
