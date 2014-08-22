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
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}FileType"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}DataType"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}PCC1"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}PCC2"/>
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
    "fileType",
    "dataType",
    "pcc1",
    "pcc2"
})
@XmlRootElement(name = "VendorData")
public class VendorData
    implements Serializable
{

    @XmlElement(name = "FileType", required = true)
    protected String fileType;
    @XmlElement(name = "DataType", required = true)
    protected String dataType;
    @XmlElement(name = "PCC1", required = true)
    protected String pcc1;
    @XmlElement(name = "PCC2", required = true)
    protected String pcc2;

    /**
     * Gets the value of the fileType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileType() {
        return fileType;
    }

    /**
     * Sets the value of the fileType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileType(String value) {
        this.fileType = value;
    }

    /**
     * Gets the value of the dataType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataType(String value) {
        this.dataType = value;
    }

    /**
     * Gets the value of the pcc1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCC1() {
        return pcc1;
    }

    /**
     * Sets the value of the pcc1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCC1(String value) {
        this.pcc1 = value;
    }

    /**
     * Gets the value of the pcc2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCC2() {
        return pcc2;
    }

    /**
     * Sets the value of the pcc2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCC2(String value) {
        this.pcc2 = value;
    }

}
