package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;
import org.xmlunit.assertj3.XmlAssert;

import static io.restassured.RestAssured.given;

@QuarkusTest
class XmlResourceTest {

    @Test
    void testUsers() {
        String actualXml = given().when().get("/users").then()
                .log().everything(true)
                .statusCode(200).extract().body().asString();

        String expectedXml = """
                <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
                <acme:users xmlns:acme="users.xml.acme.org" xmlns:c="commons.xml.acme.org">
                    <acme:user>
                        <c:firstName>Rosalind</c:firstName>
                        <c:lastName>Franklin</c:lastName>
                    </acme:user>
                </acme:users>
                """;

        XmlAssert.assertThat(actualXml).and(expectedXml).ignoreWhitespace().areIdentical();
    }

    @Test
    void testPersons() {
        String actualXml = given().when().get("/persons").then()
                .log().everything(true)
                .statusCode(200).extract().body().asString();

        String expectedXml = """
                <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
                <acme:persons xmlns:acme="persons.xml.acme.org" xmlns:c="commons.xml.acme.org">
                    <acme:person>
                        <c:firstName>Rosalind</c:firstName>
                        <c:lastName>Franklin</c:lastName>
                    </acme:person>
                </acme:persons>
                """;

        XmlAssert.assertThat(actualXml).and(expectedXml).ignoreWhitespace().areIdentical();
    }

}