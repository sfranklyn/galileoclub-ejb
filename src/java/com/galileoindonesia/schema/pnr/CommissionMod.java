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
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}Amt"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}Percent"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}CommCappedAmt"/>
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
    "amt",
    "percent",
    "commCappedAmt"
})
@XmlRootElement(name = "CommissionMod")
public class CommissionMod implements Serializable
{

    @XmlElement(name = "Amt", required = true)
    protected String amt;
    @XmlElement(name = "Percent", required = true)
    protected String percent;
    @XmlElement(name = "CommCappedAmt", required = true)
    protected String commCappedAmt;

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmt(String value) {
        this.amt = value;
    }

    /**
     * Gets the value of the percent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPercent() {
        return percent;
    }

    /**
     * Sets the value of the percent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPercent(String value) {
        this.percent = value;
    }

    /**
     * Gets the value of the commCappedAmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommCappedAmt() {
        return commCappedAmt;
    }

    /**
     * Sets the value of the commCappedAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommCappedAmt(String value) {
        this.commCappedAmt = value;
    }

}
