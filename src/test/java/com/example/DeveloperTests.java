package com.example;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

@QuarkusTest
public class DeveloperTests {
    @Test
    public void testGetAll(){
        given().when()
                .get("/developer").then()
                .statusCode(200)
                .body("size()", is(2));
        given().when()
                .get("/developer/1").then()
                .statusCode(200)
                .body("name", is("Hortelino"));

    }
}
