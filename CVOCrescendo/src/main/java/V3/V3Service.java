/**
 * V3Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package V3;

public interface V3Service extends javax.xml.rpc.Service {
    public java.lang.String getV3PortAddress();

    public V3Port getV3Port() throws javax.xml.rpc.ServiceException;

    public V3Port getV3Port(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
