package com.openeducat.tests;

import com.openeducat.base.BaseTest;
import com.openeducat.endpoints.UserEndpoints;
import com.openeducat.payload.UserPayload;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class UpdateUserTest extends BaseTest {

    @Test
    public void updateUserTest() {

        given()
            .contentType("application/json")
            .pathParam("id", 1)
            .body(UserPayload.updateUser())
        .when()
            .put(UserEndpoints.UPDATE_USER)
        .then()
            .statusCode(200)
            .body("name", equalTo("Updated User"));
    }
}
