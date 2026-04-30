package tests;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.*;

public class GetUsersTest {

    @Test
    void testGetUsers() {
        RestAssured
            .given()
            .when()
            .get("https://reqres.in/api/users?page=2")
            .then()
            .statusCode(200)
            .body("data", not(empty()));
    }
}
