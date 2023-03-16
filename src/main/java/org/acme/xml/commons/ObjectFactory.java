package org.acme.xml.commons;

import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {

    public ObjectFactory() {
    }


    public NameType createUserType() {
        return new NameType();
    }
}
