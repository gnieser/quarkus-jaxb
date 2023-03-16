package org.acme.xml.users;

import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {

    public ObjectFactory() {
    }

    public Users createUsers() {
        return new Users();
    }
}
