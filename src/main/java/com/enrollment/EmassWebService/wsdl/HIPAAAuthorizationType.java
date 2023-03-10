//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.01.13 at 03:47:37 PM IST 
//


package com.enrollment.EmassWebService.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for HIPAAAuthorizationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HIPAAAuthorizationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;group ref="{http://www.healthedge.com/connector/schema/basetypes}HIPAAAuthorizationGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HIPAAAuthorizationType", propOrder = {
    "authorizationType",
    "authorizationScope",
    "effectiveStartDate",
    "effectiveEndDate",
    "whoCanBeDisclosedTo",
    "signature",
    "signatureDate",
    "authorizationPurposeCode"
})
public class HIPAAAuthorizationType {

    @XmlSchemaType(name = "string")
    protected PHIAuthorizationType authorizationType;
    protected String authorizationScope;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveStartDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveEndDate;
    protected String whoCanBeDisclosedTo;
    protected String signature;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar signatureDate;
    protected CodeEntryInputType authorizationPurposeCode;

    /**
     * Gets the value of the authorizationType property.
     * 
     * @return
     *     possible object is
     *     {@link PHIAuthorizationType }
     *     
     */
    public PHIAuthorizationType getAuthorizationType() {
        return authorizationType;
    }

    /**
     * Sets the value of the authorizationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PHIAuthorizationType }
     *     
     */
    public void setAuthorizationType(PHIAuthorizationType value) {
        this.authorizationType = value;
    }

    /**
     * Gets the value of the authorizationScope property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizationScope() {
        return authorizationScope;
    }

    /**
     * Sets the value of the authorizationScope property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationScope(String value) {
        this.authorizationScope = value;
    }

    /**
     * Gets the value of the effectiveStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveStartDate() {
        return effectiveStartDate;
    }

    /**
     * Sets the value of the effectiveStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveStartDate(XMLGregorianCalendar value) {
        this.effectiveStartDate = value;
    }

    /**
     * Gets the value of the effectiveEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveEndDate() {
        return effectiveEndDate;
    }

    /**
     * Sets the value of the effectiveEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveEndDate(XMLGregorianCalendar value) {
        this.effectiveEndDate = value;
    }

    /**
     * Gets the value of the whoCanBeDisclosedTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWhoCanBeDisclosedTo() {
        return whoCanBeDisclosedTo;
    }

    /**
     * Sets the value of the whoCanBeDisclosedTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWhoCanBeDisclosedTo(String value) {
        this.whoCanBeDisclosedTo = value;
    }

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignature(String value) {
        this.signature = value;
    }

    /**
     * Gets the value of the signatureDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSignatureDate() {
        return signatureDate;
    }

    /**
     * Sets the value of the signatureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSignatureDate(XMLGregorianCalendar value) {
        this.signatureDate = value;
    }

    /**
     * Gets the value of the authorizationPurposeCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeEntryInputType }
     *     
     */
    public CodeEntryInputType getAuthorizationPurposeCode() {
        return authorizationPurposeCode;
    }

    /**
     * Sets the value of the authorizationPurposeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeEntryInputType }
     *     
     */
    public void setAuthorizationPurposeCode(CodeEntryInputType value) {
        this.authorizationPurposeCode = value;
    }

}
