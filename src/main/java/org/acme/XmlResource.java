package org.acme;

import org.acme.xml.commons.NameType;
import org.acme.xml.persons.Persons;
import org.acme.xml.users.Users;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
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
        users.setUser(buildList());
        return Response.ok(users).build();
    }

    @Path("persons")
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public Response persons() {
        Persons persons = personsObjectFactory.createPersons();
        persons.setPerson(buildList());
        return Response.ok(persons).build();
    }

    private List<NameType> buildList() {
        NameType nameType = commonsObjectFactory.createUserType();
        nameType.setFirstName("Rosalind");
        nameType.setLastName("Franklin");
        return List.of(nameType);
    }
}