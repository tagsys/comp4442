/**
 * BookmarkCollection.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package comp4442.webservice.soap;

public class BookmarkCollection  implements java.io.Serializable {
    private comp4442.webservice.soap.Bookmark[] collection;

    private long lastUpdatedTime;

    public BookmarkCollection() {
    }

    public BookmarkCollection(
           comp4442.webservice.soap.Bookmark[] collection,
           long lastUpdatedTime) {
           this.collection = collection;
           this.lastUpdatedTime = lastUpdatedTime;
    }


    /**
     * Gets the collection value for this BookmarkCollection.
     * 
     * @return collection
     */
    public comp4442.webservice.soap.Bookmark[] getCollection() {
        return collection;
    }


    /**
     * Sets the collection value for this BookmarkCollection.
     * 
     * @param collection
     */
    public void setCollection(comp4442.webservice.soap.Bookmark[] collection) {
        this.collection = collection;
    }


    /**
     * Gets the lastUpdatedTime value for this BookmarkCollection.
     * 
     * @return lastUpdatedTime
     */
    public long getLastUpdatedTime() {
        return lastUpdatedTime;
    }


    /**
     * Sets the lastUpdatedTime value for this BookmarkCollection.
     * 
     * @param lastUpdatedTime
     */
    public void setLastUpdatedTime(long lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BookmarkCollection)) return false;
        BookmarkCollection other = (BookmarkCollection) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.collection==null && other.getCollection()==null) || 
             (this.collection!=null &&
              java.util.Arrays.equals(this.collection, other.getCollection()))) &&
            this.lastUpdatedTime == other.getLastUpdatedTime();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCollection() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCollection());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCollection(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += new Long(getLastUpdatedTime()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BookmarkCollection.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.webservice.comp4442", "BookmarkCollection"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("collection");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.webservice.comp4442", "collection"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.webservice.comp4442", "Bookmark"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://soap.webservice.comp4442", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastUpdatedTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.webservice.comp4442", "lastUpdatedTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
