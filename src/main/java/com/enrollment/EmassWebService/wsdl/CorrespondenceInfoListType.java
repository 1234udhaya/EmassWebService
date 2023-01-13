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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorrespondenceInfoListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CorrespondenceInfoListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="listMode" type="{http://www.healthedge.com/connector/schema/basetypes}ListUpdateModeType" minOccurs="0"/&gt;
 *         &lt;element name="correspondenceInfo" type="{http://www.healthedge.com/connector/schema/basetypes}CorrespondenceInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorrespondenceInfoListType", propOrder = {
    "listMode",
    "correspondenceInfo"
})
public class CorrespondenceInfoListType {

    @XmlSchemaType(name = "string")
    protected ListUpdateModeType listMode;
    protected List<CorrespondenceInfoType> correspondenceInfo;

    /**
     * Gets the value of the listMode property.
     * 
     * @return
     *     possible object is
     *     {@link ListUpdateModeType }
     *     
     */
    public ListUpdateModeType getListMode() {
        return listMode;
    }

    /**
     * Sets the value of the listMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListUpdateModeType }
     *     
     */
    public void setListMode(ListUpdateModeType value) {
        this.listMode = value;
    }

    /**
     * Gets the value of the correspondenceInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the correspondenceInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorrespondenceInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorrespondenceInfoType }
     * 
     * 
     */
    public List<CorrespondenceInfoType> getCorrespondenceInfo() {
        if (correspondenceInfo == null) {
            correspondenceInfo = new ArrayList<CorrespondenceInfoType>();
        }
        return this.correspondenceInfo;
    }

}
