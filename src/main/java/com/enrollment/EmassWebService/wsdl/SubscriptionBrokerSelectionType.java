//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.01.13 at 03:47:37 PM IST 
//


package com.enrollment.EmassWebService.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubscriptionBrokerSelectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscriptionBrokerSelectionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="broker" type="{http://www.healthedge.com/connector/schema/subscriptionsparse}SubscriptionBrokerType" minOccurs="0"/&gt;
 *         &lt;element name="dateRanges" type="{http://www.healthedge.com/connector/schema/subscriptionsparse}SubscriptionBrokerDateRangeType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriptionBrokerSelectionType", namespace = "http://www.healthedge.com/connector/schema/subscriptionsparse", propOrder = {
    "broker",
    "dateRanges"
})
public class SubscriptionBrokerSelectionType {

    protected SubscriptionBrokerType broker;
    @XmlElement(required = true)
    protected List<SubscriptionBrokerDateRangeType> dateRanges;

    /**
     * Gets the value of the broker property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionBrokerType }
     *     
     */
    public SubscriptionBrokerType getBroker() {
        return broker;
    }

    /**
     * Sets the value of the broker property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionBrokerType }
     *     
     */
    public void setBroker(SubscriptionBrokerType value) {
        this.broker = value;
    }

    /**
     * Gets the value of the dateRanges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dateRanges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDateRanges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubscriptionBrokerDateRangeType }
     * 
     * 
     */
    public List<SubscriptionBrokerDateRangeType> getDateRanges() {
        if (dateRanges == null) {
            dateRanges = new ArrayList<SubscriptionBrokerDateRangeType>();
        }
        return this.dateRanges;
    }

}