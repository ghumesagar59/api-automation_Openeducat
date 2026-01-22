package com.openeducat.payload;

public class UserPayload {

    public static String createUser() {
        return "{"
                + "\"name\":\"Test User\","
                + "\"email\":\"ghumesagar02@gmail.com\","
                + "\"password\":\"Pass@123\","
                + "\"role\":\"student\""
                + "}";
    }

    public static String updateUser() {
        return "{"
                + "\"name\":\"Updated User\","
                + "\"role\":\"admin\""
                + "}";
    }
}
