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
 * <p>Java class for ContactType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="title" type="{http://www.healthedge.com/connector/schema/basetypes}String60Type" minOccurs="0"/&gt;
 *         &lt;element name="emailAddress" type="{http://www.healthedge.com/connector/schema/basetypes}EmailAddressValueType" minOccurs="0"/&gt;
 *         &lt;element name="personName" type="{http://www.healthedge.com/connector/schema/basetypes}PersonNameType" minOccurs="0"/&gt;
 *         &lt;element name="telephoneList" type="{http://www.healthedge.com/connector/schema/basetypes}TelephoneNumberListType" minOccurs="0"/&gt;
 *         &lt;element name="usageTypeCode" type="{http://www.healthedge.com/connector/schema/basetypes}CodeEntryInputType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactType", propOrder = {
    "title",
    "emailAddress",
    "personName",
    "telephoneList",
    "usageTypeCode"
})
public class ContactType {

    protected String title;
    protected String emailAddress;
    protected PersonNameType personName;
    protected TelephoneNumberListType telephoneList;
    protected CodeEntryInputType usageTypeCode;

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the personName property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameType }
     *     
     */
    public PersonNameType getPersonName() {
        return personName;
    }

    /**
     * Sets the value of the personName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameType }
     *     
     */
    public void setPersonName(PersonNameType value) {
        this.personName = value;
    }

    /**
     * Gets the value of the telephoneList property.
     * 
     * @return
     *     possible object is
     *     {@link TelephoneNumberListType }
     *     
     */
    public TelephoneNumberListType getTelephoneList() {
        return telephoneList;
    }

    /**
     * Sets the value of the telephoneList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelephoneNumberListType }
     *     
     */
    public void setTelephoneList(TelephoneNumberListType value) {
        this.telephoneList = value;
    }

    /**
     * Gets the value of the usageTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeEntryInputType }
     *     
     */
    public CodeEntryInputType getUsageTypeCode() {
        return usageTypeCode;
    }

    /**
     * Sets the value of the usageTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeEntryInputType }
     *     
     */
    public void setUsageTypeCode(CodeEntryInputType value) {
        this.usageTypeCode = value;
    }

}