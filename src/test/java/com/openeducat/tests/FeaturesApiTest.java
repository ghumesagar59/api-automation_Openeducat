package com.openeducat.tests;

import com.openeducat.base.BaseTest;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class FeaturesApiTest extends BaseTest {

   
    @Test
    public void verifyFeaturesPageURL() {

        given()
        .when()
            .get("/features")
        .then()
            .statusCode(200);
    }

    @Test
    public void verifyFeaturesSections() {

        Response response =
            given()
            .when()
                .get("/features")
            .then()
                .statusCode(200)
                .extract()
                .response();

        String responseBody = response.asString();

        
        Assert.assertTrue(responseBody.contains("Core"), "Core section missing");
        Assert.assertTrue(responseBody.contains("Essential"), "Essential section missing");
        Assert.assertTrue(responseBody.contains("Advance"), "Advance section missing");
        Assert.assertTrue(responseBody.contains("ERP"), "ERP section missing");
        Assert.assertTrue(responseBody.contains("Management"), "Management section missing");
        Assert.assertTrue(responseBody.contains("Communicate"), "Communicate section missing");
        Assert.assertTrue(responseBody.contains("Technical"), "Technical section missing");
        Assert.assertTrue(responseBody.contains("Integrations"), "Integrations section missing");
        Assert.assertTrue(responseBody.contains("LMS"), "LMS section missing");

      
    }

    @Test
    public void verifyFeaturesPageResponseTime() {

        given()
        .when()
            .get("/features")
        .then()
            .time(lessThan(3000L));
    }

    @Test
    public void verifyInvalidFeaturesURL() {

        given()
        .when()
            .get("/features-invalid")
        .then()
            .statusCode(404);
    }
}
