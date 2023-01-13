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
 * <p>Java class for AuthorizedIndividualType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuthorizedIndividualType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;group ref="{http://www.healthedge.com/connector/schema/basetypes}AuthorizedIndividualGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthorizedIndividualType", propOrder = {
    "effectiveStartDate",
    "effectiveEndDate",
    "scope",
    "hccReviewer",
    "documentsReceivedDate",
    "authorizedPerson",
    "postalAddress",
    "authorizedIndividualGroupPhoneList",
    "representativeTypeCode",
    "relationshipToMemberCode"
})
public class AuthorizedIndividualType {

    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveStartDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveEndDate;
    protected String scope;
    protected String hccReviewer;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar documentsReceivedDate;
    protected PersonNameType authorizedPerson;
    protected PostalAddressType postalAddress;
    protected TelephoneNumberListType authorizedIndividualGroupPhoneList;
    protected CodeEntryInputType representativeTypeCode;
    protected CodeEntryInputType relationshipToMemberCode;

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
     * Gets the value of the scope property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScope() {
        return scope;
    }

    /**
     * Sets the value of the scope property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScope(String value) {
        this.scope = value;
    }

    /**
     * Gets the value of the hccReviewer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHccReviewer() {
        return hccReviewer;
    }

    /**
     * Sets the value of the hccReviewer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHccReviewer(String value) {
        this.hccReviewer = value;
    }

    /**
     * Gets the value of the documentsReceivedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocumentsReceivedDate() {
        return documentsReceivedDate;
    }

    /**
     * Sets the value of the documentsReceivedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocumentsReceivedDate(XMLGregorianCalendar value) {
        this.documentsReceivedDate = value;
    }

    /**
     * Gets the value of the authorizedPerson property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameType }
     *     
     */
    public PersonNameType getAuthorizedPerson() {
        return authorizedPerson;
    }

    /**
     * Sets the value of the authorizedPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameType }
     *     
     */
    public void setAuthorizedPerson(PersonNameType value) {
        this.authorizedPerson = value;
    }

    /**
     * Gets the value of the postalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddressType }
     *     
     */
    public PostalAddressType getPostalAddress() {
        return postalAddress;
    }

    /**
     * Sets the value of the postalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddressType }
     *     
     */
    public void setPostalAddress(PostalAddressType value) {
        this.postalAddress = value;
    }

    /**
     * Gets the value of the authorizedIndividualGroupPhoneList property.
     * 
     * @return
     *     possible object is
     *     {@link TelephoneNumberListType }
     *     
     */
    public TelephoneNumberListType getAuthorizedIndividualGroupPhoneList() {
        return authorizedIndividualGroupPhoneList;
    }

    /**
     * Sets the value of the authorizedIndividualGroupPhoneList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelephoneNumberListType }
     *     
     */
    public void setAuthorizedIndividualGroupPhoneList(TelephoneNumberListType value) {
        this.authorizedIndividualGroupPhoneList = value;
    }

    /**
     * Gets the value of the representativeTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeEntryInputType }
     *     
     */
    public CodeEntryInputType getRepresentativeTypeCode() {
        return representativeTypeCode;
    }

    /**
     * Sets the value of the representativeTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeEntryInputType }
     *     
     */
    public void setRepresentativeTypeCode(CodeEntryInputType value) {
        this.representativeTypeCode = value;
    }

    /**
     * Gets the value of the relationshipToMemberCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeEntryInputType }
     *     
     */
    public CodeEntryInputType getRelationshipToMemberCode() {
        return relationshipToMemberCode;
    }

    /**
     * Sets the value of the relationshipToMemberCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeEntryInputType }
     *     
     */
    public void setRelationshipToMemberCode(CodeEntryInputType value) {
        this.relationshipToMemberCode = value;
    }

}
