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
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}Acct"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}PCC"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}Contract"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}PFType"/>
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
    "acct",
    "pcc",
    "contract",
    "pfType"
})
@XmlRootElement(name = "PFMod")
public class PFMod implements Serializable
{

    @XmlElement(name = "Acct", required = true)
    protected String acct;
    @XmlElement(name = "PCC", required = true)
    protected String pcc;
    @XmlElement(name = "Contract", required = true)
    protected String contract;
    @XmlElement(name = "PFType", required = true)
    protected String pfType;

    /**
     * Gets the value of the acct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcct() {
        return acct;
    }

    /**
     * Sets the value of the acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcct(String value) {
        this.acct = value;
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
     * Gets the value of the contract property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContract() {
        return contract;
    }

    /**
     * Sets the value of the contract property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContract(String value) {
        this.contract = value;
    }

    /**
     * Gets the value of the pfType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPFType() {
        return pfType;
    }

    /**
     * Sets the value of the pfType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPFType(String value) {
        this.pfType = value;
    }

}
