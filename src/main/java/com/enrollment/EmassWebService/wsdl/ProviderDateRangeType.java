//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.01.13 at 03:47:37 PM IST 
//


package com.enrollment.EmassWebService.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ProviderDateRangeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProviderDateRangeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="providerMatch" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;group ref="{http://www.healthedge.com/connector/schema/membershipsparse}ProviderMatchGroup"/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="practitionerReference" type="{http://www.healthedge.com/connector/schema/basetypes}IdentifierType" minOccurs="0"/&gt;
 *         &lt;element name="practitionerRoleReference" type="{http://www.healthedge.com/connector/schema/basetypes}IdentifierType" minOccurs="0"/&gt;
 *         &lt;element name="supplierReference" type="{http://www.healthedge.com/connector/schema/basetypes}IdentifierType" minOccurs="0"/&gt;
 *         &lt;element name="affiliatedSupplierNetworkReference" type="{http://www.healthedge.com/connector/schema/basetypes}IdentifierType" minOccurs="0"/&gt;
 *         &lt;element name="supplierLocationReference" type="{http://www.healthedge.com/connector/schema/basetypes}IdentifierType" minOccurs="0"/&gt;
 *         &lt;element name="supplierNetworkReference" type="{http://www.healthedge.com/connector/schema/basetypes}IdentifierType" minOccurs="0"/&gt;
 *         &lt;element name="pcpAutoAssigned" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="providerSelectionReason" type="{http://www.healthedge.com/connector/schema/basetypes}CodeEntryInputType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProviderDateRangeType", namespace = "http://www.healthedge.com/connector/schema/membershipsparse", propOrder = {
    "startDate",
    "endDate",
    "providerMatch",
    "practitionerReference",
    "practitionerRoleReference",
    "supplierReference",
    "affiliatedSupplierNetworkReference",
    "supplierLocationReference",
    "supplierNetworkReference",
    "pcpAutoAssigned",
    "providerSelectionReason"
})
public class ProviderDateRangeType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    protected ProviderDateRangeType.ProviderMatch providerMatch;
    protected IdentifierType practitionerReference;
    protected IdentifierType practitionerRoleReference;
    protected IdentifierType supplierReference;
    protected IdentifierType affiliatedSupplierNetworkReference;
    protected IdentifierType supplierLocationReference;
    protected IdentifierType supplierNetworkReference;
    @XmlElement(defaultValue = "false")
    protected Boolean pcpAutoAssigned;
    protected CodeEntryInputType providerSelectionReason;

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the providerMatch property.
     * 
     * @return
     *     possible object is
     *     {@link ProviderDateRangeType.ProviderMatch }
     *     
     */
    public ProviderDateRangeType.ProviderMatch getProviderMatch() {
        return providerMatch;
    }

    /**
     * Sets the value of the providerMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProviderDateRangeType.ProviderMatch }
     *     
     */
    public void setProviderMatch(ProviderDateRangeType.ProviderMatch value) {
        this.providerMatch = value;
    }

    /**
     * Gets the value of the practitionerReference property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getPractitionerReference() {
        return practitionerReference;
    }

    /**
     * Sets the value of the practitionerReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setPractitionerReference(IdentifierType value) {
        this.practitionerReference = value;
    }

    /**
     * Gets the value of the practitionerRoleReference property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getPractitionerRoleReference() {
        return practitionerRoleReference;
    }

    /**
     * Sets the value of the practitionerRoleReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setPractitionerRoleReference(IdentifierType value) {
        this.practitionerRoleReference = value;
    }

    /**
     * Gets the value of the supplierReference property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getSupplierReference() {
        return supplierReference;
    }

    /**
     * Sets the value of the supplierReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setSupplierReference(IdentifierType value) {
        this.supplierReference = value;
    }

    /**
     * Gets the value of the affiliatedSupplierNetworkReference property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getAffiliatedSupplierNetworkReference() {
        return affiliatedSupplierNetworkReference;
    }

    /**
     * Sets the value of the affiliatedSupplierNetworkReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setAffiliatedSupplierNetworkReference(IdentifierType value) {
        this.affiliatedSupplierNetworkReference = value;
    }

    /**
     * Gets the value of the supplierLocationReference property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getSupplierLocationReference() {
        return supplierLocationReference;
    }

    /**
     * Sets the value of the supplierLocationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setSupplierLocationReference(IdentifierType value) {
        this.supplierLocationReference = value;
    }

    /**
     * Gets the value of the supplierNetworkReference property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getSupplierNetworkReference() {
        return supplierNetworkReference;
    }

    /**
     * Sets the value of the supplierNetworkReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setSupplierNetworkReference(IdentifierType value) {
        this.supplierNetworkReference = value;
    }

    /**
     * Gets the value of the pcpAutoAssigned property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPcpAutoAssigned() {
        return pcpAutoAssigned;
    }

    /**
     * Sets the value of the pcpAutoAssigned property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPcpAutoAssigned(Boolean value) {
        this.pcpAutoAssigned = value;
    }

    /**
     * Gets the value of the providerSelectionReason property.
     * 
     * @return
     *     possible object is
     *     {@link CodeEntryInputType }
     *     
     */
    public CodeEntryInputType getProviderSelectionReason() {
        return providerSelectionReason;
    }

    /**
     * Sets the value of the providerSelectionReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeEntryInputType }
     *     
     */
    public void setProviderSelectionReason(CodeEntryInputType value) {
        this.providerSelectionReason = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;group ref="{http://www.healthedge.com/connector/schema/membershipsparse}ProviderMatchGroup"/&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "asOfDate",
        "practitioner",
        "practitionerRole",
        "supplier",
        "affiliatedSupplierNetwork",
        "supplierLocation",
        "supplierNetwork"
    })
    public static class ProviderMatch {

        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar asOfDate;
        protected ProviderDateRangeType.ProviderMatch.Practitioner practitioner;
        protected ProviderDateRangeType.ProviderMatch.PractitionerRole practitionerRole;
        protected ProviderDateRangeType.ProviderMatch.Supplier supplier;
        protected ProviderDateRangeType.ProviderMatch.AffiliatedSupplierNetwork affiliatedSupplierNetwork;
        protected ProviderDateRangeType.ProviderMatch.SupplierLocation supplierLocation;
        protected ProviderDateRangeType.ProviderMatch.SupplierNetwork supplierNetwork;

        /**
         * Gets the value of the asOfDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getAsOfDate() {
            return asOfDate;
        }

        /**
         * Sets the value of the asOfDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setAsOfDate(XMLGregorianCalendar value) {
            this.asOfDate = value;
        }

        /**
         * Gets the value of the practitioner property.
         * 
         * @return
         *     possible object is
         *     {@link ProviderDateRangeType.ProviderMatch.Practitioner }
         *     
         */
        public ProviderDateRangeType.ProviderMatch.Practitioner getPractitioner() {
            return practitioner;
        }

        /**
         * Sets the value of the practitioner property.
         * 
         * @param value
         *     allowed object is
         *     {@link ProviderDateRangeType.ProviderMatch.Practitioner }
         *     
         */
        public void setPractitioner(ProviderDateRangeType.ProviderMatch.Practitioner value) {
            this.practitioner = value;
        }

        /**
         * Gets the value of the practitionerRole property.
         * 
         * @return
         *     possible object is
         *     {@link ProviderDateRangeType.ProviderMatch.PractitionerRole }
         *     
         */
        public ProviderDateRangeType.ProviderMatch.PractitionerRole getPractitionerRole() {
            return practitionerRole;
        }

        /**
         * Sets the value of the practitionerRole property.
         * 
         * @param value
         *     allowed object is
         *     {@link ProviderDateRangeType.ProviderMatch.PractitionerRole }
         *     
         */
        public void setPractitionerRole(ProviderDateRangeType.ProviderMatch.PractitionerRole value) {
            this.practitionerRole = value;
        }

        /**
         * Gets the value of the supplier property.
         * 
         * @return
         *     possible object is
         *     {@link ProviderDateRangeType.ProviderMatch.Supplier }
         *     
         */
        public ProviderDateRangeType.ProviderMatch.Supplier getSupplier() {
            return supplier;
        }

        /**
         * Sets the value of the supplier property.
         * 
         * @param value
         *     allowed object is
         *     {@link ProviderDateRangeType.ProviderMatch.Supplier }
         *     
         */
        public void setSupplier(ProviderDateRangeType.ProviderMatch.Supplier value) {
            this.supplier = value;
        }

        /**
         * Gets the value of the affiliatedSupplierNetwork property.
         * 
         * @return
         *     possible object is
         *     {@link ProviderDateRangeType.ProviderMatch.AffiliatedSupplierNetwork }
         *     
         */
        public ProviderDateRangeType.ProviderMatch.AffiliatedSupplierNetwork getAffiliatedSupplierNetwork() {
            return affiliatedSupplierNetwork;
        }

        /**
         * Sets the value of the affiliatedSupplierNetwork property.
         * 
         * @param value
         *     allowed object is
         *     {@link ProviderDateRangeType.ProviderMatch.AffiliatedSupplierNetwork }
         *     
         */
        public void setAffiliatedSupplierNetwork(ProviderDateRangeType.ProviderMatch.AffiliatedSupplierNetwork value) {
            this.affiliatedSupplierNetwork = value;
        }

        /**
         * Gets the value of the supplierLocation property.
         * 
         * @return
         *     possible object is
         *     {@link ProviderDateRangeType.ProviderMatch.SupplierLocation }
         *     
         */
        public ProviderDateRangeType.ProviderMatch.SupplierLocation getSupplierLocation() {
            return supplierLocation;
        }

        /**
         * Sets the value of the supplierLocation property.
         * 
         * @param value
         *     allowed object is
         *     {@link ProviderDateRangeType.ProviderMatch.SupplierLocation }
         *     
         */
        public void setSupplierLocation(ProviderDateRangeType.ProviderMatch.SupplierLocation value) {
            this.supplierLocation = value;
        }

        /**
         * Gets the value of the supplierNetwork property.
         * 
         * @return
         *     possible object is
         *     {@link ProviderDateRangeType.ProviderMatch.SupplierNetwork }
         *     
         */
        public ProviderDateRangeType.ProviderMatch.SupplierNetwork getSupplierNetwork() {
            return supplierNetwork;
        }

        /**
         * Sets the value of the supplierNetwork property.
         * 
         * @param value
         *     allowed object is
         *     {@link ProviderDateRangeType.ProviderMatch.SupplierNetwork }
         *     
         */
        public void setSupplierNetwork(ProviderDateRangeType.ProviderMatch.SupplierNetwork value) {
            this.supplierNetwork = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;group ref="{http://www.healthedge.com/connector/schema/membershipsparse}SupplierNetworkMatchGroup"/&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "hccIdentificationNumber"
        })
        public static class AffiliatedSupplierNetwork {

            protected String hccIdentificationNumber;

            /**
             * Gets the value of the hccIdentificationNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHccIdentificationNumber() {
                return hccIdentificationNumber;
            }

            /**
             * Sets the value of the hccIdentificationNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHccIdentificationNumber(String value) {
                this.hccIdentificationNumber = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;group ref="{http://www.healthedge.com/connector/schema/membershipsparse}PractitionerMatchGroup"/&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "practitionerOtherIdentificationNumber",
            "firstName",
            "lastName",
            "hccIdentificationNumber"
        })
        public static class Practitioner {

            protected String practitionerOtherIdentificationNumber;
            protected String firstName;
            protected String lastName;
            protected String hccIdentificationNumber;

            /**
             * Gets the value of the practitionerOtherIdentificationNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPractitionerOtherIdentificationNumber() {
                return practitionerOtherIdentificationNumber;
            }

            /**
             * Sets the value of the practitionerOtherIdentificationNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPractitionerOtherIdentificationNumber(String value) {
                this.practitionerOtherIdentificationNumber = value;
            }

            /**
             * Gets the value of the firstName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFirstName() {
                return firstName;
            }

            /**
             * Sets the value of the firstName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFirstName(String value) {
                this.firstName = value;
            }

            /**
             * Gets the value of the lastName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLastName() {
                return lastName;
            }

            /**
             * Sets the value of the lastName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLastName(String value) {
                this.lastName = value;
            }

            /**
             * Gets the value of the hccIdentificationNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHccIdentificationNumber() {
                return hccIdentificationNumber;
            }

            /**
             * Sets the value of the hccIdentificationNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHccIdentificationNumber(String value) {
                this.hccIdentificationNumber = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;group ref="{http://www.healthedge.com/connector/schema/membershipsparse}PractitionerRoleMatchGroup"/&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "hccIdentificationNumber",
            "practitionerRoleIdentificationNumber",
            "roleName",
            "practitionerRoleOtherIdentificationNumber",
            "practitionerRoleOtherIdTypeCode"
        })
        public static class PractitionerRole {

            protected String hccIdentificationNumber;
            protected String practitionerRoleIdentificationNumber;
            protected String roleName;
            protected String practitionerRoleOtherIdentificationNumber;
            protected CodeEntryInputType practitionerRoleOtherIdTypeCode;

            /**
             * Gets the value of the hccIdentificationNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHccIdentificationNumber() {
                return hccIdentificationNumber;
            }

            /**
             * Sets the value of the hccIdentificationNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHccIdentificationNumber(String value) {
                this.hccIdentificationNumber = value;
            }

            /**
             * Gets the value of the practitionerRoleIdentificationNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPractitionerRoleIdentificationNumber() {
                return practitionerRoleIdentificationNumber;
            }

            /**
             * Sets the value of the practitionerRoleIdentificationNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPractitionerRoleIdentificationNumber(String value) {
                this.practitionerRoleIdentificationNumber = value;
            }

            /**
             * Gets the value of the roleName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRoleName() {
                return roleName;
            }

            /**
             * Sets the value of the roleName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRoleName(String value) {
                this.roleName = value;
            }

            /**
             * Gets the value of the practitionerRoleOtherIdentificationNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPractitionerRoleOtherIdentificationNumber() {
                return practitionerRoleOtherIdentificationNumber;
            }

            /**
             * Sets the value of the practitionerRoleOtherIdentificationNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPractitionerRoleOtherIdentificationNumber(String value) {
                this.practitionerRoleOtherIdentificationNumber = value;
            }

            /**
             * Gets the value of the practitionerRoleOtherIdTypeCode property.
             * 
             * @return
             *     possible object is
             *     {@link CodeEntryInputType }
             *     
             */
            public CodeEntryInputType getPractitionerRoleOtherIdTypeCode() {
                return practitionerRoleOtherIdTypeCode;
            }

            /**
             * Sets the value of the practitionerRoleOtherIdTypeCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link CodeEntryInputType }
             *     
             */
            public void setPractitionerRoleOtherIdTypeCode(CodeEntryInputType value) {
                this.practitionerRoleOtherIdTypeCode = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;group ref="{http://www.healthedge.com/connector/schema/membershipsparse}SupplierMatchGroup"/&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "supplierOtherIdentificationNumber",
            "primaryName",
            "hccIdentificationNumber"
        })
        public static class Supplier {

            protected String supplierOtherIdentificationNumber;
            protected String primaryName;
            protected String hccIdentificationNumber;

            /**
             * Gets the value of the supplierOtherIdentificationNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSupplierOtherIdentificationNumber() {
                return supplierOtherIdentificationNumber;
            }

            /**
             * Sets the value of the supplierOtherIdentificationNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSupplierOtherIdentificationNumber(String value) {
                this.supplierOtherIdentificationNumber = value;
            }

            /**
             * Gets the value of the primaryName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPrimaryName() {
                return primaryName;
            }

            /**
             * Sets the value of the primaryName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPrimaryName(String value) {
                this.primaryName = value;
            }

            /**
             * Gets the value of the hccIdentificationNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHccIdentificationNumber() {
                return hccIdentificationNumber;
            }

            /**
             * Sets the value of the hccIdentificationNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHccIdentificationNumber(String value) {
                this.hccIdentificationNumber = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;group ref="{http://www.healthedge.com/connector/schema/membershipsparse}SupplierLocationMatchGroup"/&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "hccIdentificationNumber"
        })
        public static class SupplierLocation {

            protected String hccIdentificationNumber;

            /**
             * Gets the value of the hccIdentificationNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHccIdentificationNumber() {
                return hccIdentificationNumber;
            }

            /**
             * Sets the value of the hccIdentificationNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHccIdentificationNumber(String value) {
                this.hccIdentificationNumber = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;group ref="{http://www.healthedge.com/connector/schema/membershipsparse}SupplierNetworkMatchGroup"/&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "hccIdentificationNumber"
        })
        public static class SupplierNetwork {

            protected String hccIdentificationNumber;

            /**
             * Gets the value of the hccIdentificationNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHccIdentificationNumber() {
                return hccIdentificationNumber;
            }

            /**
             * Sets the value of the hccIdentificationNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHccIdentificationNumber(String value) {
                this.hccIdentificationNumber = value;
            }

        }

    }

}
