/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you 
 * may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.07 at 01:56:59 PM PDT 
//

package org.esipfed.eskg.structures;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://gcmd.gsfc.nasa.gov/Aboutus/xml/dif/}Location_Category"/&gt;
 *         &lt;element ref="{http://gcmd.gsfc.nasa.gov/Aboutus/xml/dif/}Location_Type" minOccurs="0"/&gt;
 *         &lt;element ref="{http://gcmd.gsfc.nasa.gov/Aboutus/xml/dif/}Location_Subregion1" minOccurs="0"/&gt;
 *         &lt;element ref="{http://gcmd.gsfc.nasa.gov/Aboutus/xml/dif/}Location_Subregion2" minOccurs="0"/&gt;
 *         &lt;element ref="{http://gcmd.gsfc.nasa.gov/Aboutus/xml/dif/}Location_Subregion3" minOccurs="0"/&gt;
 *         &lt;element ref="{http://gcmd.gsfc.nasa.gov/Aboutus/xml/dif/}Detailed_Location" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "locationCategory",
    "locationType",
    "locationSubregion1",
    "locationSubregion2",
    "locationSubregion3",
    "detailedLocation"
})
@XmlRootElement(name = "Location")
public class Location {

    @XmlElement(name = "Location_Category", required = true)
    protected String locationCategory;
    @XmlElement(name = "Location_Type")
    protected String locationType;
    @XmlElement(name = "Location_Subregion1")
    protected String locationSubregion1;
    @XmlElement(name = "Location_Subregion2")
    protected String locationSubregion2;
    @XmlElement(name = "Location_Subregion3")
    protected String locationSubregion3;
    @XmlElement(name = "Detailed_Location")
    protected String detailedLocation;

    /**
     * Gets the value of the locationCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationCategory() {
        return locationCategory;
    }

    /**
     * Sets the value of the locationCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationCategory(String value) {
        this.locationCategory = value;
    }

    /**
     * Gets the value of the locationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationType() {
        return locationType;
    }

    /**
     * Sets the value of the locationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationType(String value) {
        this.locationType = value;
    }

    /**
     * Gets the value of the locationSubregion1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationSubregion1() {
        return locationSubregion1;
    }

    /**
     * Sets the value of the locationSubregion1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationSubregion1(String value) {
        this.locationSubregion1 = value;
    }

    /**
     * Gets the value of the locationSubregion2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationSubregion2() {
        return locationSubregion2;
    }

    /**
     * Sets the value of the locationSubregion2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationSubregion2(String value) {
        this.locationSubregion2 = value;
    }

    /**
     * Gets the value of the locationSubregion3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationSubregion3() {
        return locationSubregion3;
    }

    /**
     * Sets the value of the locationSubregion3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationSubregion3(String value) {
        this.locationSubregion3 = value;
    }

    /**
     * Gets the value of the detailedLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetailedLocation() {
        return detailedLocation;
    }

    /**
     * Sets the value of the detailedLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetailedLocation(String value) {
        this.detailedLocation = value;
    }

}
