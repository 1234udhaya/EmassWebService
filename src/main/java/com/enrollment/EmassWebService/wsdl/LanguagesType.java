//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.01.13 at 03:47:37 PM IST 
//


package com.enrollment.EmassWebService.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LanguagesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LanguagesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="listMode" type="{http://www.healthedge.com/connector/schema/basetypes}ListActionType" minOccurs="0"/&gt;
 *         &lt;element name="language" type="{http://www.healthedge.com/connector/schema/basetypes}LanguageSpokenType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LanguagesType", propOrder = {
    "listMode",
    "language"
})
public class LanguagesType {

    @XmlSchemaType(name = "string")
    protected ListActionType listMode;
    @XmlElement(required = true)
    protected List<LanguageSpokenType> language;

    /**
     * Gets the value of the listMode property.
     * 
     * @return
     *     possible object is
     *     {@link ListActionType }
     *     
     */
    public ListActionType getListMode() {
        return listMode;
    }

    /**
     * Sets the value of the listMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListActionType }
     *     
     */
    public void setListMode(ListActionType value) {
        this.listMode = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the language property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLanguage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LanguageSpokenType }
     * 
     * 
     */
    public List<LanguageSpokenType> getLanguage() {
        if (language == null) {
            language = new ArrayList<LanguageSpokenType>();
        }
        return this.language;
    }

}
