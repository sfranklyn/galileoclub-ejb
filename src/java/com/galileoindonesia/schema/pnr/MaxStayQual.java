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
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}MaxStayInd"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}DayQual"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}TmQual"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}WeekQual"/>
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
    "maxStayInd",
    "dayQual",
    "tmQual",
    "weekQual"
})
@XmlRootElement(name = "MaxStayQual")
public class MaxStayQual
    implements Serializable
{

    @XmlElement(name = "MaxStayInd", required = true)
    protected String maxStayInd;
    @XmlElement(name = "DayQual", required = true)
    protected String dayQual;
    @XmlElement(name = "TmQual", required = true)
    protected TmQual tmQual;
    @XmlElement(name = "WeekQual", required = true)
    protected WeekQual weekQual;

    /**
     * Gets the value of the maxStayInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxStayInd() {
        return maxStayInd;
    }

    /**
     * Sets the value of the maxStayInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxStayInd(String value) {
        this.maxStayInd = value;
    }

    /**
     * Gets the value of the dayQual property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDayQual() {
        return dayQual;
    }

    /**
     * Sets the value of the dayQual property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDayQual(String value) {
        this.dayQual = value;
    }

    /**
     * Gets the value of the tmQual property.
     * 
     * @return
     *     possible object is
     *     {@link TmQual }
     *     
     */
    public TmQual getTmQual() {
        return tmQual;
    }

    /**
     * Sets the value of the tmQual property.
     * 
     * @param value
     *     allowed object is
     *     {@link TmQual }
     *     
     */
    public void setTmQual(TmQual value) {
        this.tmQual = value;
    }

    /**
     * Gets the value of the weekQual property.
     * 
     * @return
     *     possible object is
     *     {@link WeekQual }
     *     
     */
    public WeekQual getWeekQual() {
        return weekQual;
    }

    /**
     * Sets the value of the weekQual property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeekQual }
     *     
     */
    public void setWeekQual(WeekQual value) {
        this.weekQual = value;
    }

}
