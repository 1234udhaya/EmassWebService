//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.01.13 at 03:47:37 PM IST 
//


package com.enrollment.EmassWebService.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceCategoryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceCategoryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="serviceCategoryName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="serviceCategoryType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceCategoryType", namespace = "http://www.healthedge.com/connector/schema/cobpolicy", propOrder = {
    "serviceCategoryName",
    "serviceCategoryType"
})
public class ServiceCategoryType2 {

    @XmlElement(required = true)
    protected String serviceCategoryName;
    @XmlElement(required = true)
    protected String serviceCategoryType;

    /**
     * Gets the value of the serviceCategoryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceCategoryName() {
        return serviceCategoryName;
    }

    /**
     * Sets the value of the serviceCategoryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceCategoryName(String value) {
        this.serviceCategoryName = value;
    }

    /**
     * Gets the value of the serviceCategoryType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceCategoryType() {
        return serviceCategoryType;
    }

    /**
     * Sets the value of the serviceCategoryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceCategoryType(String value) {
        this.serviceCategoryType = value;
    }

}
