package org.acme.xml.users;

import org.acme.xml.commons.NameType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
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
