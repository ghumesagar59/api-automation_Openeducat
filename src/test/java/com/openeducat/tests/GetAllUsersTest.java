package com.openeducat.tests;

import com.openeducat.base.BaseTest;
import com.openeducat.endpoints.UserEndpoints;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class GetAllUsersTest extends BaseTest {

    @Test
    public void getAllUsersTest() {

        given()
        .when()
            .get(UserEndpoints.LIST_USERS)
        .then()
            .statusCode(200);
    }
}
