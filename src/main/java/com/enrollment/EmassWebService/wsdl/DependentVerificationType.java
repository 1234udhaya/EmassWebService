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
 * <p>Java class for DependentVerificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DependentVerificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;group ref="{http://www.healthedge.com/connector/schema/basetypes}DependentVerificationGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DependentVerificationType", propOrder = {
    "verificationType",
    "certLastInfoRequestDate",
    "certLastInfoReceiptDate",
    "certInformationDueDate",
    "lastVerificationDate",
    "studentSchoolInfo"
})
public class DependentVerificationType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected VerificationType verificationType;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar certLastInfoRequestDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar certLastInfoReceiptDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar certInformationDueDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastVerificationDate;
    protected StudentSchoolInfoType studentSchoolInfo;

    /**
     * Gets the value of the verificationType property.
     * 
     * @return
     *     possible object is
     *     {@link VerificationType }
     *     
     */
    public VerificationType getVerificationType() {
        return verificationType;
    }

    /**
     * Sets the value of the verificationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerificationType }
     *     
     */
    public void setVerificationType(VerificationType value) {
        this.verificationType = value;
    }

    /**
     * Gets the value of the certLastInfoRequestDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCertLastInfoRequestDate() {
        return certLastInfoRequestDate;
    }

    /**
     * Sets the value of the certLastInfoRequestDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCertLastInfoRequestDate(XMLGregorianCalendar value) {
        this.certLastInfoRequestDate = value;
    }

    /**
     * Gets the value of the certLastInfoReceiptDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCertLastInfoReceiptDate() {
        return certLastInfoReceiptDate;
    }

    /**
     * Sets the value of the certLastInfoReceiptDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCertLastInfoReceiptDate(XMLGregorianCalendar value) {
        this.certLastInfoReceiptDate = value;
    }

    /**
     * Gets the value of the certInformationDueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCertInformationDueDate() {
        return certInformationDueDate;
    }

    /**
     * Sets the value of the certInformationDueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCertInformationDueDate(XMLGregorianCalendar value) {
        this.certInformationDueDate = value;
    }

    /**
     * Gets the value of the lastVerificationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastVerificationDate() {
        return lastVerificationDate;
    }

    /**
     * Sets the value of the lastVerificationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastVerificationDate(XMLGregorianCalendar value) {
        this.lastVerificationDate = value;
    }

    /**
     * Gets the value of the studentSchoolInfo property.
     * 
     * @return
     *     possible object is
     *     {@link StudentSchoolInfoType }
     *     
     */
    public StudentSchoolInfoType getStudentSchoolInfo() {
        return studentSchoolInfo;
    }

    /**
     * Sets the value of the studentSchoolInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentSchoolInfoType }
     *     
     */
    public void setStudentSchoolInfo(StudentSchoolInfoType value) {
        this.studentSchoolInfo = value;
    }

}
