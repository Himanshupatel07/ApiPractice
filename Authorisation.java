import io.restassured.http.ContentType;
import io.restassured.response.Response;
import junit.framework.Assert;
import org.hamcrest.Matchers;

import static io.restassured.RestAssured.given;

public class Authorisation {
    public static void main(String[] args) {

        String payload = "{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"}";

        // Perform authentication and get the token
        Response authMethod = given().contentType(ContentType.JSON).body(payload).post("https://restful-booker.herokuapp.com/auth");
        System.out.println("Authentication Response: " + authMethod.asString());
//       Assert.assertEquals("Authentication failed. Status code not as expected.", 401, authMethod.statusCode());
         Assert.assertEquals(authMethod.statusCode(), 200);

        // Extract the token from the response body
        String token = authMethod.jsonPath().get("token");

        // Use the token for subsequent requests                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           `
        Response order = given().header("Authorization", "Bearer c6f07adb55e4306 " + token).get("https://restful-booker.herokuapp.com/auth");
        System.out.println(order);
        Assert.assertEquals(order.statusCode(),200);

    }
}


