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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MemberFactorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MemberFactorType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;group ref="{http://www.healthedge.com/connector/schema/memberfactors}MemberFactorGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MemberFactorType", namespace = "http://www.healthedge.com/connector/schema/memberfactors", propOrder = {
    "factorType",
    "factorDateRanges"
})
public class MemberFactorType {

    @XmlElement(required = true)
    protected CodeEntryInputType factorType;
    protected List<MemberFactorDateRangeType> factorDateRanges;

    /**
     * Gets the value of the factorType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeEntryInputType }
     *     
     */
    public CodeEntryInputType getFactorType() {
        return factorType;
    }

    /**
     * Sets the value of the factorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeEntryInputType }
     *     
     */
    public void setFactorType(CodeEntryInputType value) {
        this.factorType = value;
    }

    /**
     * Gets the value of the factorDateRanges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the factorDateRanges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFactorDateRanges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MemberFactorDateRangeType }
     * 
     * 
     */
    public List<MemberFactorDateRangeType> getFactorDateRanges() {
        if (factorDateRanges == null) {
            factorDateRanges = new ArrayList<MemberFactorDateRangeType>();
        }
        return this.factorDateRanges;
    }

}
