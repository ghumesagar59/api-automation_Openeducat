package com.openeducat.tests;

import com.openeducat.base.BaseTest;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class HomeApiTest extends BaseTest {

    
    @Test (priority = 1)
    public void verifyHomePageURL() {

        given()
        .when()
            .get("/")
        .then()
            .statusCode(200);
    }

   
    @Test (priority = 2)
    public void verifyHomePageMenuItems() {

        Response response =
            given()
            .when()
                .get("/")
            .then()
                .statusCode(200)
                .extract()
                .response();

        String responseBody = response.asString();

       
        org.testng.Assert.assertTrue(responseBody.contains("Home"),
                "Home menu not found");
        org.testng.Assert.assertTrue(responseBody.contains("About"),
                "About menu not found");
        org.testng.Assert.assertTrue(responseBody.contains("Courses"),
                "Courses menu not found");
        org.testng.Assert.assertTrue(responseBody.contains("Contact"),
                "Contact menu not found");
    }

    
    @Test (priority = 3)
    public void verifyHomePageResponseTime() {

        given()
        .when()
            .get("/")
        .then()
            .time(lessThan(3000L));
    }

    
    @Test (priority = 4)
    public void verifyInvalidHomeURL() {

        given()
        .when()
            .get("/invalid-home-url")
        .then()
            .statusCode(404);
    }
}
