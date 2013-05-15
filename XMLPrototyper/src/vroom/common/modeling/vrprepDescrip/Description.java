//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2012.07.13 � 02:34:53 PM CEST 
//


package vroom.common.modeling.vrprepDescrip;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="instances" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="typeDefinitions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="node" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{}type" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="link" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{}type" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="vehicle" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{}type" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="request" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{}type" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="other" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{}type" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="furtherDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "instances",
    "typeDefinitions",
    "furtherDetails"
})
@XmlRootElement(name = "description")
public class Description {

    @XmlElement(required = true)
    protected String instances;
    protected Description.TypeDefinitions typeDefinitions;
    protected String furtherDetails;

    /**
     * Obtient la valeur de la propri�t� instances.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstances() {
        return instances;
    }

    /**
     * D�finit la valeur de la propri�t� instances.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstances(String value) {
        this.instances = value;
    }

    /**
     * Obtient la valeur de la propri�t� typeDefinitions.
     * 
     * @return
     *     possible object is
     *     {@link Description.TypeDefinitions }
     *     
     */
    public Description.TypeDefinitions getTypeDefinitions() {
        return typeDefinitions;
    }

    /**
     * D�finit la valeur de la propri�t� typeDefinitions.
     * 
     * @param value
     *     allowed object is
     *     {@link Description.TypeDefinitions }
     *     
     */
    public void setTypeDefinitions(Description.TypeDefinitions value) {
        this.typeDefinitions = value;
    }

    /**
     * Obtient la valeur de la propri�t� furtherDetails.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFurtherDetails() {
        return furtherDetails;
    }

    /**
     * D�finit la valeur de la propri�t� furtherDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFurtherDetails(String value) {
        this.furtherDetails = value;
    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="node" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{}type" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="link" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{}type" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="vehicle" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{}type" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="request" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{}type" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="other" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{}type" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "node",
        "link",
        "vehicle",
        "request",
        "other"
    })
    public static class TypeDefinitions {

        protected Description.TypeDefinitions.Node node;
        protected Description.TypeDefinitions.Link link;
        protected Description.TypeDefinitions.Vehicle vehicle;
        protected Description.TypeDefinitions.Request request;
        protected List<Description.TypeDefinitions.Other> other;

        /**
         * Obtient la valeur de la propri�t� node.
         * 
         * @return
         *     possible object is
         *     {@link Description.TypeDefinitions.Node }
         *     
         */
        public Description.TypeDefinitions.Node getNode() {
            return node;
        }

        /**
         * D�finit la valeur de la propri�t� node.
         * 
         * @param value
         *     allowed object is
         *     {@link Description.TypeDefinitions.Node }
         *     
         */
        public void setNode(Description.TypeDefinitions.Node value) {
            this.node = value;
        }

        /**
         * Obtient la valeur de la propri�t� link.
         * 
         * @return
         *     possible object is
         *     {@link Description.TypeDefinitions.Link }
         *     
         */
        public Description.TypeDefinitions.Link getLink() {
            return link;
        }

        /**
         * D�finit la valeur de la propri�t� link.
         * 
         * @param value
         *     allowed object is
         *     {@link Description.TypeDefinitions.Link }
         *     
         */
        public void setLink(Description.TypeDefinitions.Link value) {
            this.link = value;
        }

        /**
         * Obtient la valeur de la propri�t� vehicle.
         * 
         * @return
         *     possible object is
         *     {@link Description.TypeDefinitions.Vehicle }
         *     
         */
        public Description.TypeDefinitions.Vehicle getVehicle() {
            return vehicle;
        }

        /**
         * D�finit la valeur de la propri�t� vehicle.
         * 
         * @param value
         *     allowed object is
         *     {@link Description.TypeDefinitions.Vehicle }
         *     
         */
        public void setVehicle(Description.TypeDefinitions.Vehicle value) {
            this.vehicle = value;
        }

        /**
         * Obtient la valeur de la propri�t� request.
         * 
         * @return
         *     possible object is
         *     {@link Description.TypeDefinitions.Request }
         *     
         */
        public Description.TypeDefinitions.Request getRequest() {
            return request;
        }

        /**
         * D�finit la valeur de la propri�t� request.
         * 
         * @param value
         *     allowed object is
         *     {@link Description.TypeDefinitions.Request }
         *     
         */
        public void setRequest(Description.TypeDefinitions.Request value) {
            this.request = value;
        }

        /**
         * Gets the value of the other property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the other property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOther().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Description.TypeDefinitions.Other }
         * 
         * 
         */
        public List<Description.TypeDefinitions.Other> getOther() {
            if (other == null) {
                other = new ArrayList<Description.TypeDefinitions.Other>();
            }
            return this.other;
        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element ref="{}type" maxOccurs="unbounded"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "type"
        })
        public static class Link {

            @XmlElement(required = true)
            protected List<Type> type;

            /**
             * Gets the value of the type property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the type property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getType().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Type }
             * 
             * 
             */
            public List<Type> getType() {
                if (type == null) {
                    type = new ArrayList<Type>();
                }
                return this.type;
            }

        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element ref="{}type" maxOccurs="unbounded"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "type"
        })
        public static class Node {

            @XmlElement(required = true)
            protected List<Type> type;

            /**
             * Gets the value of the type property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the type property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getType().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Type }
             * 
             * 
             */
            public List<Type> getType() {
                if (type == null) {
                    type = new ArrayList<Type>();
                }
                return this.type;
            }

        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element ref="{}type" maxOccurs="unbounded"/>
         *       &lt;/sequence>
         *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "type"
        })
        public static class Other {

            @XmlElement(required = true)
            protected List<Type> type;
            @XmlAttribute(name = "name", required = true)
            protected String name;

            /**
             * Gets the value of the type property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the type property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getType().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Type }
             * 
             * 
             */
            public List<Type> getType() {
                if (type == null) {
                    type = new ArrayList<Type>();
                }
                return this.type;
            }

            /**
             * Obtient la valeur de la propri�t� name.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * D�finit la valeur de la propri�t� name.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element ref="{}type" maxOccurs="unbounded"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "type"
        })
        public static class Request {

            @XmlElement(required = true)
            protected List<Type> type;

            /**
             * Gets the value of the type property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the type property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getType().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Type }
             * 
             * 
             */
            public List<Type> getType() {
                if (type == null) {
                    type = new ArrayList<Type>();
                }
                return this.type;
            }

        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element ref="{}type" maxOccurs="unbounded"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "type"
        })
        public static class Vehicle {

            @XmlElement(required = true)
            protected List<Type> type;

            /**
             * Gets the value of the type property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the type property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getType().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Type }
             * 
             * 
             */
            public List<Type> getType() {
                if (type == null) {
                    type = new ArrayList<Type>();
                }
                return this.type;
            }

        }

    }

}
