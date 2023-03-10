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
 * Account information used for matching during a search input.
 * 
 * <p>Java class for AccountLookupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountLookupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accountIdentifier" type="{http://www.healthedge.com/connector/schema/basetypes}IDLookupType" minOccurs="0"/&gt;
 *         &lt;element name="parentAccountIdentifier" type="{http://www.healthedge.com/connector/schema/basetypes}ParentAccountLookupType" minOccurs="0"/&gt;
 *         &lt;element name="topAccountIdentifier" type="{http://www.healthedge.com/connector/schema/basetypes}IDLookupType" minOccurs="0"/&gt;
 *         &lt;element name="taxId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="asOfDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountLookupType", propOrder = {
    "accountIdentifier",
    "parentAccountIdentifier",
    "topAccountIdentifier",
    "taxId",
    "asOfDate"
})
public class AccountLookupType {

    protected IDLookupType accountIdentifier;
    protected ParentAccountLookupType parentAccountIdentifier;
    protected IDLookupType topAccountIdentifier;
    protected String taxId;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar asOfDate;

    /**
     * Gets the value of the accountIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link IDLookupType }
     *     
     */
    public IDLookupType getAccountIdentifier() {
        return accountIdentifier;
    }

    /**
     * Sets the value of the accountIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDLookupType }
     *     
     */
    public void setAccountIdentifier(IDLookupType value) {
        this.accountIdentifier = value;
    }

    /**
     * Gets the value of the parentAccountIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link ParentAccountLookupType }
     *     
     */
    public ParentAccountLookupType getParentAccountIdentifier() {
        return parentAccountIdentifier;
    }

    /**
     * Sets the value of the parentAccountIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParentAccountLookupType }
     *     
     */
    public void setParentAccountIdentifier(ParentAccountLookupType value) {
        this.parentAccountIdentifier = value;
    }

    /**
     * Gets the value of the topAccountIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link IDLookupType }
     *     
     */
    public IDLookupType getTopAccountIdentifier() {
        return topAccountIdentifier;
    }

    /**
     * Sets the value of the topAccountIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDLookupType }
     *     
     */
    public void setTopAccountIdentifier(IDLookupType value) {
        this.topAccountIdentifier = value;
    }

    /**
     * Gets the value of the taxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxId() {
        return taxId;
    }

    /**
     * Sets the value of the taxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxId(String value) {
        this.taxId = value;
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

}
