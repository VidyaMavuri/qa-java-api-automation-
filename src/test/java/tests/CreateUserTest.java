package tests;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static io.restassured.http.ContentType.JSON;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CreateUserTest {

    @Test
    void testCreateUser() {
        String payload = "{ \"name\": \"Vidya\", \"job\": \"QA Engineer\" }";

        int statusCode = RestAssured
                .given()
                .contentType(JSON)
                .body(payload)
                .when()
                .post("https://reqres.in/api/users")
                .getStatusCode();

        // Accept both valid success codes
        assertTrue(statusCode == 200 || statusCode == 201);
    }
}
