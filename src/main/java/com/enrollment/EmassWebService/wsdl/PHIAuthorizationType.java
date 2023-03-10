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
 * <p>Java class for PHIAuthorizationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PHIAuthorizationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Use"/&gt;
 *     &lt;enumeration value="Disclose"/&gt;
 *     &lt;enumeration value="Use and Disclose"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PHIAuthorizationType")
@XmlEnum
public enum PHIAuthorizationType {

    @XmlEnumValue("Use")
    USE("Use"),
    @XmlEnumValue("Disclose")
    DISCLOSE("Disclose"),
    @XmlEnumValue("Use and Disclose")
    USE_AND_DISCLOSE("Use and Disclose");
    private final String value;

    PHIAuthorizationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PHIAuthorizationType fromValue(String v) {
        for (PHIAuthorizationType c: PHIAuthorizationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
