//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vIBM 2.2.3-11/28/2011 06:21 AM(foreman)- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.10.01 at 03:04:46 PM EDT 
//


package jsr352.batch.jsl;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Partition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Partition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="partition-mapper" type="{http://batch.jsr352/jsl}PartitionMapper" minOccurs="0"/>
 *         &lt;element name="partition-plan" type="{http://batch.jsr352/jsl}PartitionPlan" minOccurs="0"/>
 *         &lt;element name="collector" type="{http://batch.jsr352/jsl}Collector" minOccurs="0"/>
 *         &lt;element name="analyzer" type="{http://batch.jsr352/jsl}Analyzer" minOccurs="0"/>
 *         &lt;element name="PartitionReducer" type="{http://batch.jsr352/jsl}PartitionReducer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Partition", propOrder = {
    "partitionMapper",
    "partitionPlan",
    "collector",
    "analyzer",
    "partitionReducer"
})
@Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2012-10-01T03:04:46-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
public class Partition {

    @XmlElement(name = "partition-mapper")
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2012-10-01T03:04:46-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    protected PartitionMapper partitionMapper;
    @XmlElement(name = "partition-plan")
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2012-10-01T03:04:46-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    protected PartitionPlan partitionPlan;
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2012-10-01T03:04:46-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    protected Collector collector;
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2012-10-01T03:04:46-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    protected Analyzer analyzer;
    @XmlElement(name = "PartitionReducer")
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2012-10-01T03:04:46-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    protected PartitionReducer partitionReducer;

    /**
     * Gets the value of the partitionMapper property.
     * 
     * @return
     *     possible object is
     *     {@link PartitionMapper }
     *     
     */
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2012-10-01T03:04:46-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public PartitionMapper getPartitionMapper() {
        return partitionMapper;
    }

    /**
     * Sets the value of the partitionMapper property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartitionMapper }
     *     
     */
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2012-10-01T03:04:46-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public void setPartitionMapper(PartitionMapper value) {
        this.partitionMapper = value;
    }

    /**
     * Gets the value of the partitionPlan property.
     * 
     * @return
     *     possible object is
     *     {@link PartitionPlan }
     *     
     */
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2012-10-01T03:04:46-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public PartitionPlan getPartitionPlan() {
        return partitionPlan;
    }

    /**
     * Sets the value of the partitionPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartitionPlan }
     *     
     */
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2012-10-01T03:04:46-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public void setPartitionPlan(PartitionPlan value) {
        this.partitionPlan = value;
    }

    /**
     * Gets the value of the collector property.
     * 
     * @return
     *     possible object is
     *     {@link Collector }
     *     
     */
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2012-10-01T03:04:46-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public Collector getCollector() {
        return collector;
    }

    /**
     * Sets the value of the collector property.
     * 
     * @param value
     *     allowed object is
     *     {@link Collector }
     *     
     */
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2012-10-01T03:04:46-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public void setCollector(Collector value) {
        this.collector = value;
    }

    /**
     * Gets the value of the analyzer property.
     * 
     * @return
     *     possible object is
     *     {@link Analyzer }
     *     
     */
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2012-10-01T03:04:46-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public Analyzer getAnalyzer() {
        return analyzer;
    }

    /**
     * Sets the value of the analyzer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Analyzer }
     *     
     */
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2012-10-01T03:04:46-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public void setAnalyzer(Analyzer value) {
        this.analyzer = value;
    }

    /**
     * Gets the value of the partitionReducer property.
     * 
     * @return
     *     possible object is
     *     {@link PartitionReducer }
     *     
     */
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2012-10-01T03:04:46-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public PartitionReducer getPartitionReducer() {
        return partitionReducer;
    }

    /**
     * Sets the value of the partitionReducer property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartitionReducer }
     *     
     */
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2012-10-01T03:04:46-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public void setPartitionReducer(PartitionReducer value) {
        this.partitionReducer = value;
    }

}