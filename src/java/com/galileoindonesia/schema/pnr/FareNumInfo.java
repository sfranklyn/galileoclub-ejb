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
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}FareNumAry"/>
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
    "fareNumAry"
})
@XmlRootElement(name = "FareNumInfo")
public class FareNumInfo implements Serializable
{

    @XmlElement(name = "FareNumAry", required = true)
    protected FareNumAry fareNumAry;

    /**
     * Gets the value of the fareNumAry property.
     * 
     * @return
     *     possible object is
     *     {@link FareNumAry }
     *     
     */
    public FareNumAry getFareNumAry() {
        return fareNumAry;
    }

    /**
     * Sets the value of the fareNumAry property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareNumAry }
     *     
     */
    public void setFareNumAry(FareNumAry value) {
        this.fareNumAry = value;
    }

}
