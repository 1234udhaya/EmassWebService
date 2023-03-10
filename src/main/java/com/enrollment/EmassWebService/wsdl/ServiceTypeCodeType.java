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
 * <p>Java class for ServiceTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ServiceTypeCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ADA code"/&gt;
 *     &lt;enumeration value="CPT-4 code"/&gt;
 *     &lt;enumeration value="HCPCS code"/&gt;
 *     &lt;enumeration value="Homegrown Code"/&gt;
 *     &lt;enumeration value="HIEC code"/&gt;
 *     &lt;enumeration value="NDC 5-4-2"/&gt;
 *     &lt;enumeration value="UB Revenue Code"/&gt;
 *     &lt;enumeration value="HIPPS Code"/&gt;
 *     &lt;enumeration value="UPN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ServiceTypeCodeType")
@XmlEnum
public enum ServiceTypeCodeType {

    @XmlEnumValue("ADA code")
    ADA_CODE("ADA code"),
    @XmlEnumValue("CPT-4 code")
    CPT_4_CODE("CPT-4 code"),
    @XmlEnumValue("HCPCS code")
    HCPCS_CODE("HCPCS code"),
    @XmlEnumValue("Homegrown Code")
    HOMEGROWN_CODE("Homegrown Code"),
    @XmlEnumValue("HIEC code")
    HIEC_CODE("HIEC code"),
    @XmlEnumValue("NDC 5-4-2")
    NDC_5_4_2("NDC 5-4-2"),
    @XmlEnumValue("UB Revenue Code")
    UB_REVENUE_CODE("UB Revenue Code"),
    @XmlEnumValue("HIPPS Code")
    HIPPS_CODE("HIPPS Code"),
    UPN("UPN");
    private final String value;

    ServiceTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ServiceTypeCodeType fromValue(String v) {
        for (ServiceTypeCodeType c: ServiceTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
