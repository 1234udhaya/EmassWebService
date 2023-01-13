//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.01.13 at 03:47:37 PM IST 
//


package com.enrollment.EmassWebService.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubscriptionBrokerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscriptionBrokerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="brokerIdentifier" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="brokerHccId" type="{http://www.healthedge.com/connector/schema/basetypes}String50Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriptionBrokerType", namespace = "http://www.healthedge.com/connector/schema/subscriptionsparse", propOrder = {
    "brokerIdentifier",
    "brokerHccId"
})
public class SubscriptionBrokerType {

    protected Long brokerIdentifier;
    protected String brokerHccId;

    /**
     * Gets the value of the brokerIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBrokerIdentifier() {
        return brokerIdentifier;
    }

    /**
     * Sets the value of the brokerIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBrokerIdentifier(Long value) {
        this.brokerIdentifier = value;
    }

    /**
     * Gets the value of the brokerHccId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrokerHccId() {
        return brokerHccId;
    }

    /**
     * Sets the value of the brokerHccId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrokerHccId(String value) {
        this.brokerHccId = value;
    }

}