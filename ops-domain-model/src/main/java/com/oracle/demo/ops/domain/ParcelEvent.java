//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.10.10 at 12:10:49 PM PDT 
//


package com.oracle.demo.ops.domain;

import java.io.Serializable;
import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter1;


/**
 * <p>Java class for ParcelEventType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParcelEventType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://demo.oracle.com/ops/domain/schema/common}BaseEntity">
 *       &lt;sequence>
 *         &lt;element name="ParcelId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EventDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ParcelStatus" type="{http://demo.oracle.com/ops/domain/schema/shipping}ParcelStatus"/>
 *         &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParcelEventType", namespace = "http://demo.oracle.com/ops/domain/schema/shipping", propOrder = {
    "parcelId",
    "eventDate",
    "parcelStatus",
    "location",
    "message"
})
@XmlRootElement(name = "ParcelEvent", namespace = "http://demo.oracle.com/ops/domain/schema/shipping")
public class ParcelEvent
    extends BaseEntity
    implements Serializable
{

    private final static long serialVersionUID = 678L;
    @XmlElement(name = "ParcelId")
    protected int parcelId;
    @XmlElement(name = "EventDate", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar eventDate;
    @XmlElement(name = "ParcelStatus", required = true)
    protected ParcelStatus parcelStatus;
    @XmlElement(name = "Location", required = true)
    protected String location;
    @XmlElement(name = "Message", required = true)
    protected String message;

    /**
     * Gets the value of the parcelId property.
     * 
     */
    public int getParcelId() {
        return parcelId;
    }

    /**
     * Sets the value of the parcelId property.
     * 
     */
    public void setParcelId(int value) {
        this.parcelId = value;
    }

    /**
     * Gets the value of the eventDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getEventDate() {
        return eventDate;
    }

    /**
     * Sets the value of the eventDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventDate(Calendar value) {
        this.eventDate = value;
    }

    /**
     * Gets the value of the parcelStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ParcelStatus }
     *     
     */
    public ParcelStatus getParcelStatus() {
        return parcelStatus;
    }

    /**
     * Sets the value of the parcelStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParcelStatus }
     *     
     */
    public void setParcelStatus(ParcelStatus value) {
        this.parcelStatus = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

}
