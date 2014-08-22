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
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}ModType"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}TypeDQual"/>
 *           &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}TypeRQual"/>
 *         &lt;/choice>
 *         &lt;sequence minOccurs="0">
 *           &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}StartDt"/>
 *           &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}EndDt"/>
 *           &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}NumAdults"/>
 *           &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}NumChild"/>
 *           &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}NumRooms"/>
 *           &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}BIC"/>
 *           &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}RateAccess"/>
 *           &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}RoomType"/>
 *           &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}NumBeds"/>
 *           &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}BedType"/>
 *         &lt;/sequence>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}FldAry" minOccurs="0"/>
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
    "modType",
    "typeDQual",
    "typeRQual",
    "startDt",
    "endDt",
    "numAdults",
    "numChild",
    "numRooms",
    "bic",
    "rateAccess",
    "roomType",
    "numBeds",
    "bedType",
    "fldAry"
})
@XmlRootElement(name = "HotelModify")
public class HotelModify
    implements Serializable
{

    @XmlElement(name = "SegNum", required = true)
    protected String segNum;
    @XmlElement(name = "ModType", required = true)
    protected String modType;
    @XmlElement(name = "TypeDQual")
    protected TypeDQual typeDQual;
    @XmlElement(name = "TypeRQual")
    protected TypeRQual typeRQual;
    @XmlElement(name = "StartDt")
    protected String startDt;
    @XmlElement(name = "EndDt")
    protected String endDt;
    @XmlElement(name = "NumAdults")
    protected String numAdults;
    @XmlElement(name = "NumChild")
    protected String numChild;
    @XmlElement(name = "NumRooms")
    protected String numRooms;
    @XmlElement(name = "BIC")
    protected String bic;
    @XmlElement(name = "RateAccess")
    protected String rateAccess;
    @XmlElement(name = "RoomType")
    protected String roomType;
    @XmlElement(name = "NumBeds")
    protected String numBeds;
    @XmlElement(name = "BedType")
    protected String bedType;
    @XmlElement(name = "FldAry")
    protected FldAry fldAry;

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
     * Gets the value of the modType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModType() {
        return modType;
    }

    /**
     * Sets the value of the modType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModType(String value) {
        this.modType = value;
    }

    /**
     * Gets the value of the typeDQual property.
     * 
     * @return
     *     possible object is
     *     {@link TypeDQual }
     *     
     */
    public TypeDQual getTypeDQual() {
        return typeDQual;
    }

    /**
     * Sets the value of the typeDQual property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDQual }
     *     
     */
    public void setTypeDQual(TypeDQual value) {
        this.typeDQual = value;
    }

    /**
     * Gets the value of the typeRQual property.
     * 
     * @return
     *     possible object is
     *     {@link TypeRQual }
     *     
     */
    public TypeRQual getTypeRQual() {
        return typeRQual;
    }

    /**
     * Sets the value of the typeRQual property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeRQual }
     *     
     */
    public void setTypeRQual(TypeRQual value) {
        this.typeRQual = value;
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
     * Gets the value of the numAdults property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumAdults() {
        return numAdults;
    }

    /**
     * Sets the value of the numAdults property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumAdults(String value) {
        this.numAdults = value;
    }

    /**
     * Gets the value of the numChild property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumChild() {
        return numChild;
    }

    /**
     * Sets the value of the numChild property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumChild(String value) {
        this.numChild = value;
    }

    /**
     * Gets the value of the numRooms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumRooms() {
        return numRooms;
    }

    /**
     * Sets the value of the numRooms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumRooms(String value) {
        this.numRooms = value;
    }

    /**
     * Gets the value of the bic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBIC() {
        return bic;
    }

    /**
     * Sets the value of the bic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBIC(String value) {
        this.bic = value;
    }

    /**
     * Gets the value of the rateAccess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateAccess() {
        return rateAccess;
    }

    /**
     * Sets the value of the rateAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateAccess(String value) {
        this.rateAccess = value;
    }

    /**
     * Gets the value of the roomType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomType() {
        return roomType;
    }

    /**
     * Sets the value of the roomType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomType(String value) {
        this.roomType = value;
    }

    /**
     * Gets the value of the numBeds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumBeds() {
        return numBeds;
    }

    /**
     * Sets the value of the numBeds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumBeds(String value) {
        this.numBeds = value;
    }

    /**
     * Gets the value of the bedType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBedType() {
        return bedType;
    }

    /**
     * Sets the value of the bedType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBedType(String value) {
        this.bedType = value;
    }

    /**
     * Gets the value of the fldAry property.
     * 
     * @return
     *     possible object is
     *     {@link FldAry }
     *     
     */
    public FldAry getFldAry() {
        return fldAry;
    }

    /**
     * Sets the value of the fldAry property.
     * 
     * @param value
     *     allowed object is
     *     {@link FldAry }
     *     
     */
    public void setFldAry(FldAry value) {
        this.fldAry = value;
    }

}