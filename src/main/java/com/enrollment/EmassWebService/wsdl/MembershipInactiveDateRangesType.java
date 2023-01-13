//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.01.13 at 03:47:37 PM IST 
//


package com.enrollment.EmassWebService.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MembershipInactiveDateRangesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MembershipInactiveDateRangesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;group ref="{http://www.healthedge.com/connector/schema/enrollmenttypes}MembershipInactiveDateRangesGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MembershipInactiveDateRangesType", namespace = "http://www.healthedge.com/connector/schema/enrollmenttypes", propOrder = {
    "startDate",
    "endDate",
    "isAutoAssigned",
    "claimHistoryFromOtherPlans",
    "selectedProvider",
    "enrollmentInformationGroup"
})
public class MembershipInactiveDateRangesType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    protected boolean isAutoAssigned;
    @XmlElement(required = true)
    protected String claimHistoryFromOtherPlans;
    @XmlElement(required = true)
    protected SelectedProviderType selectedProvider;
    @XmlElementRefs({
        @XmlElementRef(name = "applicationSignatureDomain", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "applicationSignatureDate", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "applicationReceiptDate", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "completedDate", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "submitDate", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "disenrollDate", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "disenrollReason", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "medicareEnrollmentPeriodCode", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> enrollmentInformationGroup;

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the isAutoAssigned property.
     * 
     */
    public boolean isIsAutoAssigned() {
        return isAutoAssigned;
    }

    /**
     * Sets the value of the isAutoAssigned property.
     * 
     */
    public void setIsAutoAssigned(boolean value) {
        this.isAutoAssigned = value;
    }

    /**
     * Gets the value of the claimHistoryFromOtherPlans property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimHistoryFromOtherPlans() {
        return claimHistoryFromOtherPlans;
    }

    /**
     * Sets the value of the claimHistoryFromOtherPlans property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimHistoryFromOtherPlans(String value) {
        this.claimHistoryFromOtherPlans = value;
    }

    /**
     * Gets the value of the selectedProvider property.
     * 
     * @return
     *     possible object is
     *     {@link SelectedProviderType }
     *     
     */
    public SelectedProviderType getSelectedProvider() {
        return selectedProvider;
    }

    /**
     * Sets the value of the selectedProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectedProviderType }
     *     
     */
    public void setSelectedProvider(SelectedProviderType value) {
        this.selectedProvider = value;
    }

    /**
     * Gets the value of the enrollmentInformationGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enrollmentInformationGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnrollmentInformationGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link CodeEntryInputType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getEnrollmentInformationGroup() {
        if (enrollmentInformationGroup == null) {
            enrollmentInformationGroup = new ArrayList<JAXBElement<?>>();
        }
        return this.enrollmentInformationGroup;
    }

}
