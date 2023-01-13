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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorrespondenceDefinitionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CorrespondenceDefinitionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="correspondenceName" type="{http://www.healthedge.com/connector/schema/basetypes}String255Type" minOccurs="0"/&gt;
 *         &lt;element name="recipient" type="{http://www.healthedge.com/connector/schema/basetypes}CorrespondenceRecipientType" minOccurs="0"/&gt;
 *         &lt;element name="subject" type="{http://www.healthedge.com/connector/schema/basetypes}CorrespondenceSubjectInputType" minOccurs="0"/&gt;
 *         &lt;element name="autoGeneratedOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="showInPortal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="allowOptOut" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="defaultContactMethod" type="{http://www.healthedge.com/connector/schema/basetypes}CommunicationContactMethodType" minOccurs="0"/&gt;
 *         &lt;element name="manuallyEnteredFields" type="{http://www.healthedge.com/connector/schema/basetypes}CorrespondenceFieldType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="contactMethods" type="{http://www.healthedge.com/connector/schema/basetypes}CommunicationContactMethodType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="deliveryMethods" type="{http://www.healthedge.com/connector/schema/basetypes}CodeEntryInputType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="defaultDeliveryMethod" type="{http://www.healthedge.com/connector/schema/basetypes}CodeEntryInputType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorrespondenceDefinitionType", propOrder = {
    "correspondenceName",
    "recipient",
    "subject",
    "autoGeneratedOnly",
    "showInPortal",
    "allowOptOut",
    "defaultContactMethod",
    "manuallyEnteredFields",
    "contactMethods",
    "deliveryMethods",
    "defaultDeliveryMethod"
})
public class CorrespondenceDefinitionType {

    protected String correspondenceName;
    @XmlSchemaType(name = "string")
    protected CorrespondenceRecipientType recipient;
    @XmlSchemaType(name = "string")
    protected CorrespondenceSubjectInputType subject;
    protected Boolean autoGeneratedOnly;
    protected Boolean showInPortal;
    protected Boolean allowOptOut;
    @XmlSchemaType(name = "string")
    protected CommunicationContactMethodType defaultContactMethod;
    protected List<CorrespondenceFieldType> manuallyEnteredFields;
    @XmlSchemaType(name = "string")
    protected List<CommunicationContactMethodType> contactMethods;
    protected List<CodeEntryInputType> deliveryMethods;
    protected CodeEntryInputType defaultDeliveryMethod;

    /**
     * Gets the value of the correspondenceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrespondenceName() {
        return correspondenceName;
    }

    /**
     * Sets the value of the correspondenceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrespondenceName(String value) {
        this.correspondenceName = value;
    }

    /**
     * Gets the value of the recipient property.
     * 
     * @return
     *     possible object is
     *     {@link CorrespondenceRecipientType }
     *     
     */
    public CorrespondenceRecipientType getRecipient() {
        return recipient;
    }

    /**
     * Sets the value of the recipient property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrespondenceRecipientType }
     *     
     */
    public void setRecipient(CorrespondenceRecipientType value) {
        this.recipient = value;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link CorrespondenceSubjectInputType }
     *     
     */
    public CorrespondenceSubjectInputType getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrespondenceSubjectInputType }
     *     
     */
    public void setSubject(CorrespondenceSubjectInputType value) {
        this.subject = value;
    }

    /**
     * Gets the value of the autoGeneratedOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoGeneratedOnly() {
        return autoGeneratedOnly;
    }

    /**
     * Sets the value of the autoGeneratedOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoGeneratedOnly(Boolean value) {
        this.autoGeneratedOnly = value;
    }

    /**
     * Gets the value of the showInPortal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowInPortal() {
        return showInPortal;
    }

    /**
     * Sets the value of the showInPortal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowInPortal(Boolean value) {
        this.showInPortal = value;
    }

    /**
     * Gets the value of the allowOptOut property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowOptOut() {
        return allowOptOut;
    }

    /**
     * Sets the value of the allowOptOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowOptOut(Boolean value) {
        this.allowOptOut = value;
    }

    /**
     * Gets the value of the defaultContactMethod property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationContactMethodType }
     *     
     */
    public CommunicationContactMethodType getDefaultContactMethod() {
        return defaultContactMethod;
    }

    /**
     * Sets the value of the defaultContactMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationContactMethodType }
     *     
     */
    public void setDefaultContactMethod(CommunicationContactMethodType value) {
        this.defaultContactMethod = value;
    }

    /**
     * Gets the value of the manuallyEnteredFields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the manuallyEnteredFields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManuallyEnteredFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorrespondenceFieldType }
     * 
     * 
     */
    public List<CorrespondenceFieldType> getManuallyEnteredFields() {
        if (manuallyEnteredFields == null) {
            manuallyEnteredFields = new ArrayList<CorrespondenceFieldType>();
        }
        return this.manuallyEnteredFields;
    }

    /**
     * Gets the value of the contactMethods property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactMethods property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactMethods().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommunicationContactMethodType }
     * 
     * 
     */
    public List<CommunicationContactMethodType> getContactMethods() {
        if (contactMethods == null) {
            contactMethods = new ArrayList<CommunicationContactMethodType>();
        }
        return this.contactMethods;
    }

    /**
     * Gets the value of the deliveryMethods property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deliveryMethods property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeliveryMethods().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeEntryInputType }
     * 
     * 
     */
    public List<CodeEntryInputType> getDeliveryMethods() {
        if (deliveryMethods == null) {
            deliveryMethods = new ArrayList<CodeEntryInputType>();
        }
        return this.deliveryMethods;
    }

    /**
     * Gets the value of the defaultDeliveryMethod property.
     * 
     * @return
     *     possible object is
     *     {@link CodeEntryInputType }
     *     
     */
    public CodeEntryInputType getDefaultDeliveryMethod() {
        return defaultDeliveryMethod;
    }

    /**
     * Sets the value of the defaultDeliveryMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeEntryInputType }
     *     
     */
    public void setDefaultDeliveryMethod(CodeEntryInputType value) {
        this.defaultDeliveryMethod = value;
    }

}
