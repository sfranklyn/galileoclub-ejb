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
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}AcknItemNum" minOccurs="0"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}LineNum" minOccurs="0"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}ID"/>
 *           &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}IDType"/>
 *           &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}IDText1"/>
 *           &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}IDText2"/>
 *         &lt;/sequence>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}Num" minOccurs="0"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}Keyword" minOccurs="0"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}VType" minOccurs="0"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}Vnd" minOccurs="0"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}RecLoc" minOccurs="0"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}Qual1"/>
 *           &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}Qual2"/>
 *         &lt;/sequence>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}Rmk" minOccurs="0"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}SegNum" minOccurs="0"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}Type" minOccurs="0"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}InDt"/>
 *           &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}DuePaidTextInd"/>
 *           &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}Price"/>
 *           &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}Currency"/>
 *           &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}DecPos"/>
 *         &lt;/sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}EmailData"/>
 *           &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}RmkAry"/>
 *           &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}Text"/>
 *           &lt;sequence>
 *             &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}QItemNum"/>
 *             &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}Dt"/>
 *             &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}QNum"/>
 *             &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}QCat"/>
 *             &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}PCC"/>
 *             &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}Tm"/>
 *             &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}QMinder"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}OSINum"/>
 *             &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}OSIV"/>
 *             &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}OSI"/>
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
    "acknItemNum",
    "lineNum",
    "id",
    "idType",
    "idText1",
    "idText2",
    "num",
    "keyword",
    "vType",
    "vnd",
    "recLoc",
    "qual1",
    "qual2",
    "rmk",
    "segNum",
    "type",
    "inDt",
    "duePaidTextInd",
    "price",
    "currency",
    "decPos",
    "emailData",
    "rmkAry",
    "text",
    "qItemNum",
    "dt",
    "qNum",
    "qCat",
    "pcc",
    "tm",
    "qMinder",
    "osiNum",
    "osiv",
    "osi"
})
@XmlRootElement(name = "ChgQual")
public class ChgQual
    implements Serializable
{

    @XmlElement(name = "AcknItemNum")
    protected String acknItemNum;
    @XmlElement(name = "LineNum")
    protected String lineNum;
    @XmlElement(name = "ID")
    protected String id;
    @XmlElement(name = "IDType")
    protected String idType;
    @XmlElement(name = "IDText1")
    protected String idText1;
    @XmlElement(name = "IDText2")
    protected String idText2;
    @XmlElement(name = "Num")
    protected String num;
    @XmlElement(name = "Keyword")
    protected String keyword;
    @XmlElement(name = "VType")
    protected String vType;
    @XmlElement(name = "Vnd")
    protected String vnd;
    @XmlElement(name = "RecLoc")
    protected String recLoc;
    @XmlElement(name = "Qual1")
    protected String qual1;
    @XmlElement(name = "Qual2")
    protected String qual2;
    @XmlElement(name = "Rmk")
    protected String rmk;
    @XmlElement(name = "SegNum")
    protected String segNum;
    @XmlElement(name = "Type")
    protected String type;
    @XmlElement(name = "InDt")
    protected String inDt;
    @XmlElement(name = "DuePaidTextInd")
    protected String duePaidTextInd;
    @XmlElement(name = "Price")
    protected String price;
    @XmlElement(name = "Currency")
    protected String currency;
    @XmlElement(name = "DecPos")
    protected String decPos;
    @XmlElement(name = "EmailData")
    protected String emailData;
    @XmlElement(name = "RmkAry")
    protected RmkAry rmkAry;
    @XmlElement(name = "Text")
    protected String text;
    @XmlElement(name = "QItemNum")
    protected String qItemNum;
    @XmlElement(name = "Dt")
    protected String dt;
    @XmlElement(name = "QNum")
    protected String qNum;
    @XmlElement(name = "QCat")
    protected String qCat;
    @XmlElement(name = "PCC")
    protected String pcc;
    @XmlElement(name = "Tm")
    protected String tm;
    @XmlElement(name = "QMinder")
    protected QMinder qMinder;
    @XmlElement(name = "OSINum")
    protected String osiNum;
    @XmlElement(name = "OSIV")
    protected String osiv;
    @XmlElement(name = "OSI")
    protected OSI osi;

    /**
     * Gets the value of the acknItemNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcknItemNum() {
        return acknItemNum;
    }

    /**
     * Sets the value of the acknItemNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcknItemNum(String value) {
        this.acknItemNum = value;
    }

    /**
     * Gets the value of the lineNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineNum() {
        return lineNum;
    }

    /**
     * Sets the value of the lineNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineNum(String value) {
        this.lineNum = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the idType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDType() {
        return idType;
    }

    /**
     * Sets the value of the idType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDType(String value) {
        this.idType = value;
    }

    /**
     * Gets the value of the idText1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDText1() {
        return idText1;
    }

    /**
     * Sets the value of the idText1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDText1(String value) {
        this.idText1 = value;
    }

    /**
     * Gets the value of the idText2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDText2() {
        return idText2;
    }

    /**
     * Sets the value of the idText2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDText2(String value) {
        this.idText2 = value;
    }

    /**
     * Gets the value of the num property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNum() {
        return num;
    }

    /**
     * Sets the value of the num property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNum(String value) {
        this.num = value;
    }

    /**
     * Gets the value of the keyword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyword() {
        return keyword;
    }

    /**
     * Sets the value of the keyword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyword(String value) {
        this.keyword = value;
    }

    /**
     * Gets the value of the vType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVType() {
        return vType;
    }

    /**
     * Sets the value of the vType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVType(String value) {
        this.vType = value;
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
     * Gets the value of the qual1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQual1() {
        return qual1;
    }

    /**
     * Sets the value of the qual1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQual1(String value) {
        this.qual1 = value;
    }

    /**
     * Gets the value of the qual2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQual2() {
        return qual2;
    }

    /**
     * Sets the value of the qual2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQual2(String value) {
        this.qual2 = value;
    }

    /**
     * Gets the value of the rmk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRmk() {
        return rmk;
    }

    /**
     * Sets the value of the rmk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRmk(String value) {
        this.rmk = value;
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
     * Gets the value of the inDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDt() {
        return inDt;
    }

    /**
     * Sets the value of the inDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDt(String value) {
        this.inDt = value;
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
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrice(String value) {
        this.price = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the decPos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecPos() {
        return decPos;
    }

    /**
     * Sets the value of the decPos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecPos(String value) {
        this.decPos = value;
    }

    /**
     * Gets the value of the emailData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailData() {
        return emailData;
    }

    /**
     * Sets the value of the emailData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailData(String value) {
        this.emailData = value;
    }

    /**
     * Gets the value of the rmkAry property.
     * 
     * @return
     *     possible object is
     *     {@link RmkAry }
     *     
     */
    public RmkAry getRmkAry() {
        return rmkAry;
    }

    /**
     * Sets the value of the rmkAry property.
     * 
     * @param value
     *     allowed object is
     *     {@link RmkAry }
     *     
     */
    public void setRmkAry(RmkAry value) {
        this.rmkAry = value;
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

    /**
     * Gets the value of the qItemNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQItemNum() {
        return qItemNum;
    }

    /**
     * Sets the value of the qItemNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQItemNum(String value) {
        this.qItemNum = value;
    }

    /**
     * Gets the value of the dt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDt() {
        return dt;
    }

    /**
     * Sets the value of the dt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDt(String value) {
        this.dt = value;
    }

    /**
     * Gets the value of the qNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQNum() {
        return qNum;
    }

    /**
     * Sets the value of the qNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQNum(String value) {
        this.qNum = value;
    }

    /**
     * Gets the value of the qCat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQCat() {
        return qCat;
    }

    /**
     * Sets the value of the qCat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQCat(String value) {
        this.qCat = value;
    }

    /**
     * Gets the value of the pcc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCC() {
        return pcc;
    }

    /**
     * Sets the value of the pcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCC(String value) {
        this.pcc = value;
    }

    /**
     * Gets the value of the tm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTm() {
        return tm;
    }

    /**
     * Sets the value of the tm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTm(String value) {
        this.tm = value;
    }

    /**
     * Gets the value of the qMinder property.
     * 
     * @return
     *     possible object is
     *     {@link QMinder }
     *     
     */
    public QMinder getQMinder() {
        return qMinder;
    }

    /**
     * Sets the value of the qMinder property.
     * 
     * @param value
     *     allowed object is
     *     {@link QMinder }
     *     
     */
    public void setQMinder(QMinder value) {
        this.qMinder = value;
    }

    /**
     * Gets the value of the osiNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOSINum() {
        return osiNum;
    }

    /**
     * Sets the value of the osiNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOSINum(String value) {
        this.osiNum = value;
    }

    /**
     * Gets the value of the osiv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOSIV() {
        return osiv;
    }

    /**
     * Sets the value of the osiv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOSIV(String value) {
        this.osiv = value;
    }

    /**
     * Gets the value of the osi property.
     * 
     * @return
     *     possible object is
     *     {@link OSI }
     *     
     */
    public OSI getOSI() {
        return osi;
    }

    /**
     * Sets the value of the osi property.
     * 
     * @param value
     *     allowed object is
     *     {@link OSI }
     *     
     */
    public void setOSI(OSI value) {
        this.osi = value;
    }

}
