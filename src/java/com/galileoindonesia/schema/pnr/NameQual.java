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
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}EditTypeInd"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}EditTypeIndAppliesTo"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}AddChgNameRmkQual"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}DeleteQual" minOccurs="0"/>
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
    "editTypeInd",
    "editTypeIndAppliesTo",
    "addChgNameRmkQual",
    "deleteQual"
})
@XmlRootElement(name = "NameQual")
public class NameQual
    implements Serializable
{

    @XmlElement(name = "EditTypeInd", required = true)
    protected String editTypeInd;
    @XmlElement(name = "EditTypeIndAppliesTo", required = true)
    protected String editTypeIndAppliesTo;
    @XmlElement(name = "AddChgNameRmkQual", required = true)
    protected AddChgNameRmkQual addChgNameRmkQual;
    @XmlElement(name = "DeleteQual")
    protected DeleteQual deleteQual;

    /**
     * Gets the value of the editTypeInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEditTypeInd() {
        return editTypeInd;
    }

    /**
     * Sets the value of the editTypeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEditTypeInd(String value) {
        this.editTypeInd = value;
    }

    /**
     * Gets the value of the editTypeIndAppliesTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEditTypeIndAppliesTo() {
        return editTypeIndAppliesTo;
    }

    /**
     * Sets the value of the editTypeIndAppliesTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEditTypeIndAppliesTo(String value) {
        this.editTypeIndAppliesTo = value;
    }

    /**
     * Gets the value of the addChgNameRmkQual property.
     * 
     * @return
     *     possible object is
     *     {@link AddChgNameRmkQual }
     *     
     */
    public AddChgNameRmkQual getAddChgNameRmkQual() {
        return addChgNameRmkQual;
    }

    /**
     * Sets the value of the addChgNameRmkQual property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddChgNameRmkQual }
     *     
     */
    public void setAddChgNameRmkQual(AddChgNameRmkQual value) {
        this.addChgNameRmkQual = value;
    }

    /**
     * Gets the value of the deleteQual property.
     * 
     * @return
     *     possible object is
     *     {@link DeleteQual }
     *     
     */
    public DeleteQual getDeleteQual() {
        return deleteQual;
    }

    /**
     * Sets the value of the deleteQual property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeleteQual }
     *     
     */
    public void setDeleteQual(DeleteQual value) {
        this.deleteQual = value;
    }

}
