package stepdefinitions;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.Customer9;
import pojos.US022_States;
import utilities.ConfigReader;
import io.restassured.*;
import utilities.WriteToTxt;

import static io.restassured.RestAssured.*;

public class CustomerAPI9StepDefs {

    Response response;
//navigate to gmi bank>>login as admin>> gight click >>inspect>>Application(7th in the line of Elements)
// Left side select Session Storage>> copy the token value
//paste the token into api_bearer_token in configuration.properties
//either automate this or manually change. Otherwise we get 401 error.

String bearerToken = ConfigReader.getProperty("api_bearer_token");

US022_States[] customers;

    @Given("user uses api end point {string} to get all customers")
    public void user_uses_api_end_point_to_get_all_customers(String url) {
    response = given().headers(
            "Authorization",
                    "Bearer "+ bearerToken,
                    "Content-Type",
                    io.restassured.http.ContentType.JSON, "Accept", ContentType.JSON)
            .when().get(url)
            .then()
            .contentType(ContentType.JSON)
            .extract()
            .response();

        response.prettyPrint();

    }
    @Given("user should get all customer data and deserialize data to java")
    public void user_should_get_all_customer_data_and_deserialize_data_to_java() throws JsonProcessingException {
        ObjectMapper obj = new ObjectMapper();
        customers = obj.readValue(response.asString(),US022_States[].class);



    }
    @Given("user saves the customer data to correspondent files")
    public void user_saves_the_customer_data_to_correspondent_files() {
        WriteToTxt.saveAllStates("fileName",customers);

    }
    @Then("user needs to validate all customer api data")
    public void user_needs_to_validate_all_customer_api_data() {

    }



}
