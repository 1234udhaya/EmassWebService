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
 * <p>Java class for ExcessResponsibilityDomainType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ExcessResponsibilityDomainType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Billed Amount"/&gt;
 *     &lt;enumeration value="Allowed Amount"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ExcessResponsibilityDomainType")
@XmlEnum
public enum ExcessResponsibilityDomainType {

    @XmlEnumValue("Billed Amount")
    BILLED_AMOUNT("Billed Amount"),
    @XmlEnumValue("Allowed Amount")
    ALLOWED_AMOUNT("Allowed Amount");
    private final String value;

    ExcessResponsibilityDomainType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExcessResponsibilityDomainType fromValue(String v) {
        for (ExcessResponsibilityDomainType c: ExcessResponsibilityDomainType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
