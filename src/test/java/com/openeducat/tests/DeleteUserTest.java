package com.openeducat.tests;

import com.openeducat.base.BaseTest;
import com.openeducat.endpoints.UserEndpoints;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class DeleteUserTest extends BaseTest {

    @Test
    public void deleteUserTest() {

        given()
            .pathParam("id", 1)
        .when()
            .delete(UserEndpoints.DELETE_USER)
        .then()
        	.statusCode(200)
        	.log().all();
    }
}
