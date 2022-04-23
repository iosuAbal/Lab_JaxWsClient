package service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService(endpointInterface = "service.WebServiceLogicInterface")
public interface WebServiceLogicInterface {
    @WebMethod
    public List<Owner> getAllOwners();
    @WebMethod
    public List<RuralHouse> getAllRuralHouses();
    @WebMethod
    public Owner getOwnerByName(String name);
    @WebMethod
    public RuralHouse getRuralHouseByAddress(String address);
}
