/**
 * V3ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package V3;

public class V3ServiceLocator extends org.apache.axis.client.Service implements V3Service {

    public V3ServiceLocator() {
    }


    public V3ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public V3ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for V3Port
    private java.lang.String V3Port_address = "https://cvo-crescendo-slo.smartschool.be/Webservices/V3";

    public java.lang.String getV3PortAddress() {
        return V3Port_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String V3PortWSDDServiceName = "V3Port";

    public java.lang.String getV3PortWSDDServiceName() {
        return V3PortWSDDServiceName;
    }

    public void setV3PortWSDDServiceName(java.lang.String name) {
        V3PortWSDDServiceName = name;
    }

    public V3Port getV3Port() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(V3Port_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getV3Port(endpoint);
    }

    public V3Port getV3Port(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            V3BindingStub _stub = new   V3BindingStub(portAddress, this);
            _stub.setPortName(getV3PortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setV3PortEndpointAddress(java.lang.String address) {
        V3Port_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (V3Port.class.isAssignableFrom(serviceEndpointInterface)) {
                V3BindingStub _stub = new V3BindingStub(new java.net.URL(V3Port_address), this);
                _stub.setPortName(getV3PortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("V3Port".equals(inputPortName)) {
            return getV3Port();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("https://cvo-crescendo-slo.smartschool.be/Webservices/V3", "V3Service");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("https://cvo-crescendo-slo.smartschool.be/Webservices/V3", "V3Port"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("V3Port".equals(portName)) {
            setV3PortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
