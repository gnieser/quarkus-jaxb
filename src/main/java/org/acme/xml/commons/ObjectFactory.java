package org.acme.xml.commons;

import jakarta.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {

    public ObjectFactory() {
    }


    public NameType createUserType() {
        return new NameType();
    }
}
