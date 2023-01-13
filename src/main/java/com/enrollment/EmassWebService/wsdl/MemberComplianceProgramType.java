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
 * <p>Java class for MemberComplianceProgramType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MemberComplianceProgramType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.healthedge.com/connector/schema/basetypes}HealthRulesResourceType"&gt;
 *       &lt;group ref="{http://www.healthedge.com/connector/schema/membercomplianceprogram}MembershipComplianceProgramSelectionListGroup"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MemberComplianceProgramType", namespace = "http://www.healthedge.com/connector/schema/membercomplianceprogram", propOrder = {
    "membershipIdentifier",
    "memberHccID",
    "memberMatchData",
    "membershipComplianceProgSelectionsType"
})
public class MemberComplianceProgramType
    extends HealthRulesResourceType
{

    protected Long membershipIdentifier;
    protected String memberHccID;
    protected MemberMatchInputType memberMatchData;
    protected MembershipComplianceProgSelectionsType membershipComplianceProgSelectionsType;

    /**
     * Gets the value of the membershipIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMembershipIdentifier() {
        return membershipIdentifier;
    }

    /**
     * Sets the value of the membershipIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMembershipIdentifier(Long value) {
        this.membershipIdentifier = value;
    }

    /**
     * Gets the value of the memberHccID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberHccID() {
        return memberHccID;
    }

    /**
     * Sets the value of the memberHccID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberHccID(String value) {
        this.memberHccID = value;
    }

    /**
     * Gets the value of the memberMatchData property.
     * 
     * @return
     *     possible object is
     *     {@link MemberMatchInputType }
     *     
     */
    public MemberMatchInputType getMemberMatchData() {
        return memberMatchData;
    }

    /**
     * Sets the value of the memberMatchData property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemberMatchInputType }
     *     
     */
    public void setMemberMatchData(MemberMatchInputType value) {
        this.memberMatchData = value;
    }

    /**
     * Gets the value of the membershipComplianceProgSelectionsType property.
     * 
     * @return
     *     possible object is
     *     {@link MembershipComplianceProgSelectionsType }
     *     
     */
    public MembershipComplianceProgSelectionsType getMembershipComplianceProgSelectionsType() {
        return membershipComplianceProgSelectionsType;
    }

    /**
     * Sets the value of the membershipComplianceProgSelectionsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MembershipComplianceProgSelectionsType }
     *     
     */
    public void setMembershipComplianceProgSelectionsType(MembershipComplianceProgSelectionsType value) {
        this.membershipComplianceProgSelectionsType = value;
    }

}