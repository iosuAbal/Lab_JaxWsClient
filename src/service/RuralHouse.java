package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import java.io.Serializable;

@XmlAccessorType(XmlAccessType.FIELD)
public class RuralHouse implements Serializable {
    @XmlID
    private String address;
    @XmlIDREF
    private  Owner owner;
    private Object XmlAccessType;

    public RuralHouse() {
    }

    public RuralHouse(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}
