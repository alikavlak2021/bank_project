
package utilities;public class Authentication {
}

package utilities;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.*;

import java.util.HashMap;
import java.util.Map;

public class Authentication {

    public static String generateToken(){
        String username = "CWoburn";
        String password = "Cw192837?";
        Map<String, Object> map = new HashMap<>();
        map.put("username", username);
        map.put("password",password);
        map.put("rememberme","true");
        String endPoint = "https://www.gmibank.com/api/authenticate";//we ned to generate a new token
        Response response1 = RestAssured.given().contentType(ContentType.JSON).body(map).when().post(endPoint);
        JsonPath token = response1.jsonPath();
        return token.getString("id_token");
    }
}

