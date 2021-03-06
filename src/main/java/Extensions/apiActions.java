package Extensions;

import Utilities.commonOps;
import io.qameta.allure.Step;
import io.restassured.response.Response;
import org.json.simple.JSONObject;

public class apiActions extends commonOps {

    @Step("Get data from server")
    public static Response get(String paramValues) {
        response = httpRequest.get(paramValues);
        System.out.println(response.prettyPrint());
        return response;
    }
    @Step("Extract value from JSON format")
    public static String extractFromJSON(Response response, String path){
        jp = response.jsonPath();
        return jp.get(path).toString();
    }

    @Step("Post data to server")
    public static void post(JSONObject params, String resource){
        httpRequest.header("Content-Type", "application/json");
        httpRequest.body(params.toJSONString());
        response = httpRequest.post(resource);
        System.out.println(response.prettyPrint());
    }

    @Step("Update data to server")
    public static void put(JSONObject params, String resource){
        httpRequest.header("Content-Type", "application/json");
        httpRequest.body(params.toJSONString());
        response = httpRequest.put(resource);
        System.out.println(response.prettyPrint());
    }

    @Step("Delete data from server")
    public static void delete(String id){
        response = httpRequest.delete("/api/teams/" + id);
        System.out.println(response.prettyPrint());
    }
}
