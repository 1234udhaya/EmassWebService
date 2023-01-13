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
 * <p>Java class for MessageCodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageCodeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;group ref="{http://www.healthedge.com/connector/schema/basetypes}MessageCodeGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageCodeType", propOrder = {
    "messageCode",
    "codeDomainName",
    "messageDescription",
    "policyName",
    "messageAction",
    "messageResponsibility"
})
public class MessageCodeType {

    @XmlElement(required = true)
    protected String messageCode;
    @XmlElement(required = true)
    protected String codeDomainName;
    @XmlElement(required = true)
    protected String messageDescription;
    protected String policyName;
    @XmlSchemaType(name = "string")
    protected MessageActionType messageAction;
    @XmlSchemaType(name = "string")
    protected MessageResponsibilityType messageResponsibility;

    /**
     * Gets the value of the messageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageCode() {
        return messageCode;
    }

    /**
     * Sets the value of the messageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageCode(String value) {
        this.messageCode = value;
    }

    /**
     * Gets the value of the codeDomainName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeDomainName() {
        return codeDomainName;
    }

    /**
     * Sets the value of the codeDomainName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeDomainName(String value) {
        this.codeDomainName = value;
    }

    /**
     * Gets the value of the messageDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageDescription() {
        return messageDescription;
    }

    /**
     * Sets the value of the messageDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageDescription(String value) {
        this.messageDescription = value;
    }

    /**
     * Gets the value of the policyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyName() {
        return policyName;
    }

    /**
     * Sets the value of the policyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyName(String value) {
        this.policyName = value;
    }

    /**
     * Gets the value of the messageAction property.
     * 
     * @return
     *     possible object is
     *     {@link MessageActionType }
     *     
     */
    public MessageActionType getMessageAction() {
        return messageAction;
    }

    /**
     * Sets the value of the messageAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageActionType }
     *     
     */
    public void setMessageAction(MessageActionType value) {
        this.messageAction = value;
    }

    /**
     * Gets the value of the messageResponsibility property.
     * 
     * @return
     *     possible object is
     *     {@link MessageResponsibilityType }
     *     
     */
    public MessageResponsibilityType getMessageResponsibility() {
        return messageResponsibility;
    }

    /**
     * Sets the value of the messageResponsibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageResponsibilityType }
     *     
     */
    public void setMessageResponsibility(MessageResponsibilityType value) {
        this.messageResponsibility = value;
    }

}