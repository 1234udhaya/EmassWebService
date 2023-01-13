//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.01.13 at 03:47:37 PM IST 
//


package com.enrollment.EmassWebService.wsdl;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MedicarePartDLEPDateRangeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MedicarePartDLEPDateRangeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="partDLEPAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="partDLEPWaivedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="partDLEPSubsidyAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="partDLEPCurrentNumberofUncoveredMonths" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="partDLEPTotalNumberofUncoveredMonths" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MedicarePartDLEPDateRangeType", namespace = "http://www.healthedge.com/connector/schema/medicarehicn", propOrder = {
    "startDate",
    "endDate",
    "partDLEPAmount",
    "partDLEPWaivedAmount",
    "partDLEPSubsidyAmount",
    "partDLEPCurrentNumberofUncoveredMonths",
    "partDLEPTotalNumberofUncoveredMonths"
})
public class MedicarePartDLEPDateRangeType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    protected BigDecimal partDLEPAmount;
    protected BigDecimal partDLEPWaivedAmount;
    protected BigDecimal partDLEPSubsidyAmount;
    protected Integer partDLEPCurrentNumberofUncoveredMonths;
    protected Integer partDLEPTotalNumberofUncoveredMonths;

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
     * Gets the value of the partDLEPAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPartDLEPAmount() {
        return partDLEPAmount;
    }

    /**
     * Sets the value of the partDLEPAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPartDLEPAmount(BigDecimal value) {
        this.partDLEPAmount = value;
    }

    /**
     * Gets the value of the partDLEPWaivedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPartDLEPWaivedAmount() {
        return partDLEPWaivedAmount;
    }

    /**
     * Sets the value of the partDLEPWaivedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPartDLEPWaivedAmount(BigDecimal value) {
        this.partDLEPWaivedAmount = value;
    }

    /**
     * Gets the value of the partDLEPSubsidyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPartDLEPSubsidyAmount() {
        return partDLEPSubsidyAmount;
    }

    /**
     * Sets the value of the partDLEPSubsidyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPartDLEPSubsidyAmount(BigDecimal value) {
        this.partDLEPSubsidyAmount = value;
    }

    /**
     * Gets the value of the partDLEPCurrentNumberofUncoveredMonths property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPartDLEPCurrentNumberofUncoveredMonths() {
        return partDLEPCurrentNumberofUncoveredMonths;
    }

    /**
     * Sets the value of the partDLEPCurrentNumberofUncoveredMonths property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPartDLEPCurrentNumberofUncoveredMonths(Integer value) {
        this.partDLEPCurrentNumberofUncoveredMonths = value;
    }

    /**
     * Gets the value of the partDLEPTotalNumberofUncoveredMonths property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPartDLEPTotalNumberofUncoveredMonths() {
        return partDLEPTotalNumberofUncoveredMonths;
    }

    /**
     * Sets the value of the partDLEPTotalNumberofUncoveredMonths property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPartDLEPTotalNumberofUncoveredMonths(Integer value) {
        this.partDLEPTotalNumberofUncoveredMonths = value;
    }

}
