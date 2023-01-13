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
 * <p>Java class for ServiceFacilityLocationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceFacilityLocationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="locationName" type="{http://www.healthedge.com/connector/schema/basetypes}LongStringType" minOccurs="0"/&gt;
 *         &lt;element name="streetAddress" type="{http://www.healthedge.com/connector/schema/basetypes}LongStringType" minOccurs="0"/&gt;
 *         &lt;element name="streetAddress2" type="{http://www.healthedge.com/connector/schema/basetypes}LongStringType" minOccurs="0"/&gt;
 *         &lt;element name="streetAddress3" type="{http://www.healthedge.com/connector/schema/basetypes}LongStringType" minOccurs="0"/&gt;
 *         &lt;element name="cityName" type="{http://www.healthedge.com/connector/schema/basetypes}ProperNameType" minOccurs="0"/&gt;
 *         &lt;element name="stateCode" type="{http://www.healthedge.com/connector/schema/basetypes}LongStringType" minOccurs="0"/&gt;
 *         &lt;element name="zipCode" type="{http://www.healthedge.com/connector/schema/basetypes}ZipCodeType" minOccurs="0"/&gt;
 *         &lt;element name="zipExtensionCode" type="{http://www.healthedge.com/connector/schema/basetypes}ZipCodeExtensionType" minOccurs="0"/&gt;
 *         &lt;element name="countryCode" type="{http://www.healthedge.com/connector/schema/basetypes}CountryCodeDomainType" minOccurs="0"/&gt;
 *         &lt;element name="npi" type="{http://www.healthedge.com/connector/schema/basetypes}String50Type" minOccurs="0"/&gt;
 *         &lt;element name="otherID" type="{http://www.healthedge.com/connector/schema/basetypes}String50Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceFacilityLocationType", propOrder = {
    "locationName",
    "streetAddress",
    "streetAddress2",
    "streetAddress3",
    "cityName",
    "stateCode",
    "zipCode",
    "zipExtensionCode",
    "countryCode",
    "npi",
    "otherID"
})
public class ServiceFacilityLocationType {

    protected String locationName;
    protected String streetAddress;
    protected String streetAddress2;
    protected String streetAddress3;
    protected String cityName;
    protected String stateCode;
    protected String zipCode;
    protected String zipExtensionCode;
    protected CountryCodeDomainType countryCode;
    protected String npi;
    protected String otherID;

    /**
     * Gets the value of the locationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationName() {
        return locationName;
    }

    /**
     * Sets the value of the locationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationName(String value) {
        this.locationName = value;
    }

    /**
     * Gets the value of the streetAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetAddress() {
        return streetAddress;
    }

    /**
     * Sets the value of the streetAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetAddress(String value) {
        this.streetAddress = value;
    }

    /**
     * Gets the value of the streetAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetAddress2() {
        return streetAddress2;
    }

    /**
     * Sets the value of the streetAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetAddress2(String value) {
        this.streetAddress2 = value;
    }

    /**
     * Gets the value of the streetAddress3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetAddress3() {
        return streetAddress3;
    }

    /**
     * Sets the value of the streetAddress3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetAddress3(String value) {
        this.streetAddress3 = value;
    }

    /**
     * Gets the value of the cityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * Sets the value of the cityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityName(String value) {
        this.cityName = value;
    }

    /**
     * Gets the value of the stateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateCode() {
        return stateCode;
    }

    /**
     * Sets the value of the stateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateCode(String value) {
        this.stateCode = value;
    }

    /**
     * Gets the value of the zipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Sets the value of the zipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipCode(String value) {
        this.zipCode = value;
    }

    /**
     * Gets the value of the zipExtensionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipExtensionCode() {
        return zipExtensionCode;
    }

    /**
     * Sets the value of the zipExtensionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipExtensionCode(String value) {
        this.zipExtensionCode = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link CountryCodeDomainType }
     *     
     */
    public CountryCodeDomainType getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCodeDomainType }
     *     
     */
    public void setCountryCode(CountryCodeDomainType value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the npi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNpi() {
        return npi;
    }

    /**
     * Sets the value of the npi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNpi(String value) {
        this.npi = value;
    }

    /**
     * Gets the value of the otherID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherID() {
        return otherID;
    }

    /**
     * Sets the value of the otherID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherID(String value) {
        this.otherID = value;
    }

}