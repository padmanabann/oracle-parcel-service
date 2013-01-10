//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.12.03 at 05:26:51 PM PST 
//


package com.oracle.demo.ops.domain;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetParcelByIdRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetParcelByIdRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequestHeader" type="{http://demo.oracle.com/ops/domain/services/common}WebServiceRequestHeaderType"/>
 *         &lt;element name="ParcelId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetParcelByIdRequestType", namespace = "http://demo.oracle.com/ops/domain/services/parcel", propOrder = {
    "requestHeader",
    "parcelId"
})
@XmlRootElement(name = "GetParcelByIdRequest", namespace = "http://demo.oracle.com/ops/domain/services/parcel")
public class GetParcelByIdRequest
    implements Serializable
{

    private final static long serialVersionUID = 678L;
    @XmlElement(name = "RequestHeader", required = true)
    protected WebServiceRequestHeader requestHeader;
    @XmlElement(name = "ParcelId")
    protected int parcelId;

    /**
     * Gets the value of the requestHeader property.
     * 
     * @return
     *     possible object is
     *     {@link WebServiceRequestHeader }
     *     
     */
    public WebServiceRequestHeader getRequestHeader() {
        return requestHeader;
    }

    /**
     * Sets the value of the requestHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebServiceRequestHeader }
     *     
     */
    public void setRequestHeader(WebServiceRequestHeader value) {
        this.requestHeader = value;
    }

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

}
