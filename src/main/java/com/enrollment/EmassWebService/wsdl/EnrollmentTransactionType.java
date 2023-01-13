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
 * <p>Java class for EnrollmentTransactionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="EnrollmentTransactionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ADD"/&gt;
 *     &lt;enumeration value="AMEND"/&gt;
 *     &lt;enumeration value="TERMINATE"/&gt;
 *     &lt;enumeration value="REINSTATE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EnrollmentTransactionType", namespace = "http://www.healthedge.com/connector/schema/enrollmentsparseresponse")
@XmlEnum
public enum EnrollmentTransactionType {

    ADD,
    AMEND,
    TERMINATE,
    REINSTATE;

    public String value() {
        return name();
    }

    public static EnrollmentTransactionType fromValue(String v) {
        return valueOf(v);
    }

}