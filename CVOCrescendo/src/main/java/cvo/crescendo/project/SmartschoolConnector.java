package cvo.crescendo.project;

import V3.V3Port;
import V3.V3PortProxy;

import java.util.Base64;

/**
 * Created by thomasleysen on 2/05/17.
 */
public class SmartschoolConnector {

    public static void Connect() {

        final String ACCESCODE = "f74ae6218a75cdd3cb48";
        final String USERNAME = "groep1";
        final String PASSWORD = "CVOtest123!";
        final int USERTYPE = 0;
        final String URI = "https://cvo-crescendo-slo.smartschool.be";

        try {
            V3Port v3Port = new V3PortProxy();
            System.out.println(v3Port.getAllGroupsAndClasses(ACCESCODE));
            System.out.println(v3Port.getUserDetails(ACCESCODE, "123"));

            byte[] decodedBytes = Base64.getDecoder().decode(v3Port.getAllGroupsAndClasses(ACCESCODE).toString());
            String decodedString = new String(decodedBytes);
            System.out.println(decodedString);


            System.out.println("succes");
        } catch (java.rmi.RemoteException ex) {
            System.out.print(ex);
        }
    }
};

