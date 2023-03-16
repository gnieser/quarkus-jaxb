package org.acme.xml.users;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.acme.xml.commons.NameType;

import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "user"
})
@XmlRootElement(name = "users")
public class Users {

    protected List<NameType> user;

    public List<NameType> getUser() {
        if (user == null) {
            user = new ArrayList<>();
        }
        return this.user;
    }

    public void setUser(List<NameType> value) {
        this.user = value;
    }

}
