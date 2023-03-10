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
 * <p>Java class for ResponsibilitySequenceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ResponsibilitySequenceType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Primary"/&gt;
 *     &lt;enumeration value="Secondary"/&gt;
 *     &lt;enumeration value="Tertiary"/&gt;
 *     &lt;enumeration value="Equal Split"/&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ResponsibilitySequenceType")
@XmlEnum
public enum ResponsibilitySequenceType {

    @XmlEnumValue("Primary")
    PRIMARY("Primary"),
    @XmlEnumValue("Secondary")
    SECONDARY("Secondary"),
    @XmlEnumValue("Tertiary")
    TERTIARY("Tertiary"),
    @XmlEnumValue("Equal Split")
    EQUAL_SPLIT("Equal Split"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    ResponsibilitySequenceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResponsibilitySequenceType fromValue(String v) {
        for (ResponsibilitySequenceType c: ResponsibilitySequenceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
