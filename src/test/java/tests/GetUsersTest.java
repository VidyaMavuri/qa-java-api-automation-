package tests;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GetUsersTest {

    @Test
    void testGetUsers() {
        int statusCode = RestAssured
                .given()
                .when()
                .get("https://reqres.in/api/users?page=2")
                .getStatusCode();

        assertEquals(200, statusCode);
    }
}
