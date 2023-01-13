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
 * Practitioner id and role name will be returned for a given practitioner role otherId and its code entry type.
 * 
 * <p>Java class for PractitionerByRoleReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PractitionerByRoleReferenceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hccIdentificationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="practitionerRoleOtherIdentificationNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="practitionerRoleOtherIdTypeCode" type="{http://www.healthedge.com/connector/schema/basetypes}CodeEntryInputType"/&gt;
 *         &lt;element name="asOfDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="roleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PractitionerByRoleReferenceType", propOrder = {
    "hccIdentificationNumber",
    "practitionerRoleOtherIdentificationNumber",
    "practitionerRoleOtherIdTypeCode",
    "asOfDate",
    "roleName"
})
public class PractitionerByRoleReferenceType {

    protected String hccIdentificationNumber;
    @XmlElement(required = true)
    protected String practitionerRoleOtherIdentificationNumber;
    @XmlElement(required = true)
    protected CodeEntryInputType practitionerRoleOtherIdTypeCode;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar asOfDate;
    protected String roleName;

    /**
     * Gets the value of the hccIdentificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHccIdentificationNumber() {
        return hccIdentificationNumber;
    }

    /**
     * Sets the value of the hccIdentificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHccIdentificationNumber(String value) {
        this.hccIdentificationNumber = value;
    }

    /**
     * Gets the value of the practitionerRoleOtherIdentificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPractitionerRoleOtherIdentificationNumber() {
        return practitionerRoleOtherIdentificationNumber;
    }

    /**
     * Sets the value of the practitionerRoleOtherIdentificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPractitionerRoleOtherIdentificationNumber(String value) {
        this.practitionerRoleOtherIdentificationNumber = value;
    }

    /**
     * Gets the value of the practitionerRoleOtherIdTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeEntryInputType }
     *     
     */
    public CodeEntryInputType getPractitionerRoleOtherIdTypeCode() {
        return practitionerRoleOtherIdTypeCode;
    }

    /**
     * Sets the value of the practitionerRoleOtherIdTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeEntryInputType }
     *     
     */
    public void setPractitionerRoleOtherIdTypeCode(CodeEntryInputType value) {
        this.practitionerRoleOtherIdTypeCode = value;
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

    /**
     * Gets the value of the roleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * Sets the value of the roleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoleName(String value) {
        this.roleName = value;
    }

}