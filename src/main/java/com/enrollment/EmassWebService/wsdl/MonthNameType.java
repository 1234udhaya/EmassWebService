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
 * <p>Java class for MonthNameType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="MonthNameType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="JAN"/&gt;
 *     &lt;enumeration value="FEB"/&gt;
 *     &lt;enumeration value="MAR"/&gt;
 *     &lt;enumeration value="APR"/&gt;
 *     &lt;enumeration value="MAY"/&gt;
 *     &lt;enumeration value="JUN"/&gt;
 *     &lt;enumeration value="JUL"/&gt;
 *     &lt;enumeration value="AUG"/&gt;
 *     &lt;enumeration value="SEP"/&gt;
 *     &lt;enumeration value="OCT"/&gt;
 *     &lt;enumeration value="NOV"/&gt;
 *     &lt;enumeration value="DEC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MonthNameType")
@XmlEnum
public enum MonthNameType {

    JAN,
    FEB,
    MAR,
    APR,
    MAY,
    JUN,
    JUL,
    AUG,
    SEP,
    OCT,
    NOV,
    DEC;

    public String value() {
        return name();
    }

    public static MonthNameType fromValue(String v) {
        return valueOf(v);
    }

}
