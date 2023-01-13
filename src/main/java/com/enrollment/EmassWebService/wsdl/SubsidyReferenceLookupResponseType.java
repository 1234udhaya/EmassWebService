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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SubsidyReferenceLookupResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubsidyReferenceLookupResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.healthedge.com/connector/schema/basetypes}HealthRulesResourceType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="subsidyIdentifier" type="{http://www.healthedge.com/connector/schema/basetypes}IdentifierType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.healthedge.com/connector/schema/subsidy}SubsidyLookupGroup"/&gt;
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
@XmlType(name = "SubsidyReferenceLookupResponseType", namespace = "http://www.healthedge.com/connector/schema/subsidy", propOrder = {
    "subsidyIdentifier",
    "subscriptionHccId",
    "otherBillReceipientHccId",
    "benefitPlanTypeCode",
    "billingCategoryCode",
    "asOfDate",
    "status",
    "errors"
})
public class SubsidyReferenceLookupResponseType
    extends HealthRulesResourceType
{

    protected List<IdentifierType> subsidyIdentifier;
    protected String subscriptionHccId;
    protected String otherBillReceipientHccId;
    protected CodeEntryInputType benefitPlanTypeCode;
    protected CodeEntryInputType billingCategoryCode;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar asOfDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ServiceStatusType status;
    protected ErrorsType errors;

    /**
     * Gets the value of the subsidyIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subsidyIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubsidyIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     * 
     * 
     */
    public List<IdentifierType> getSubsidyIdentifier() {
        if (subsidyIdentifier == null) {
            subsidyIdentifier = new ArrayList<IdentifierType>();
        }
        return this.subsidyIdentifier;
    }

    /**
     * Gets the value of the subscriptionHccId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriptionHccId() {
        return subscriptionHccId;
    }

    /**
     * Sets the value of the subscriptionHccId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriptionHccId(String value) {
        this.subscriptionHccId = value;
    }

    /**
     * Gets the value of the otherBillReceipientHccId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherBillReceipientHccId() {
        return otherBillReceipientHccId;
    }

    /**
     * Sets the value of the otherBillReceipientHccId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherBillReceipientHccId(String value) {
        this.otherBillReceipientHccId = value;
    }

    /**
     * Gets the value of the benefitPlanTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeEntryInputType }
     *     
     */
    public CodeEntryInputType getBenefitPlanTypeCode() {
        return benefitPlanTypeCode;
    }

    /**
     * Sets the value of the benefitPlanTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeEntryInputType }
     *     
     */
    public void setBenefitPlanTypeCode(CodeEntryInputType value) {
        this.benefitPlanTypeCode = value;
    }

    /**
     * Gets the value of the billingCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeEntryInputType }
     *     
     */
    public CodeEntryInputType getBillingCategoryCode() {
        return billingCategoryCode;
    }

    /**
     * Sets the value of the billingCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeEntryInputType }
     *     
     */
    public void setBillingCategoryCode(CodeEntryInputType value) {
        this.billingCategoryCode = value;
    }

    /**
     * Gets the value of the asOfDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAsOfDate() {
        return asOfDate;
    }

    /**
     * Sets the value of the asOfDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAsOfDate(XMLGregorianCalendar value) {
        this.asOfDate = value;
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
