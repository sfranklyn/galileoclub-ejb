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
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}Endors1" minOccurs="0"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}Endors2" minOccurs="0"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}Endors3" minOccurs="0"/>
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
    "endors1",
    "endors2",
    "endors3"
})
@XmlRootElement(name = "EndorsementBox")
public class EndorsementBox implements Serializable
{

    @XmlElement(name = "Endors1")
    protected String endors1;
    @XmlElement(name = "Endors2")
    protected String endors2;
    @XmlElement(name = "Endors3")
    protected String endors3;

    /**
     * Gets the value of the endors1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndors1() {
        return endors1;
    }

    /**
     * Sets the value of the endors1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndors1(String value) {
        this.endors1 = value;
    }

    /**
     * Gets the value of the endors2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndors2() {
        return endors2;
    }

    /**
     * Sets the value of the endors2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndors2(String value) {
        this.endors2 = value;
    }

    /**
     * Gets the value of the endors3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndors3() {
        return endors3;
    }

    /**
     * Sets the value of the endors3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndors3(String value) {
        this.endors3 = value;
    }

}
