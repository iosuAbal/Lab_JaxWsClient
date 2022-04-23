package client;

import service.Owner;
import service.RuralHouse;
import service.WebServiceLogicInterface;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;


public class Client {
    public static void main(String args[]){
        URL url = null;
        try {
            url = new URL("http://localhost:8080/ws?wsdl");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        QName qname = new QName("http://service/","WebServiceLogicService");
        Service service = Service.create(url, qname);
        WebServiceLogicInterface wsl = service.getPort(WebServiceLogicInterface.class);
        System.out.println("Testing getAllOwners method:");
        List<Owner> ownerList = wsl.getAllOwners();
        for (Owner o : ownerList) {
            System.out.println("\t" + o);
        }

        System.out.println("Testing getRuralHouses method:");
        List<RuralHouse> housesList = wsl.getAllRuralHouses();
        System.out.println(housesList);
        for (RuralHouse r : housesList) {
            System.out.println("\t" + r);
        }

        System.out.println("\nTesting getOwnerByName(\"Ainara\") method:");
        Owner o = wsl.getOwnerByName("Ainara");
        System.out.println("\t" + o);

    }

}
