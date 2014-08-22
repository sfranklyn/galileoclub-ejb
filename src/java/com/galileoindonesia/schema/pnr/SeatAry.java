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
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
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
 *         &lt;element name="Seat">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}AttribAry"/>
 *                   &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}Locn"/>
 *                   &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}Txt"/>
 *                   &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}AvailStatus"/>
 *                   &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}SeatType"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "seat"
})
@XmlRootElement(name = "SeatAry")
public class SeatAry implements Serializable
{

    @XmlElement(name = "Seat", required = true)
    protected SeatAry.Seat seat;

    /**
     * Gets the value of the seat property.
     * 
     * @return
     *     possible object is
     *     {@link SeatAry.Seat }
     *     
     */
    public SeatAry.Seat getSeat() {
        return seat;
    }

    /**
     * Sets the value of the seat property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatAry.Seat }
     *     
     */
    public void setSeat(SeatAry.Seat value) {
        this.seat = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice maxOccurs="unbounded" minOccurs="0">
     *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}AttribAry"/>
     *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}Locn"/>
     *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}Txt"/>
     *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}AvailStatus"/>
     *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}SeatType"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "attribAryOrLocnOrStatus"
    })
    public static class Seat
        implements Serializable
    {

        @XmlElementRefs({
            @XmlElementRef(name = "Txt", namespace = "http://www.galileoindonesia.com/schema/PNR", type = JAXBElement.class),
            @XmlElementRef(name = "Locn", namespace = "http://www.galileoindonesia.com/schema/PNR", type = JAXBElement.class),
            @XmlElementRef(name = "AvailStatus", namespace = "http://www.galileoindonesia.com/schema/PNR", type = JAXBElement.class),
            @XmlElementRef(name = "SeatType", namespace = "http://www.galileoindonesia.com/schema/PNR", type = JAXBElement.class),
            @XmlElementRef(name = "Status", namespace = "http://www.galileoindonesia.com/schema/PNR", type = JAXBElement.class),
            @XmlElementRef(name = "AttribAry", namespace = "http://www.galileoindonesia.com/schema/PNR", type = AttribAry.class)
        })
        protected List<Object> attribAryOrLocnOrStatus;

        /**
         * Gets the value of the attribAryOrLocnOrStatus property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the attribAryOrLocnOrStatus property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAttribAryOrLocnOrStatus().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link AttribAry }
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * 
         * 
         */
        public List<Object> getAttribAryOrLocnOrStatus() {
            if (attribAryOrLocnOrStatus == null) {
                attribAryOrLocnOrStatus = new ArrayList<Object>();
            }
            return this.attribAryOrLocnOrStatus;
        }

    }

}
