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
 * <p>Java class for USStateTerritoryCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="USStateTerritoryCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AL"/&gt;
 *     &lt;enumeration value="AK"/&gt;
 *     &lt;enumeration value="AS"/&gt;
 *     &lt;enumeration value="AZ"/&gt;
 *     &lt;enumeration value="AR"/&gt;
 *     &lt;enumeration value="CA"/&gt;
 *     &lt;enumeration value="CO"/&gt;
 *     &lt;enumeration value="CT"/&gt;
 *     &lt;enumeration value="DE"/&gt;
 *     &lt;enumeration value="DC"/&gt;
 *     &lt;enumeration value="FM"/&gt;
 *     &lt;enumeration value="FL"/&gt;
 *     &lt;enumeration value="GA"/&gt;
 *     &lt;enumeration value="GU"/&gt;
 *     &lt;enumeration value="HI"/&gt;
 *     &lt;enumeration value="ID"/&gt;
 *     &lt;enumeration value="IL"/&gt;
 *     &lt;enumeration value="IN"/&gt;
 *     &lt;enumeration value="IA"/&gt;
 *     &lt;enumeration value="KS"/&gt;
 *     &lt;enumeration value="KY"/&gt;
 *     &lt;enumeration value="LA"/&gt;
 *     &lt;enumeration value="ME"/&gt;
 *     &lt;enumeration value="MH"/&gt;
 *     &lt;enumeration value="MD"/&gt;
 *     &lt;enumeration value="MA"/&gt;
 *     &lt;enumeration value="MI"/&gt;
 *     &lt;enumeration value="MN"/&gt;
 *     &lt;enumeration value="MS"/&gt;
 *     &lt;enumeration value="MO"/&gt;
 *     &lt;enumeration value="MT"/&gt;
 *     &lt;enumeration value="NE"/&gt;
 *     &lt;enumeration value="NV"/&gt;
 *     &lt;enumeration value="NH"/&gt;
 *     &lt;enumeration value="NJ"/&gt;
 *     &lt;enumeration value="NM"/&gt;
 *     &lt;enumeration value="NY"/&gt;
 *     &lt;enumeration value="NC"/&gt;
 *     &lt;enumeration value="ND"/&gt;
 *     &lt;enumeration value="MP"/&gt;
 *     &lt;enumeration value="OH"/&gt;
 *     &lt;enumeration value="OK"/&gt;
 *     &lt;enumeration value="OR"/&gt;
 *     &lt;enumeration value="PW"/&gt;
 *     &lt;enumeration value="PA"/&gt;
 *     &lt;enumeration value="PR"/&gt;
 *     &lt;enumeration value="RI"/&gt;
 *     &lt;enumeration value="SC"/&gt;
 *     &lt;enumeration value="SD"/&gt;
 *     &lt;enumeration value="TN"/&gt;
 *     &lt;enumeration value="TX"/&gt;
 *     &lt;enumeration value="UT"/&gt;
 *     &lt;enumeration value="VT"/&gt;
 *     &lt;enumeration value="VI"/&gt;
 *     &lt;enumeration value="VA"/&gt;
 *     &lt;enumeration value="WA"/&gt;
 *     &lt;enumeration value="WV"/&gt;
 *     &lt;enumeration value="WI"/&gt;
 *     &lt;enumeration value="WY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "USStateTerritoryCode", namespace = "http://www.codesynthesis.com/xmlns/xsstl")
@XmlEnum
public enum USStateTerritoryCode2 {

    AL,
    AK,
    AS,
    AZ,
    AR,
    CA,
    CO,
    CT,
    DE,
    DC,
    FM,
    FL,
    GA,
    GU,
    HI,
    ID,
    IL,
    IN,
    IA,
    KS,
    KY,
    LA,
    ME,
    MH,
    MD,
    MA,
    MI,
    MN,
    MS,
    MO,
    MT,
    NE,
    NV,
    NH,
    NJ,
    NM,
    NY,
    NC,
    ND,
    MP,
    OH,
    OK,
    OR,
    PW,
    PA,
    PR,
    RI,
    SC,
    SD,
    TN,
    TX,
    UT,
    VT,
    VI,
    VA,
    WA,
    WV,
    WI,
    WY;

    public String value() {
        return name();
    }

    public static USStateTerritoryCode2 fromValue(String v) {
        return valueOf(v);
    }

}
