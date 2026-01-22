package com.openeducat.tests;

import com.openeducat.base.BaseTest;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class DemoApiTest extends BaseTest {

    @Test
    public void verifyDemoPage() {

        Response response =
                given()
                .when()
                    .get("/demo")
                .then()
                    .statusCode(200)
                    .extract().response();

        String body = response.getBody().asString();

        
        Assert.assertTrue(body.contains("Get started with a OpenEduCat Demo"));
        Assert.assertTrue(body.contains("Try it Now"));
        Assert.assertTrue(body.contains("Schedule a Demo"));
        Assert.assertTrue(body.contains("Version"));
    }
}
