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
 * <p>Java class for TransactionInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="alreadyInWorkbasket" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="blockedByLock" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="cvcId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="exceptions" type="{http://www.healthedge.com/connector/schema/basetypes}TransactionExceptionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="lockingUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="needsRepair" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="needsReview" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="rejected" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="transactionSubmitted" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="versionEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionInformationType", propOrder = {
    "alreadyInWorkbasket",
    "blockedByLock",
    "cvcId",
    "exceptions",
    "lockingUser",
    "needsRepair",
    "needsReview",
    "rejected",
    "transactionSubmitted",
    "versionEffectiveDate"
})
public class TransactionInformationType {

    protected boolean alreadyInWorkbasket;
    protected boolean blockedByLock;
    protected Long cvcId;
    @XmlElement(nillable = true)
    protected List<TransactionExceptionType> exceptions;
    protected String lockingUser;
    protected boolean needsRepair;
    protected boolean needsReview;
    protected boolean rejected;
    protected boolean transactionSubmitted;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar versionEffectiveDate;

    /**
     * Gets the value of the alreadyInWorkbasket property.
     * 
     */
    public boolean isAlreadyInWorkbasket() {
        return alreadyInWorkbasket;
    }

    /**
     * Sets the value of the alreadyInWorkbasket property.
     * 
     */
    public void setAlreadyInWorkbasket(boolean value) {
        this.alreadyInWorkbasket = value;
    }

    /**
     * Gets the value of the blockedByLock property.
     * 
     */
    public boolean isBlockedByLock() {
        return blockedByLock;
    }

    /**
     * Sets the value of the blockedByLock property.
     * 
     */
    public void setBlockedByLock(boolean value) {
        this.blockedByLock = value;
    }

    /**
     * Gets the value of the cvcId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCvcId() {
        return cvcId;
    }

    /**
     * Sets the value of the cvcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCvcId(Long value) {
        this.cvcId = value;
    }

    /**
     * Gets the value of the exceptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exceptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExceptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionExceptionType }
     * 
     * 
     */
    public List<TransactionExceptionType> getExceptions() {
        if (exceptions == null) {
            exceptions = new ArrayList<TransactionExceptionType>();
        }
        return this.exceptions;
    }

    /**
     * Gets the value of the lockingUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLockingUser() {
        return lockingUser;
    }

    /**
     * Sets the value of the lockingUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLockingUser(String value) {
        this.lockingUser = value;
    }

    /**
     * Gets the value of the needsRepair property.
     * 
     */
    public boolean isNeedsRepair() {
        return needsRepair;
    }

    /**
     * Sets the value of the needsRepair property.
     * 
     */
    public void setNeedsRepair(boolean value) {
        this.needsRepair = value;
    }

    /**
     * Gets the value of the needsReview property.
     * 
     */
    public boolean isNeedsReview() {
        return needsReview;
    }

    /**
     * Sets the value of the needsReview property.
     * 
     */
    public void setNeedsReview(boolean value) {
        this.needsReview = value;
    }

    /**
     * Gets the value of the rejected property.
     * 
     */
    public boolean isRejected() {
        return rejected;
    }

    /**
     * Sets the value of the rejected property.
     * 
     */
    public void setRejected(boolean value) {
        this.rejected = value;
    }

    /**
     * Gets the value of the transactionSubmitted property.
     * 
     */
    public boolean isTransactionSubmitted() {
        return transactionSubmitted;
    }

    /**
     * Sets the value of the transactionSubmitted property.
     * 
     */
    public void setTransactionSubmitted(boolean value) {
        this.transactionSubmitted = value;
    }

    /**
     * Gets the value of the versionEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVersionEffectiveDate() {
        return versionEffectiveDate;
    }

    /**
     * Sets the value of the versionEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVersionEffectiveDate(XMLGregorianCalendar value) {
        this.versionEffectiveDate = value;
    }

}