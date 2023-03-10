//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.01.13 at 03:47:37 PM IST 
//


package com.enrollment.EmassWebService.wsdl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProviderRoleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ProviderRoleType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PCP"/&gt;
 *     &lt;enumeration value="OBGYN"/&gt;
 *     &lt;enumeration value="Mental Health Facility"/&gt;
 *     &lt;enumeration value="Home Hospital"/&gt;
 *     &lt;enumeration value="Primary Network"/&gt;
 *     &lt;enumeration value="Fitness Center"/&gt;
 *     &lt;enumeration value="Obstetrics and Gynecology Facility"/&gt;
 *     &lt;enumeration value="Laboratory"/&gt;
 *     &lt;enumeration value="Facility"/&gt;
 *     &lt;enumeration value="Optometrist"/&gt;
 *     &lt;enumeration value="Pharmacy"/&gt;
 *     &lt;enumeration value="Dentist"/&gt;
 *     &lt;enumeration value="Managed Care Organization"/&gt;
 *     &lt;enumeration value="Restricted Physician"/&gt;
 *     &lt;enumeration value="Restricted Clinic"/&gt;
 *     &lt;enumeration value="Restricted Hospital"/&gt;
 *     &lt;enumeration value="Restricted Pharmacy"/&gt;
 *     &lt;enumeration value="Care Coordination Organization"/&gt;
 *     &lt;enumeration value="Care Coordinator"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ProviderRoleType")
@XmlEnum
public enum ProviderRoleType {

    PCP("PCP"),
    OBGYN("OBGYN"),
    @XmlEnumValue("Mental Health Facility")
    MENTAL_HEALTH_FACILITY("Mental Health Facility"),
    @XmlEnumValue("Home Hospital")
    HOME_HOSPITAL("Home Hospital"),
    @XmlEnumValue("Primary Network")
    PRIMARY_NETWORK("Primary Network"),
    @XmlEnumValue("Fitness Center")
    FITNESS_CENTER("Fitness Center"),
    @XmlEnumValue("Obstetrics and Gynecology Facility")
    OBSTETRICS_AND_GYNECOLOGY_FACILITY("Obstetrics and Gynecology Facility"),
    @XmlEnumValue("Laboratory")
    LABORATORY("Laboratory"),
    @XmlEnumValue("Facility")
    FACILITY("Facility"),
    @XmlEnumValue("Optometrist")
    OPTOMETRIST("Optometrist"),
    @XmlEnumValue("Pharmacy")
    PHARMACY("Pharmacy"),
    @XmlEnumValue("Dentist")
    DENTIST("Dentist"),
    @XmlEnumValue("Managed Care Organization")
    MANAGED_CARE_ORGANIZATION("Managed Care Organization"),
    @XmlEnumValue("Restricted Physician")
    RESTRICTED_PHYSICIAN("Restricted Physician"),
    @XmlEnumValue("Restricted Clinic")
    RESTRICTED_CLINIC("Restricted Clinic"),
    @XmlEnumValue("Restricted Hospital")
    RESTRICTED_HOSPITAL("Restricted Hospital"),
    @XmlEnumValue("Restricted Pharmacy")
    RESTRICTED_PHARMACY("Restricted Pharmacy"),
    @XmlEnumValue("Care Coordination Organization")
    CARE_COORDINATION_ORGANIZATION("Care Coordination Organization"),
    @XmlEnumValue("Care Coordinator")
    CARE_COORDINATOR("Care Coordinator");
    private final String value;

    ProviderRoleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProviderRoleType fromValue(String v) {
        for (ProviderRoleType c: ProviderRoleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
