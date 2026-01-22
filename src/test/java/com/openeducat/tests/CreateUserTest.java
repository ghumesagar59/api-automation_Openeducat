package com.openeducat.tests;

import com.openeducat.base.BaseTest;
import com.openeducat.endpoints.UserEndpoints;
import com.openeducat.payload.UserPayload;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class CreateUserTest extends BaseTest {

    @Test
    public void createUserTest() {

        given()
            .contentType("application/json")
            .body(UserPayload.createUser())
        .when()
            .post(UserEndpoints.CREATE_USER)
        .then()
            .statusCode(anyOf(is(200), is(201)))
            .body("id", notNullValue());
    }
}
