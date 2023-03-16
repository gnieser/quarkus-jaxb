package org.acme;

import jakarta.enterprise.context.ApplicationScoped;

class JAXBObjectFactoryProducer {

    @ApplicationScoped
    org.acme.xml.commons.ObjectFactory commonsObjectFactory() {
        return new org.acme.xml.commons.ObjectFactory();
    }

    @ApplicationScoped
    org.acme.xml.users.ObjectFactory usersObjectFactory() {
        return new org.acme.xml.users.ObjectFactory();
    }

    @ApplicationScoped
    org.acme.xml.persons.ObjectFactory personsObjectFactory() {
        return new org.acme.xml.persons.ObjectFactory();
    }
}