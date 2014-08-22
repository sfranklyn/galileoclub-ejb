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
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}FirstJointAirV"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}SecondJointAirV"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}FirstFootnoteCoreOffset"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}FirstFootnoteKeyNum"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}SecondFootnoteCoreOffset"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}SecondFootnoteKeyNum"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}QualityControlBits"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}Spare4"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}ExceptionRuleUsed"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}DirectionalityApplies"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}OWFareType"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}PartialRule"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}RuleMapDisplacement"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}CatsApplyInds"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}RuleNum"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}TariffNum"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}RteNum"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}Acct"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}RteTariffNum"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}ViaCity1"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}ViaCity2"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}PsgrType"/>
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
    "firstJointAirV",
    "secondJointAirV",
    "firstFootnoteCoreOffset",
    "firstFootnoteKeyNum",
    "secondFootnoteCoreOffset",
    "secondFootnoteKeyNum",
    "qualityControlBits",
    "spare4",
    "exceptionRuleUsed",
    "directionalityApplies",
    "owFareType",
    "partialRule",
    "ruleMapDisplacement",
    "catsApplyInds",
    "ruleNum",
    "tariffNum",
    "rteNum",
    "acct",
    "rteTariffNum",
    "viaCity1",
    "viaCity2",
    "psgrType"
})
@XmlRootElement(name = "FareRuleInfoNQual")
public class FareRuleInfoNQual
    implements Serializable
{

    @XmlElement(name = "FirstJointAirV", required = true)
    protected String firstJointAirV;
    @XmlElement(name = "SecondJointAirV", required = true)
    protected String secondJointAirV;
    @XmlElement(name = "FirstFootnoteCoreOffset", required = true)
    protected String firstFootnoteCoreOffset;
    @XmlElement(name = "FirstFootnoteKeyNum", required = true)
    protected String firstFootnoteKeyNum;
    @XmlElement(name = "SecondFootnoteCoreOffset", required = true)
    protected String secondFootnoteCoreOffset;
    @XmlElement(name = "SecondFootnoteKeyNum", required = true)
    protected String secondFootnoteKeyNum;
    @XmlElement(name = "QualityControlBits", required = true)
    protected String qualityControlBits;
    @XmlElement(name = "Spare4", required = true)
    protected String spare4;
    @XmlElement(name = "ExceptionRuleUsed", required = true)
    protected String exceptionRuleUsed;
    @XmlElement(name = "DirectionalityApplies", required = true)
    protected String directionalityApplies;
    @XmlElement(name = "OWFareType", required = true)
    protected String owFareType;
    @XmlElement(name = "PartialRule", required = true)
    protected String partialRule;
    @XmlElement(name = "RuleMapDisplacement", required = true)
    protected String ruleMapDisplacement;
    @XmlElement(name = "CatsApplyInds", required = true)
    protected String catsApplyInds;
    @XmlElement(name = "RuleNum", required = true)
    protected String ruleNum;
    @XmlElement(name = "TariffNum", required = true)
    protected String tariffNum;
    @XmlElement(name = "RteNum", required = true)
    protected String rteNum;
    @XmlElement(name = "Acct", required = true)
    protected String acct;
    @XmlElement(name = "RteTariffNum", required = true)
    protected String rteTariffNum;
    @XmlElement(name = "ViaCity1", required = true)
    protected String viaCity1;
    @XmlElement(name = "ViaCity2", required = true)
    protected String viaCity2;
    @XmlElement(name = "PsgrType", required = true)
    protected String psgrType;

    /**
     * Gets the value of the firstJointAirV property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstJointAirV() {
        return firstJointAirV;
    }

    /**
     * Sets the value of the firstJointAirV property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstJointAirV(String value) {
        this.firstJointAirV = value;
    }

    /**
     * Gets the value of the secondJointAirV property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondJointAirV() {
        return secondJointAirV;
    }

    /**
     * Sets the value of the secondJointAirV property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondJointAirV(String value) {
        this.secondJointAirV = value;
    }

    /**
     * Gets the value of the firstFootnoteCoreOffset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstFootnoteCoreOffset() {
        return firstFootnoteCoreOffset;
    }

    /**
     * Sets the value of the firstFootnoteCoreOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstFootnoteCoreOffset(String value) {
        this.firstFootnoteCoreOffset = value;
    }

    /**
     * Gets the value of the firstFootnoteKeyNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstFootnoteKeyNum() {
        return firstFootnoteKeyNum;
    }

    /**
     * Sets the value of the firstFootnoteKeyNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstFootnoteKeyNum(String value) {
        this.firstFootnoteKeyNum = value;
    }

    /**
     * Gets the value of the secondFootnoteCoreOffset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondFootnoteCoreOffset() {
        return secondFootnoteCoreOffset;
    }

    /**
     * Sets the value of the secondFootnoteCoreOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondFootnoteCoreOffset(String value) {
        this.secondFootnoteCoreOffset = value;
    }

    /**
     * Gets the value of the secondFootnoteKeyNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondFootnoteKeyNum() {
        return secondFootnoteKeyNum;
    }

    /**
     * Sets the value of the secondFootnoteKeyNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondFootnoteKeyNum(String value) {
        this.secondFootnoteKeyNum = value;
    }

    /**
     * Gets the value of the qualityControlBits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualityControlBits() {
        return qualityControlBits;
    }

    /**
     * Sets the value of the qualityControlBits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualityControlBits(String value) {
        this.qualityControlBits = value;
    }

    /**
     * Gets the value of the spare4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpare4() {
        return spare4;
    }

    /**
     * Sets the value of the spare4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpare4(String value) {
        this.spare4 = value;
    }

    /**
     * Gets the value of the exceptionRuleUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExceptionRuleUsed() {
        return exceptionRuleUsed;
    }

    /**
     * Sets the value of the exceptionRuleUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExceptionRuleUsed(String value) {
        this.exceptionRuleUsed = value;
    }

    /**
     * Gets the value of the directionalityApplies property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectionalityApplies() {
        return directionalityApplies;
    }

    /**
     * Sets the value of the directionalityApplies property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectionalityApplies(String value) {
        this.directionalityApplies = value;
    }

    /**
     * Gets the value of the owFareType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOWFareType() {
        return owFareType;
    }

    /**
     * Sets the value of the owFareType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOWFareType(String value) {
        this.owFareType = value;
    }

    /**
     * Gets the value of the partialRule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartialRule() {
        return partialRule;
    }

    /**
     * Sets the value of the partialRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartialRule(String value) {
        this.partialRule = value;
    }

    /**
     * Gets the value of the ruleMapDisplacement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuleMapDisplacement() {
        return ruleMapDisplacement;
    }

    /**
     * Sets the value of the ruleMapDisplacement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuleMapDisplacement(String value) {
        this.ruleMapDisplacement = value;
    }

    /**
     * Gets the value of the catsApplyInds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatsApplyInds() {
        return catsApplyInds;
    }

    /**
     * Sets the value of the catsApplyInds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatsApplyInds(String value) {
        this.catsApplyInds = value;
    }

    /**
     * Gets the value of the ruleNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuleNum() {
        return ruleNum;
    }

    /**
     * Sets the value of the ruleNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuleNum(String value) {
        this.ruleNum = value;
    }

    /**
     * Gets the value of the tariffNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTariffNum() {
        return tariffNum;
    }

    /**
     * Sets the value of the tariffNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTariffNum(String value) {
        this.tariffNum = value;
    }

    /**
     * Gets the value of the rteNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRteNum() {
        return rteNum;
    }

    /**
     * Sets the value of the rteNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRteNum(String value) {
        this.rteNum = value;
    }

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
     * Gets the value of the rteTariffNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRteTariffNum() {
        return rteTariffNum;
    }

    /**
     * Sets the value of the rteTariffNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRteTariffNum(String value) {
        this.rteTariffNum = value;
    }

    /**
     * Gets the value of the viaCity1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViaCity1() {
        return viaCity1;
    }

    /**
     * Sets the value of the viaCity1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViaCity1(String value) {
        this.viaCity1 = value;
    }

    /**
     * Gets the value of the viaCity2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViaCity2() {
        return viaCity2;
    }

    /**
     * Sets the value of the viaCity2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViaCity2(String value) {
        this.viaCity2 = value;
    }

    /**
     * Gets the value of the psgrType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPsgrType() {
        return psgrType;
    }

    /**
     * Sets the value of the psgrType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPsgrType(String value) {
        this.psgrType = value;
    }

}