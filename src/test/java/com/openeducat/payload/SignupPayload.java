
package com.openeducat.payload;

public class SignupPayload {
    public static String validSignupPayload() {
        return "{\"name\":\"Test User\"," +
               "\"organization_name\":\"Demo Org\"," +
               "\"email\":\"ghumesagar01@gmail.com\"," +
               "\"phone\":\"9284340700\"," +
               "\"password\":\"Pass@123\"," +
               "\"confirm_password\":\"Pass@123\"," +
               "\"country\":\"India\"}";
    }
}
