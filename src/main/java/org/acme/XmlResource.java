package org.acme;

import org.acme.xml.commons.NameType;
import org.acme.xml.persons.Persons;
import org.acme.xml.users.Users;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.List;

@Path("/")
public class XmlResource {

    @Inject
    org.acme.xml.users.ObjectFactory usersObjectFactory;

    @Inject
    org.acme.xml.persons.ObjectFactory personsObjectFactory;

    @Inject
    org.acme.xml.commons.ObjectFactory commonsObjectFactory;

    @Path("users")
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public Response users() {
        Users users = usersObjectFactory.createUsers();
        users.getUser().addAll(buildList());
        return Response.ok(users).build();
    }

    @Path("persons")
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public Response persons() {
        Persons persons = personsObjectFactory.createPersons();
        persons.getPerson().addAll(buildList());
        return Response.ok(persons).build();
    }

    private List<NameType> buildList() {
        NameType nameType = commonsObjectFactory.createNameType();
        nameType.setFirstName("Rosalind");
        nameType.setLastName("Franklin");
        return List.of(nameType);
    }
}