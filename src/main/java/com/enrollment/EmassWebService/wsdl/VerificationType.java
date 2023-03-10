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
 * <p>Java class for VerificationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="VerificationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Student Verification"/&gt;
 *     &lt;enumeration value="Disabled Dependent"/&gt;
 *     &lt;enumeration value="Dependent Attestation"/&gt;
 *     &lt;enumeration value="Work Related Death"/&gt;
 *     &lt;enumeration value="Retired State Police Affirmation"/&gt;
 *     &lt;enumeration value="MSP Waiver"/&gt;
 *     &lt;enumeration value="SSN Waiver"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VerificationType")
@XmlEnum
public enum VerificationType {

    @XmlEnumValue("Student Verification")
    STUDENT_VERIFICATION("Student Verification"),
    @XmlEnumValue("Disabled Dependent")
    DISABLED_DEPENDENT("Disabled Dependent"),
    @XmlEnumValue("Dependent Attestation")
    DEPENDENT_ATTESTATION("Dependent Attestation"),
    @XmlEnumValue("Work Related Death")
    WORK_RELATED_DEATH("Work Related Death"),
    @XmlEnumValue("Retired State Police Affirmation")
    RETIRED_STATE_POLICE_AFFIRMATION("Retired State Police Affirmation"),
    @XmlEnumValue("MSP Waiver")
    MSP_WAIVER("MSP Waiver"),
    @XmlEnumValue("SSN Waiver")
    SSN_WAIVER("SSN Waiver");
    private final String value;

    VerificationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VerificationType fromValue(String v) {
        for (VerificationType c: VerificationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
