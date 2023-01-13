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
 * <p>Java class for MemberFactorsCoreType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MemberFactorsCoreType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;group ref="{http://www.healthedge.com/connector/schema/memberfactors}MemberFactorsCore"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MemberFactorsCoreType", namespace = "http://www.healthedge.com/connector/schema/memberfactors", propOrder = {
    "updateMode",
    "memberFactors"
})
public class MemberFactorsCoreType {

    @XmlSchemaType(name = "string")
    protected UpdateModeType2 updateMode;
    protected MemberFactorSetType memberFactors;

    /**
     * Gets the value of the updateMode property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateModeType2 }
     *     
     */
    public UpdateModeType2 getUpdateMode() {
        return updateMode;
    }

    /**
     * Sets the value of the updateMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateModeType2 }
     *     
     */
    public void setUpdateMode(UpdateModeType2 value) {
        this.updateMode = value;
    }

    /**
     * Gets the value of the memberFactors property.
     * 
     * @return
     *     possible object is
     *     {@link MemberFactorSetType }
     *     
     */
    public MemberFactorSetType getMemberFactors() {
        return memberFactors;
    }

    /**
     * Sets the value of the memberFactors property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemberFactorSetType }
     *     
     */
    public void setMemberFactors(MemberFactorSetType value) {
        this.memberFactors = value;
    }

}
