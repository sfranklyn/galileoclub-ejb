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
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}WaitforVLocatorInd"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}SkipCustomCheckInd"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}SkipTEdits"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}ReqAutoService"/>
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
    "waitforVLocatorInd",
    "skipCustomCheckInd",
    "skipTEdits",
    "reqAutoService"
})
@XmlRootElement(name = "ValidationControl")
public class ValidationControl
    implements Serializable
{

    @XmlElement(name = "WaitforVLocatorInd", required = true)
    protected String waitforVLocatorInd;
    @XmlElement(name = "SkipCustomCheckInd", required = true)
    protected String skipCustomCheckInd;
    @XmlElement(name = "SkipTEdits", required = true)
    protected String skipTEdits;
    @XmlElement(name = "ReqAutoService", required = true)
    protected String reqAutoService;

    /**
     * Gets the value of the waitforVLocatorInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaitforVLocatorInd() {
        return waitforVLocatorInd;
    }

    /**
     * Sets the value of the waitforVLocatorInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaitforVLocatorInd(String value) {
        this.waitforVLocatorInd = value;
    }

    /**
     * Gets the value of the skipCustomCheckInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkipCustomCheckInd() {
        return skipCustomCheckInd;
    }

    /**
     * Sets the value of the skipCustomCheckInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkipCustomCheckInd(String value) {
        this.skipCustomCheckInd = value;
    }

    /**
     * Gets the value of the skipTEdits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkipTEdits() {
        return skipTEdits;
    }

    /**
     * Sets the value of the skipTEdits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkipTEdits(String value) {
        this.skipTEdits = value;
    }

    /**
     * Gets the value of the reqAutoService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqAutoService() {
        return reqAutoService;
    }

    /**
     * Sets the value of the reqAutoService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqAutoService(String value) {
        this.reqAutoService = value;
    }

}
