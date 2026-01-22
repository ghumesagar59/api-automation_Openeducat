package com.openeducat.tests;

import com.openeducat.base.BaseTest;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ResourcesApiTest extends BaseTest {

    @Test
    public void verifyResourcesMenu() {

        Response response =
                given()
                .when()
                    .get("/")
                .then()
                    .statusCode(200)
                    .extract().response();

        String body = response.getBody().asString();

       
        Assert.assertTrue(body.contains("Learn"));
        Assert.assertTrue(body.contains("Forum"));
        Assert.assertTrue(body.contains("Blog"));
        Assert.assertTrue(body.contains("Downloads"));
        Assert.assertTrue(body.contains("Support"));
        Assert.assertTrue(body.contains("Compare"));
    }
}
