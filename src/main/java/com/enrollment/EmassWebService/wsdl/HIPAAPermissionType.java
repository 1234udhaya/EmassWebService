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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for HIPAAPermissionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HIPAAPermissionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;group ref="{http://www.healthedge.com/connector/schema/basetypes}HIPAAPermissionGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HIPAAPermissionType", propOrder = {
    "permissionScope",
    "effectiveStartDate",
    "effectiveEndDate",
    "permittedPerson",
    "hipaaPermissionGroupPhoneList",
    "relationshipToMemberCode"
})
public class HIPAAPermissionType {

    protected String permissionScope;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveStartDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveEndDate;
    protected PersonNameType permittedPerson;
    @XmlElement(name = "hIPAAPermissionGroupPhoneList")
    protected TelephoneNumberListType hipaaPermissionGroupPhoneList;
    protected CodeEntryInputType relationshipToMemberCode;

    /**
     * Gets the value of the permissionScope property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPermissionScope() {
        return permissionScope;
    }

    /**
     * Sets the value of the permissionScope property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPermissionScope(String value) {
        this.permissionScope = value;
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
     * Gets the value of the permittedPerson property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameType }
     *     
     */
    public PersonNameType getPermittedPerson() {
        return permittedPerson;
    }

    /**
     * Sets the value of the permittedPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameType }
     *     
     */
    public void setPermittedPerson(PersonNameType value) {
        this.permittedPerson = value;
    }

    /**
     * Gets the value of the hipaaPermissionGroupPhoneList property.
     * 
     * @return
     *     possible object is
     *     {@link TelephoneNumberListType }
     *     
     */
    public TelephoneNumberListType getHIPAAPermissionGroupPhoneList() {
        return hipaaPermissionGroupPhoneList;
    }

    /**
     * Sets the value of the hipaaPermissionGroupPhoneList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelephoneNumberListType }
     *     
     */
    public void setHIPAAPermissionGroupPhoneList(TelephoneNumberListType value) {
        this.hipaaPermissionGroupPhoneList = value;
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
