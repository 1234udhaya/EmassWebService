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
 * <p>Java class for WorkbasketType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="WorkbasketType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Repair"/&gt;
 *     &lt;enumeration value="Review"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WorkbasketType")
@XmlEnum
public enum WorkbasketType {

    @XmlEnumValue("Repair")
    REPAIR("Repair"),
    @XmlEnumValue("Review")
    REVIEW("Review");
    private final String value;

    WorkbasketType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WorkbasketType fromValue(String v) {
        for (WorkbasketType c: WorkbasketType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
