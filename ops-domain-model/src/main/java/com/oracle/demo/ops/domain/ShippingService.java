//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.10.28 at 04:52:19 PM PDT 
//


package com.oracle.demo.ops.domain;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShippingServiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShippingServiceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://demo.oracle.com/ops/domain/schema/shipping}ShippingServiceName"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Cost" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="DeliveryEstimate" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShippingServiceType", namespace = "http://demo.oracle.com/ops/domain/schema/shipping", propOrder = {
    "name",
    "description",
    "cost",
    "deliveryEstimate"
})
@XmlRootElement(name = "ShippingService", namespace = "http://demo.oracle.com/ops/domain/schema/shipping")
public class ShippingService
    implements Serializable
{

    private final static long serialVersionUID = 678L;
    @XmlElement(name = "Name", required = true)
    protected ShippingServiceName name;
    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "Cost")
    protected double cost;
    @XmlElement(name = "DeliveryEstimate")
    protected int deliveryEstimate;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingServiceName }
     *     
     */
    public ShippingServiceName getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingServiceName }
     *     
     */
    public void setName(ShippingServiceName value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the cost property.
     * 
     */
    public double getCost() {
        return cost;
    }

    /**
     * Sets the value of the cost property.
     * 
     */
    public void setCost(double value) {
        this.cost = value;
    }

    /**
     * Gets the value of the deliveryEstimate property.
     * 
     */
    public int getDeliveryEstimate() {
        return deliveryEstimate;
    }

    /**
     * Sets the value of the deliveryEstimate property.
     * 
     */
    public void setDeliveryEstimate(int value) {
        this.deliveryEstimate = value;
    }

}
