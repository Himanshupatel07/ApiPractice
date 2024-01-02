import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class ReqRes {

    public static void main(String[] args) {

        /*Response getMethod= given().get("https://reqres.in/api/users?page=2");
        getMethod.prettyPrint();
        System.out.println(getMethod.time());
        System.out.println(getMethod.statusCode());
        */

        /*String payload="{\n" +
                "    \"name\": \"morpheus\",\n" +
                "    \"job\": \"leader\"\n" +
                "}";


        Response postMethod= given().contentType(ContentType.JSON).body(payload).post("https://reqres.in/api/users");
        postMethod.prettyPrint();
        System.out.println("The response code is "+ postMethod.statusCode());
        System.out.println(("The response time is " + postMethod.time()));*/

        /*String payload="{\n" +
                "    \"name\": \"Himanshu\",\n" +
                "    \"job\": \"QA\"\n" +
                "}";

        Response patchMethod= given().contentType(ContentType.JSON).body(payload).patch("https://reqres.in/api/users/2");
        patchMethod.prettyPrint();
        System.out.println("The response code is " +patchMethod.statusCode());
        System.out.println("The response time is " + patchMethod.time());*/

    String payload="{\n" +
            "    \"name\": \"Himanshu\",\n" +
            "    \"job\": \"QA Leader\"\n" +
            "}";

        Response putMethod=given().contentType(ContentType.JSON).body(payload).put("https://reqres.in/api/users/2");
       // putMethod.prettyPrint();
        System.out.println("The response code is " + putMethod.statusCode());
        System.out.println("The response time is " + putMethod.time());

        Response deleteMethod=given().delete("https://reqres.in/api/users/2");

        System.out.println("The response code is " + deleteMethod.statusCode());
        System.out.println("The response time is " + deleteMethod.time());


    }
}
