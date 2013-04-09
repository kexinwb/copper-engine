
package de.scoopgmbh.customerservice;

import javax.xml.ws.Endpoint;

/**
 * This class was generated by Apache CXF 2.6.0
 * 2013-04-08T12:41:16.322+02:00
 * Generated source version: 2.6.0
 * 
 */
 
public class CustomerService_CustomerServicePort_Server{

    protected CustomerService_CustomerServicePort_Server() throws java.lang.Exception {
        System.out.println("Starting Server");
        Object implementor = new CustomerServiceImpl();
        String address = "http://localhost:9094/CustomerServicePort";
        Endpoint.publish(address, implementor);
    }
    
    public static void main(String args[]) throws java.lang.Exception { 
        new CustomerService_CustomerServicePort_Server();
        System.out.println("Server ready..."); 
        
        Thread.sleep(5 * 60 * 1000); 
        System.out.println("Server exiting");
        System.exit(0);
    }
}
