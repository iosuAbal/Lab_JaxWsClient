package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import java.io.Serializable;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class Owner implements Serializable {
    @XmlID
    private String name;
    @XmlIDREF
    private List<RuralHouse> ruralHouses;

    public Owner(String name) {
        this.name = name;
    }

    public Owner() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<RuralHouse> getRuralHouses() {
        return ruralHouses;
    }

    public void setRuralHouses(List<RuralHouse> ruralHouses) {
        this.ruralHouses = ruralHouses;
    }
    public void addRuralHouse(RuralHouse rh){
        this.ruralHouses.add(rh);
    }

    @Override
    public String toString() {
        return "Owner{" +
                "name='" + name + '\'' +
                ", ruralHouses=" + ruralHouses +
                '}';
    }
}
