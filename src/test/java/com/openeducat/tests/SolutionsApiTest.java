package com.openeducat.tests;

import com.openeducat.base.BaseTest;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class SolutionsApiTest extends BaseTest {

    @Test
    public void verifySolutionsPage() {

        Response response =
                given()
                .when()
                    .get("/#")
                .then()
                    .statusCode(200)
                    .extract().response();

        String body = response.getBody().asString();

        
        Assert.assertTrue(body.contains("Solutions"));
        Assert.assertTrue(body.contains("University Management"));
        Assert.assertTrue(body.contains("Highschool Management"));
        Assert.assertTrue(body.contains("College Management"));

        
        Assert.assertTrue(body.contains("Boot Camps"));
        Assert.assertTrue(body.contains("Preschool Institutions"));
        Assert.assertTrue(body.contains("K-12 Schools"));
        Assert.assertTrue(body.contains("Faith-Based Schools"));
        Assert.assertTrue(body.contains("Vocational Schools"));
        Assert.assertTrue(body.contains("Music Schools"));
    }
}
