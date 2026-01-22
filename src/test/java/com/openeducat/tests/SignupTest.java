
package com.openeducat.tests;

import com.openeducat.base.BaseTest;
import com.openeducat.endpoints.SignupEndpoints;
import com.openeducat.payload.SignupPayload;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class SignupTest extends BaseTest {
    @Test
    public void signupWithValidData() {
        given()
            .contentType("application/json")
            .body(SignupPayload.validSignupPayload())
        .when()
            .post(SignupEndpoints.SIGNUP)
        .then()
            .statusCode(anyOf(is(200), is(201)));
    }
}
