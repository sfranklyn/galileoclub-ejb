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
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}AddPhoneQual"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}DelPhoneNumQual"/>
 *           &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}ChgPhoneModQual"/>
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
    "editTypeInd",
    "addPhoneQual",
    "delPhoneNumQual",
    "chgPhoneModQual"
})
@XmlRootElement(name = "PhoneQual")
public class PhoneQual
    implements Serializable
{

    @XmlElement(name = "EditTypeInd", required = true)
    protected String editTypeInd;
    @XmlElement(name = "AddPhoneQual", required = true)
    protected AddPhoneQual addPhoneQual;
    @XmlElement(name = "DelPhoneNumQual")
    protected String delPhoneNumQual;
    @XmlElement(name = "ChgPhoneModQual")
    protected ChgPhoneModQual chgPhoneModQual;

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
     * Gets the value of the addPhoneQual property.
     * 
     * @return
     *     possible object is
     *     {@link AddPhoneQual }
     *     
     */
    public AddPhoneQual getAddPhoneQual() {
        return addPhoneQual;
    }

    /**
     * Sets the value of the addPhoneQual property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddPhoneQual }
     *     
     */
    public void setAddPhoneQual(AddPhoneQual value) {
        this.addPhoneQual = value;
    }

    /**
     * Gets the value of the delPhoneNumQual property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelPhoneNumQual() {
        return delPhoneNumQual;
    }

    /**
     * Sets the value of the delPhoneNumQual property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelPhoneNumQual(String value) {
        this.delPhoneNumQual = value;
    }

    /**
     * Gets the value of the chgPhoneModQual property.
     * 
     * @return
     *     possible object is
     *     {@link ChgPhoneModQual }
     *     
     */
    public ChgPhoneModQual getChgPhoneModQual() {
        return chgPhoneModQual;
    }

    /**
     * Sets the value of the chgPhoneModQual property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChgPhoneModQual }
     *     
     */
    public void setChgPhoneModQual(ChgPhoneModQual value) {
        this.chgPhoneModQual = value;
    }

}
