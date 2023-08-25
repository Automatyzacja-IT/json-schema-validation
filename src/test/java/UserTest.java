import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.when;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class UserTest {

    @Test
    public void getUserTest() {
        when().
                get("https://reqres.in/api/users/2").
                then().
                body(matchesJsonSchemaInClasspath("user.json")).
                statusCode(200).
                log().all();
    }

}