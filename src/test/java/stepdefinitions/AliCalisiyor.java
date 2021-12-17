package stepdefinitions;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.US022_States;
import utilities.Authentication;
import utilities.ConfigReader;
import utilities.ReadTxt;
import utilities.WriteToTxt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class AliCalisiyor {
    Response response;
    //String bearerToken = ConfigReader.getProperty("api_bearer_token");
    US022_States[] states22;
    String fileName22 = ConfigReader.getProperty("fileNameOfStates");


    @Given("user uses api end point {string}")
    public void user_uses_api_end_point_to_get_all_states_data(String url, String id, String name) {
    Map<String, Object> expectedData = new HashMap<>();

        response = given().headers("Authorization",
                "Bearer " + Authentication.generateToken(),
                "Content-Type", ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .body()
                .when()
                .get(url)
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();
        //response.prettyPrint();

    }
    @Given("user should get all states data and deserialize the data to java")
    public void user_should_get_all_states_data_and_deserialize_the_data_to_java() throws JsonProcessingException {

        ObjectMapper obj = new ObjectMapper();
        states22 = obj.readValue(response.asString(),US022_States[].class);

        for (int i =0; i<states22.length; i++){

            if(states22[i].getName() !=null) {
                System.out.println(states22[i].getName());
                //System.out.println(states22[i].getId());
            }

        }

    }
    @Given("user saves the states data to correspondent file")
    public void user_saves_the_states_data_to_correspondent_file() {

        WriteToTxt.saveAllStates022("fileName22", states22);

    }
    @Then("user needs to validate all states api data")
    public void user_needs_to_validate_all_states_api_data() {

        List<String> expectedStates = new ArrayList<>();
        expectedStates.add("Virginia");
        expectedStates.add("Texas");
        expectedStates.add("Dallas");
        expectedStates.add("FRANKFURT");
        expectedStates.add("Denizli");
        expectedStates.add("British Columbia");
        //expectedStates.add(fileName22);
        System.out.println("Eklediklerim ========= "+expectedStates);

        List<String> actualStates = ReadTxt.returnAllStates3(fileName22);
        Assert.assertTrue(actualStates.equals(expectedStates));
        //System.out.println(actualStates);

    }
}
