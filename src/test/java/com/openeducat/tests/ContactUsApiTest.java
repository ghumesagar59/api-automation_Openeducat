package com.openeducat.tests;

import com.openeducat.base.BaseTest;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ContactUsApiTest extends BaseTest {

    @Test
    public void verifyContactUsPage() {

        Response response =
                given()
                .when()
                    .get("/contactus")
                .then()
                    .statusCode(200)
                    .extract().response();

        String body = response.getBody().asString();

       
        Assert.assertTrue(body.contains("Contact Us"));

       
        Assert.assertTrue(body.contains("Your Name"));
        Assert.assertTrue(body.contains("Phone Number"));
        Assert.assertTrue(body.contains("Email"));
        Assert.assertTrue(body.contains("Message"));
        Assert.assertTrue(body.contains("Your Company"));
        Assert.assertTrue(body.contains("Subject"));
        Assert.assertTrue(body.contains("Your Question"));
        Assert.assertTrue(body.contains("Submit"));
      
    }
}
