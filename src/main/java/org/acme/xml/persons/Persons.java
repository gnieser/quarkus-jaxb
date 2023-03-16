package org.acme.xml.persons;

import org.acme.xml.commons.NameType;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "person"
})
@XmlRootElement(name = "persons")
public class Persons {

    protected List<NameType> person;

    public List<NameType> getPerson() {
        if (person == null) {
            person = new ArrayList<>();
        }
        return this.person;
    }

    public void setPerson(List<NameType> value) {
        this.person = value;
    }

}
