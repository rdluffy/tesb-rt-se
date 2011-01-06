
package org.oasis_open.docs.ws_sx.ws_trust._200512;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;


/**
 * 
 *         Actual content model is non-deterministic, hence wildcard. The following shows intended content model:
 * 
 *         <xs:element ref='wst:TokenType' minOccurs='0' />
 *         <xs:element ref='wst:RequestType' />
 *         <xs:element ref='wst:RequestedSecurityToken'  minOccurs='0' />
 *         <xs:element ref='wsp:AppliesTo' minOccurs='0' />
 *         <xs:element ref='wst:RequestedAttachedReference' minOccurs='0' />
 *         <xs:element ref='wst:RequestedUnattachedReference' minOccurs='0' />
 *         <xs:element ref='wst:RequestedProofToken' minOccurs='0' />
 *         <xs:element ref='wst:Entropy' minOccurs='0' />
 *         <xs:element ref='wst:Lifetime' minOccurs='0' />
 *         <xs:element ref='wst:Status' minOccurs='0' />
 *         <xs:element ref='wst:AllowPostdating' minOccurs='0' />
 *         <xs:element ref='wst:Renewing' minOccurs='0' />
 *         <xs:element ref='wst:OnBehalfOf' minOccurs='0' />
 *         <xs:element ref='wst:Issuer' minOccurs='0' />
 *         <xs:element ref='wst:AuthenticationType' minOccurs='0' />
 *         <xs:element ref='wst:Authenticator' minOccurs='0' />
 *         <xs:element ref='wst:KeyType' minOccurs='0' />
 *         <xs:element ref='wst:KeySize' minOccurs='0' />
 *         <xs:element ref='wst:SignatureAlgorithm' minOccurs='0' />
 *         <xs:element ref='wst:Encryption' minOccurs='0' />
 *         <xs:element ref='wst:EncryptionAlgorithm' minOccurs='0' />
 *         <xs:element ref='wst:CanonicalizationAlgorithm' minOccurs='0' />
 *         <xs:element ref='wst:ProofEncryption' minOccurs='0' />
 *         <xs:element ref='wst:UseKey' minOccurs='0' />
 *         <xs:element ref='wst:SignWith' minOccurs='0' />
 *         <xs:element ref='wst:EncryptWith' minOccurs='0' />
 *         <xs:element ref='wst:DelegateTo' minOccurs='0' />
 *         <xs:element ref='wst:Forwardable' minOccurs='0' />
 *         <xs:element ref='wst:Delegatable' minOccurs='0' />
 *         <xs:element ref='wsp:Policy' minOccurs='0' />
 *         <xs:element ref='wsp:PolicyReference' minOccurs='0' />
 *         <xs:any namespace='##other' processContents='lax' minOccurs='0' maxOccurs='unbounded' />
 * 
 *       
 * 
 * <p>Java class for RequestSecurityTokenResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestSecurityTokenResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Context" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestSecurityTokenResponseType", propOrder = {
    "any"
})
public class RequestSecurityTokenResponseType {

    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "Context")
    @XmlSchemaType(name = "anyURI")
    protected String context;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

    /**
     * Gets the value of the context property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContext() {
        return context;
    }

    /**
     * Sets the value of the context property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContext(String value) {
        this.context = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
