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
 * <p>Java class for PreExistingConditionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PreExistingConditionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;group ref="{http://www.healthedge.com/connector/schema/basetypes}PreExistingConditionGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PreExistingConditionType", propOrder = {
    "onsetOfConditionDate",
    "preexistingPeriodEndDate",
    "preexDescription",
    "preExDiagnosisCodeRangeConditions",
    "preExProcedureCodeRangeConditions",
    "preexistingConditions",
    "preexistingConditionProcedures"
})
public class PreExistingConditionType {

    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar onsetOfConditionDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar preexistingPeriodEndDate;
    protected String preexDescription;
    protected PreExistingConditionType.PreExDiagnosisCodeRangeConditions preExDiagnosisCodeRangeConditions;
    protected PreExistingConditionType.PreExProcedureCodeRangeConditions preExProcedureCodeRangeConditions;
    protected PreExistingConditionType.PreexistingConditions preexistingConditions;
    protected PreExistingConditionType.PreexistingConditionProcedures preexistingConditionProcedures;

    /**
     * Gets the value of the onsetOfConditionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOnsetOfConditionDate() {
        return onsetOfConditionDate;
    }

    /**
     * Sets the value of the onsetOfConditionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOnsetOfConditionDate(XMLGregorianCalendar value) {
        this.onsetOfConditionDate = value;
    }

    /**
     * Gets the value of the preexistingPeriodEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPreexistingPeriodEndDate() {
        return preexistingPeriodEndDate;
    }

    /**
     * Sets the value of the preexistingPeriodEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPreexistingPeriodEndDate(XMLGregorianCalendar value) {
        this.preexistingPeriodEndDate = value;
    }

    /**
     * Gets the value of the preexDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreexDescription() {
        return preexDescription;
    }

    /**
     * Sets the value of the preexDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreexDescription(String value) {
        this.preexDescription = value;
    }

    /**
     * Gets the value of the preExDiagnosisCodeRangeConditions property.
     * 
     * @return
     *     possible object is
     *     {@link PreExistingConditionType.PreExDiagnosisCodeRangeConditions }
     *     
     */
    public PreExistingConditionType.PreExDiagnosisCodeRangeConditions getPreExDiagnosisCodeRangeConditions() {
        return preExDiagnosisCodeRangeConditions;
    }

    /**
     * Sets the value of the preExDiagnosisCodeRangeConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreExistingConditionType.PreExDiagnosisCodeRangeConditions }
     *     
     */
    public void setPreExDiagnosisCodeRangeConditions(PreExistingConditionType.PreExDiagnosisCodeRangeConditions value) {
        this.preExDiagnosisCodeRangeConditions = value;
    }

    /**
     * Gets the value of the preExProcedureCodeRangeConditions property.
     * 
     * @return
     *     possible object is
     *     {@link PreExistingConditionType.PreExProcedureCodeRangeConditions }
     *     
     */
    public PreExistingConditionType.PreExProcedureCodeRangeConditions getPreExProcedureCodeRangeConditions() {
        return preExProcedureCodeRangeConditions;
    }

    /**
     * Sets the value of the preExProcedureCodeRangeConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreExistingConditionType.PreExProcedureCodeRangeConditions }
     *     
     */
    public void setPreExProcedureCodeRangeConditions(PreExistingConditionType.PreExProcedureCodeRangeConditions value) {
        this.preExProcedureCodeRangeConditions = value;
    }

    /**
     * Gets the value of the preexistingConditions property.
     * 
     * @return
     *     possible object is
     *     {@link PreExistingConditionType.PreexistingConditions }
     *     
     */
    public PreExistingConditionType.PreexistingConditions getPreexistingConditions() {
        return preexistingConditions;
    }

    /**
     * Sets the value of the preexistingConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreExistingConditionType.PreexistingConditions }
     *     
     */
    public void setPreexistingConditions(PreExistingConditionType.PreexistingConditions value) {
        this.preexistingConditions = value;
    }

