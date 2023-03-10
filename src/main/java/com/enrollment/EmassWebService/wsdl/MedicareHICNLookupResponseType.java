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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MedicareHICNLookupResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MedicareHICNLookupResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.healthedge.com/connector/schema/basetypes}HealthRulesResourceType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="memberHccID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="asOfDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="medicareHICNs" type="{http://www.healthedge.com/connector/schema/medicarehicn}MedicareHICNsType" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.healthedge.com/connector/schema/basetypes}ErrorStatusGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MedicareHICNLookupResponseType", namespace = "http://www.healthedge.com/connector/schema/medicarehicn", propOrder = {
    "memberHccID",
    "asOfDate",
    "medicareHICNs",
    "status",
    "errors"
})
public class MedicareHICNLookupResponseType
    extends HealthRulesResourceType
{

    protected String memberHccID;
    protected String asOfDate;
    protected MedicareHICNsType medicareHICNs;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ServiceStatusType status;
    protected ErrorsType errors;

    /**
     * Gets the value of the memberHccID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberHccID() {
        return memberHccID;
    }

    /**
     * Sets the value of the memberHccID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberHccID(String value) {
        this.memberHccID = value;
    }

    /**
     * Gets the value of the asOfDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsOfDate() {
        return asOfDate;
    }

    /**
     * Sets the value of the asOfDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsOfDate(String value) {
        this.asOfDate = value;
    }

    /**
     * Gets the value of the medicareHICNs property.
     * 
     * @return
     *     possible object is
     *     {@link MedicareHICNsType }
     *     
     */
    public MedicareHICNsType getMedicareHICNs() {
        return medicareHICNs;
    }

    /**
     * Sets the value of the medicareHICNs property.
     * 
     * @param value
     *     allowed object is
     *     {@link MedicareHICNsType }
     *     
     */
    public void setMedicareHICNs(MedicareHICNsType value) {
        this.medicareHICNs = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceStatusType }
     *     
     */
    public ServiceStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceStatusType }
     *     
     */
    public void setStatus(ServiceStatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the errors property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorsType }
     *     
     */
    public ErrorsType getErrors() {
        return errors;
    }

    /**
     * Sets the value of the errors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorsType }
     *     
     */
    public void setErrors(ErrorsType value) {
        this.errors = value;
    }

}
