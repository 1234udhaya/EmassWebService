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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ClaimReviewType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClaimReviewType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;group ref="{http://www.healthedge.com/connector/schema/enrollmenttypes}ClaimReviewGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClaimReviewType", namespace = "http://www.healthedge.com/connector/schema/enrollmenttypes", propOrder = {
    "enableClaimReview",
    "claimType",
    "claimReviewReasonCode",
    "reviewReasonDescription",
    "requestingUser",
    "reviewServiceStartDate",
    "reviewServiceEndDate",
    "reviewReceiptStartDate",
    "reviewReceiptEndDate",
    "reviewPractitionerList",
    "reviewSupplierList"
})
@XmlSeeAlso({
    MemberClaimReviewType.class
})
public class ClaimReviewType2 {

    protected Boolean enableClaimReview;
    @XmlElement(defaultValue = "Review All Claims")
    @XmlSchemaType(name = "string")
    protected ClaimReviewClaimType claimType;
    protected CodeEntryInputType claimReviewReasonCode;
    protected String reviewReasonDescription;
    protected String requestingUser;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar reviewServiceStartDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar reviewServiceEndDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar reviewReceiptStartDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar reviewReceiptEndDate;
    protected ReviewPactitionerType reviewPractitionerList;
    protected ReviewSupplierType reviewSupplierList;

    /**
     * Gets the value of the enableClaimReview property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableClaimReview() {
        return enableClaimReview;
    }

    /**
     * Sets the value of the enableClaimReview property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableClaimReview(Boolean value) {
        this.enableClaimReview = value;
    }

    /**
     * Gets the value of the claimType property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimReviewClaimType }
     *     
     */
    public ClaimReviewClaimType getClaimType() {
        return claimType;
    }

    /**
     * Sets the value of the claimType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimReviewClaimType }
     *     
     */
    public void setClaimType(ClaimReviewClaimType value) {
        this.claimType = value;
    }

    /**
     * Gets the value of the claimReviewReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeEntryInputType }
     *     
     */
    public CodeEntryInputType getClaimReviewReasonCode() {
        return claimReviewReasonCode;
    }

    /**
     * Sets the value of the claimReviewReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeEntryInputType }
     *     
     */
    public void setClaimReviewReasonCode(CodeEntryInputType value) {
        this.claimReviewReasonCode = value;
    }

    /**
     * Gets the value of the reviewReasonDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReviewReasonDescription() {
        return reviewReasonDescription;
    }

    /**
     * Sets the value of the reviewReasonDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReviewReasonDescription(String value) {
        this.reviewReasonDescription = value;
    }

    /**
     * Gets the value of the requestingUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestingUser() {
        return requestingUser;
    }

    /**
     * Sets the value of the requestingUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestingUser(String value) {
        this.requestingUser = value;
    }

    /**
     * Gets the value of the reviewServiceStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReviewServiceStartDate() {
        return reviewServiceStartDate;
    }

    /**
     * Sets the value of the reviewServiceStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReviewServiceStartDate(XMLGregorianCalendar value) {
        this.reviewServiceStartDate = value;
    }

    /**
     * Gets the value of the reviewServiceEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReviewServiceEndDate() {
        return reviewServiceEndDate;
    }

    /**
     * Sets the value of the reviewServiceEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReviewServiceEndDate(XMLGregorianCalendar value) {
        this.reviewServiceEndDate = value;
    }

    /**
     * Gets the value of the reviewReceiptStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReviewReceiptStartDate() {
        return reviewReceiptStartDate;
    }

    /**
     * Sets the value of the reviewReceiptStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReviewReceiptStartDate(XMLGregorianCalendar value) {
        this.reviewReceiptStartDate = value;
    }

    /**
     * Gets the value of the reviewReceiptEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReviewReceiptEndDate() {
        return reviewReceiptEndDate;
    }

    /**
     * Sets the value of the reviewReceiptEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReviewReceiptEndDate(XMLGregorianCalendar value) {
        this.reviewReceiptEndDate = value;
    }

    /**
     * Gets the value of the reviewPractitionerList property.
     * 
     * @return
     *     possible object is
     *     {@link ReviewPactitionerType }
     *     
     */
    public ReviewPactitionerType getReviewPractitionerList() {
        return reviewPractitionerList;
    }

    /**
     * Sets the value of the reviewPractitionerList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReviewPactitionerType }
     *     
     */
    public void setReviewPractitionerList(ReviewPactitionerType value) {
        this.reviewPractitionerList = value;
    }

    /**
     * Gets the value of the reviewSupplierList property.
     * 
     * @return
     *     possible object is
     *     {@link ReviewSupplierType }
     *     
     */
    public ReviewSupplierType getReviewSupplierList() {
        return reviewSupplierList;
    }

    /**
     * Sets the value of the reviewSupplierList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReviewSupplierType }
     *     
     */
    public void setReviewSupplierList(ReviewSupplierType value) {
        this.reviewSupplierList = value;
    }

}
