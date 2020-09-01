package Helpers;



import org.json.simple.JSONObject;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;

public class temp {

    String url = "http://localhost:3000/";
    RequestSpecification httpRequest;
    Response response;

    @Test
    public void testing(){
        JSONObject params = new JSONObject();
        params.put("name", "ATeam");
        params.put("email", "ATeam@gmail.com");

        RestAssured.baseURI = url;
        httpRequest = RestAssured.given().auth().preemptive().basic("admin", "admin");
        httpRequest.header("Content-Type", "application/json");

        httpRequest.body(params.toJSONString());
        // DELETE
        response = httpRequest.delete("/api/teams/2");

        // PUT
        // response = httpRequest.put("/api/teams/2");

        // POST
        // response = httpRequest.post("/api/teams");

        // GET
        // response = httpRequest.get("/api/teams/search?perpage=50&page=1");
        System.out.println(response.prettyPrint());
    }
}
