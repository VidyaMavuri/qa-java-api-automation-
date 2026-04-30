package tests;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static io.restassured.http.ContentType.JSON;

public class CreateUserTest {

    @Test
    void testCreateUser() {
        String payload = "{ \"name\": \"Vidya\", \"job\": \"QA Engineer\" }";

        RestAssured
            .given()
            .contentType(JSON)
            .body(payload)
            .when()
            .post("https://reqres.in/api/users")
            .then()
            .statusCode(201);
    }
}
