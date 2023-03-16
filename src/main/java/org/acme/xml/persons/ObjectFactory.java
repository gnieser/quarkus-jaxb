package org.acme.xml.persons;

import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {

    public ObjectFactory() {
    }

    public Persons createPersons() {
        return new Persons();
    }
}