    /**
     * Gets the value of the preexistingConditionProcedures property.
     * 
     * @return
     *     possible object is
     *     {@link PreExistingConditionType.PreexistingConditionProcedures }
     *     
     */
    public PreExistingConditionType.PreexistingConditionProcedures getPreexistingConditionProcedures() {
        return preexistingConditionProcedures;
    }

    /**
     * Sets the value of the preexistingConditionProcedures property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreExistingConditionType.PreexistingConditionProcedures }
     *     
     */
    public void setPreexistingConditionProcedures(PreExistingConditionType.PreexistingConditionProcedures value) {
        this.preexistingConditionProcedures = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="preExDiagnosisCodeRangeCondition" type="{http://www.healthedge.com/connector/schema/basetypes}PreExDiagnosisCodeRangeConditionType" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "preExDiagnosisCodeRangeCondition"
    })
    public static class PreExDiagnosisCodeRangeConditions {

        @XmlElement(required = true)
        protected List<PreExDiagnosisCodeRangeConditionType> preExDiagnosisCodeRangeCondition;

        /**
         * Gets the value of the preExDiagnosisCodeRangeCondition property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the preExDiagnosisCodeRangeCondition property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPreExDiagnosisCodeRangeCondition().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PreExDiagnosisCodeRangeConditionType }
         * 
         * 
         */
        public List<PreExDiagnosisCodeRangeConditionType> getPreExDiagnosisCodeRangeCondition() {
            if (preExDiagnosisCodeRangeCondition == null) {
                preExDiagnosisCodeRangeCondition = new ArrayList<PreExDiagnosisCodeRangeConditionType>();
            }
            return this.preExDiagnosisCodeRangeCondition;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="preExProcedureCodeRangeCondition" type="{http://www.healthedge.com/connector/schema/basetypes}PreExProcedureCodeRangeConditionType" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "preExProcedureCodeRangeCondition"
    })
    public static class PreExProcedureCodeRangeConditions {

        @XmlElement(required = true)
        protected List<PreExProcedureCodeRangeConditionType> preExProcedureCodeRangeCondition;

        /**
         * Gets the value of the preExProcedureCodeRangeCondition property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the preExProcedureCodeRangeCondition property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPreExProcedureCodeRangeCondition().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PreExProcedureCodeRangeConditionType }
         * 
         * 
         */
        public List<PreExProcedureCodeRangeConditionType> getPreExProcedureCodeRangeCondition() {
            if (preExProcedureCodeRangeCondition == null) {
                preExProcedureCodeRangeCondition = new ArrayList<PreExProcedureCodeRangeConditionType>();
            }
            return this.preExProcedureCodeRangeCondition;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="serviceReference" type="{http://www.healthedge.com/connector/schema/basetypes}ReferenceType" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "serviceReference"
    })
    public static class PreexistingConditionProcedures {

        @XmlElement(required = true)
        protected List<ReferenceType> serviceReference;

        /**
         * Gets the value of the serviceReference property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the serviceReference property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getServiceReference().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ReferenceType }
         * 
         * 
         */
        public List<ReferenceType> getServiceReference() {
            if (serviceReference == null) {
                serviceReference = new ArrayList<ReferenceType>();
            }
            return this.serviceReference;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="diagnosisReference" type="{http://www.healthedge.com/connector/schema/basetypes}ReferenceType" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "diagnosisReference"
    })
    public static class PreexistingConditions {

        @XmlElement(required = true)
        protected List<ReferenceType> diagnosisReference;

        /**
         * Gets the value of the diagnosisReference property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the diagnosisReference property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDiagnosisReference().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ReferenceType }
         * 
         * 
         */
        public List<ReferenceType> getDiagnosisReference() {
            if (diagnosisReference == null) {
                diagnosisReference = new ArrayList<ReferenceType>();
            }
            return this.diagnosisReference;
        }

    }

}
