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
 * <p>Java class for MemberPlanSeclectionDateRangeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MemberPlanSeclectionDateRangeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;group ref="{http://www.healthedge.com/connector/schema/enrollmenttypes}MemberPlanSeclectionDateRangeGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MemberPlanSeclectionDateRangeType", namespace = "http://www.healthedge.com/connector/schema/enrollmenttypes", propOrder = {
    "status",
    "enrollmentInfo",
    "memberTerminateReasonCode"
})
public class MemberPlanSeclectionDateRangeType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected PlanSelectionStatus status;
    protected EnrollmentInformationType enrollmentInfo;
    protected CodeEntryInputType memberTerminateReasonCode;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link PlanSelectionStatus }
     *     
     */
    public PlanSelectionStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlanSelectionStatus }
     *     
     */
    public void setStatus(PlanSelectionStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the enrollmentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link EnrollmentInformationType }
     *     
     */
    public EnrollmentInformationType getEnrollmentInfo() {
        return enrollmentInfo;
    }

    /**
     * Sets the value of the enrollmentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnrollmentInformationType }
     *     
     */
    public void setEnrollmentInfo(EnrollmentInformationType value) {
        this.enrollmentInfo = value;
    }

    /**
     * Gets the value of the memberTerminateReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeEntryInputType }
     *     
     */
    public CodeEntryInputType getMemberTerminateReasonCode() {
        return memberTerminateReasonCode;
    }

    /**
     * Sets the value of the memberTerminateReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeEntryInputType }
     *     
     */
    public void setMemberTerminateReasonCode(CodeEntryInputType value) {
        this.memberTerminateReasonCode = value;
    }

}
