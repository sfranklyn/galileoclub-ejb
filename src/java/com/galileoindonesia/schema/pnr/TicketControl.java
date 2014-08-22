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
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}ATFQ"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}ETkPNRInd"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}MIRWithInvoiceInd"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}MIRNoInvoiceInd"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}SkipCustomCheckInd"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}ManualCCOverrideCode"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}TkPCC"/>
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
    "atfq",
    "eTkPNRInd",
    "mirWithInvoiceInd",
    "mirNoInvoiceInd",
    "skipCustomCheckInd",
    "manualCCOverrideCode",
    "tkPCC"
})
@XmlRootElement(name = "TicketControl")
public class TicketControl
    implements Serializable
{

    @XmlElement(name = "ATFQ", required = true)
    protected String atfq;
    @XmlElement(name = "ETkPNRInd", required = true)
    protected String eTkPNRInd;
    @XmlElement(name = "MIRWithInvoiceInd", required = true)
    protected String mirWithInvoiceInd;
    @XmlElement(name = "MIRNoInvoiceInd", required = true)
    protected String mirNoInvoiceInd;
    @XmlElement(name = "SkipCustomCheckInd", required = true)
    protected String skipCustomCheckInd;
    @XmlElement(name = "ManualCCOverrideCode", required = true)
    protected String manualCCOverrideCode;
    @XmlElement(name = "TkPCC", required = true)
    protected String tkPCC;

    /**
     * Gets the value of the atfq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATFQ() {
        return atfq;
    }

    /**
     * Sets the value of the atfq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATFQ(String value) {
        this.atfq = value;
    }

    /**
     * Gets the value of the eTkPNRInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getETkPNRInd() {
        return eTkPNRInd;
    }

    /**
     * Sets the value of the eTkPNRInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setETkPNRInd(String value) {
        this.eTkPNRInd = value;
    }

    /**
     * Gets the value of the mirWithInvoiceInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMIRWithInvoiceInd() {
        return mirWithInvoiceInd;
    }

    /**
     * Sets the value of the mirWithInvoiceInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMIRWithInvoiceInd(String value) {
        this.mirWithInvoiceInd = value;
    }

    /**
     * Gets the value of the mirNoInvoiceInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMIRNoInvoiceInd() {
        return mirNoInvoiceInd;
    }

    /**
     * Sets the value of the mirNoInvoiceInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMIRNoInvoiceInd(String value) {
        this.mirNoInvoiceInd = value;
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
     * Gets the value of the manualCCOverrideCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManualCCOverrideCode() {
        return manualCCOverrideCode;
    }

    /**
     * Sets the value of the manualCCOverrideCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManualCCOverrideCode(String value) {
        this.manualCCOverrideCode = value;
    }

    /**
     * Gets the value of the tkPCC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTkPCC() {
        return tkPCC;
    }

    /**
     * Sets the value of the tkPCC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTkPCC(String value) {
        this.tkPCC = value;
    }

}
