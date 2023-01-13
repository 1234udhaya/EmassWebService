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


/**
 * <p>Java class for IndividualCommunicationPreferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndividualCommunicationPreferencesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.healthedge.com/connector/schema/basetypes}IndividualCommunicationPreferencesGroup"/&gt;
 *         &lt;element name="emailFormatCode" type="{http://www.healthedge.com/connector/schema/basetypes}CodeEntryInputType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualCommunicationPreferencesType", propOrder = {
    "contactMethod",
    "documentDeliveryMethodCode",
    "emailFormatCode"
})
public class IndividualCommunicationPreferencesType {

    @XmlSchemaType(name = "string")
    protected CommunicationContactMethodType contactMethod;
    protected CodeEntryInputType documentDeliveryMethodCode;
    protected CodeEntryInputType emailFormatCode;

    /**
     * Gets the value of the contactMethod property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationContactMethodType }
     *     
     */
    public CommunicationContactMethodType getContactMethod() {
        return contactMethod;
    }

    /**
     * Sets the value of the contactMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationContactMethodType }
     *     
     */
    public void setContactMethod(CommunicationContactMethodType value) {
        this.contactMethod = value;
    }

    /**
     * Gets the value of the documentDeliveryMethodCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeEntryInputType }
     *     
     */
    public CodeEntryInputType getDocumentDeliveryMethodCode() {
        return documentDeliveryMethodCode;
    }

    /**
     * Sets the value of the documentDeliveryMethodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeEntryInputType }
     *     
     */
    public void setDocumentDeliveryMethodCode(CodeEntryInputType value) {
        this.documentDeliveryMethodCode = value;
    }

    /**
     * Gets the value of the emailFormatCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeEntryInputType }
     *     
     */
    public CodeEntryInputType getEmailFormatCode() {
        return emailFormatCode;
    }

    /**
     * Sets the value of the emailFormatCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeEntryInputType }
     *     
     */
    public void setEmailFormatCode(CodeEntryInputType value) {
        this.emailFormatCode = value;
    }

}