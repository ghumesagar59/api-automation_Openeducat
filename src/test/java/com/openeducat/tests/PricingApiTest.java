package com.openeducat.tests;

import com.openeducat.base.BaseTest;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PricingApiTest extends BaseTest {

    @Test
    public void verifyPricingPage() {

        Response response =
                given()
                .when()
                    .get("/pricing")
                .then()
                    .statusCode(200)
                    .extract().response();

        String body = response.getBody().asString();

        
        Assert.assertTrue(body.contains("OpenEduCat Pricing"));
        Assert.assertTrue(body.contains("On Cloud"));
        Assert.assertTrue(body.contains("On Premise"));
        Assert.assertTrue(body.contains("We Host"));
        Assert.assertTrue(body.contains("You Host"));
    }
}
