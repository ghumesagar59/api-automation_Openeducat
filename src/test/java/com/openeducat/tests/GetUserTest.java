package com.openeducat.tests;

import com.openeducat.base.BaseTest;
import com.openeducat.endpoints.UserEndpoints;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GetUserTest extends BaseTest {

    @Test
    public void getUserTest() {

        given()
            .pathParam("id", 1)
        .when()
            .get(UserEndpoints.GET_USER)
        .then()
            .statusCode(200)
            .body("id", equalTo(1));
    }
}
