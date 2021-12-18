package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import utilities.ConfigReader;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class US026_CountryUpdate {
    Response responsePut;
    String token = ConfigReader.getProperty("api_bearer_token");
    Map<String, Object> putBody;

    @Given("Use api end point  {string}")
    public void use_api_end_point(String url) {
        Response response = given().
                accept(ContentType.JSON).
                auth().
                oauth2(token).
                when().
                get(url);

        response.prettyPrint();

    }

    @Given("User send a Put request endpoint {string} and update countries using {string} and {string}")
    public void user_send_a_put_request_endpoint_and_update_countries_using_and(String url, String id, String name) {
        putBody = new HashMap<>();
        putBody.put("id", id);
        putBody.put("name", name);
        putBody.put("states",null);

         responsePut = given().
                contentType(ContentType.JSON).
                auth().oauth2(token).
                body(putBody).
                when().
                put(url);

        responsePut.prettyPrint();
        responsePut.
                then().
                assertThat().
                statusCode(200).
                contentType(ContentType.JSON);

    }
    @Then("User verify the country was updated")
    public void user_verify_the_country_was_updated() {
        JsonPath jsonPath = responsePut.jsonPath();
        Assert.assertEquals(putBody.get("name"),jsonPath.getString("name"));



    }

}
