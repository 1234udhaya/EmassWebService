//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.01.13 at 03:47:37 PM IST 
//


package com.enrollment.EmassWebService.wsdl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for USTerritoryCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="USTerritoryCode"&gt;
 *   &lt;restriction base="{http://www.codesynthesis.com/xmlns/xsstl}USStateTerritoryCode"&gt;
 *     &lt;enumeration value="AS"/&gt;
 *     &lt;enumeration value="FM"/&gt;
 *     &lt;enumeration value="GU"/&gt;
 *     &lt;enumeration value="MH"/&gt;
 *     &lt;enumeration value="MP"/&gt;
 *     &lt;enumeration value="PW"/&gt;
 *     &lt;enumeration value="PR"/&gt;
 *     &lt;enumeration value="VI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "USTerritoryCode", namespace = "http://www.codesynthesis.com/xmlns/xsstl")
@XmlEnum(USStateTerritoryCode2 .class)
public enum USTerritoryCode {

    AS,
    FM,
    GU,
    MH,
    MP,
    PW,
    PR,
    VI;

    public String value() {
        return name();
    }

    public static USTerritoryCode fromValue(String v) {
        return valueOf(v);
    }

}
