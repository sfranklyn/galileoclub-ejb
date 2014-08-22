//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-548 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.03.31 at 11:27:25 AM ICT 
//


package com.galileoindonesia.schema.pnr;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
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
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}PNRAddr"/>
 *           &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}TargetCRSInfo"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}PNRAirIndex" minOccurs="0"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}CustNameInfo" minOccurs="0"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}CurrentPNR" minOccurs="0"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}RequiredData" minOccurs="0"/>
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
    "pnrAddrOrTargetCRSInfo",
    "pnrAirIndex",
    "custNameInfo",
    "currentPNR",
    "requiredData"
})
@XmlRootElement(name = "PNRBFRetrieveMods")
public class PNRBFRetrieveMods implements Serializable
{

    @XmlElements({
        @XmlElement(name = "PNRAddr", type = PNRAddr.class),
        @XmlElement(name = "TargetCRSInfo", type = TargetCRSInfo.class)
    })
    protected List<Object> pnrAddrOrTargetCRSInfo;
    @XmlElement(name = "PNRAirIndex")
    protected PNRAirIndex pnrAirIndex;
    @XmlElement(name = "CustNameInfo")
    protected CustNameInfo custNameInfo;
    @XmlElement(name = "CurrentPNR")
    protected String currentPNR;
    @XmlElement(name = "RequiredData")
    protected RequiredData requiredData;

    /**
     * Gets the value of the pnrAddrOrTargetCRSInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pnrAddrOrTargetCRSInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPNRAddrOrTargetCRSInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PNRAddr }
     * {@link TargetCRSInfo }
     * 
     * 
     */
    public List<Object> getPNRAddrOrTargetCRSInfo() {
        if (pnrAddrOrTargetCRSInfo == null) {
            pnrAddrOrTargetCRSInfo = new ArrayList<Object>();
        }
        return this.pnrAddrOrTargetCRSInfo;
    }

    /**
     * Gets the value of the pnrAirIndex property.
     * 
     * @return
     *     possible object is
     *     {@link PNRAirIndex }
     *     
     */
    public PNRAirIndex getPNRAirIndex() {
        return pnrAirIndex;
    }

    /**
     * Sets the value of the pnrAirIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link PNRAirIndex }
     *     
     */
    public void setPNRAirIndex(PNRAirIndex value) {
        this.pnrAirIndex = value;
    }

    /**
     * Gets the value of the custNameInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CustNameInfo }
     *     
     */
    public CustNameInfo getCustNameInfo() {
        return custNameInfo;
    }

    /**
     * Sets the value of the custNameInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustNameInfo }
     *     
     */
    public void setCustNameInfo(CustNameInfo value) {
        this.custNameInfo = value;
    }

    /**
     * Gets the value of the currentPNR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentPNR() {
        return currentPNR;
    }

    /**
     * Sets the value of the currentPNR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentPNR(String value) {
        this.currentPNR = value;
    }

    /**
     * Gets the value of the requiredData property.
     * 
     * @return
     *     possible object is
     *     {@link RequiredData }
     *     
     */
    public RequiredData getRequiredData() {
        return requiredData;
    }

    /**
     * Sets the value of the requiredData property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequiredData }
     *     
     */
    public void setRequiredData(RequiredData value) {
        this.requiredData = value;
    }

}