package stepdefinitions;

import io.cucumber.java.en.Given;


public class US022_GMIBank_API_StepDefs {

    Response response;

    @Given("user uses api end point {string} to get all customer data")
    public void user_uses_api_end_point_to_get_all_customer_data(String string) {
        response = given().headers("Authorization",
                "Bearer " + bearerToken,
                "Content-Type", ContentType.Json,
                "Accept",
                ContentType.Json)
                .when()
                .get(url)
                .then()
                .contentType(ContentType.Json)
                .extract()
                .response();

    }
    @Given("user should get all customer data and deserialize the data to java")
    public void user_should_get_all_customer_data_and_deserialize_the_data_to_java() {

    }
    @Given("user saves the customer data to correspondent file")
    public void user_saves_the_customer_data_to_correspondent_file() {

    }
    @Then("user needs to validate all customer api data")
    public void user_needs_to_validate_all_customer_api_data() {

    }
}
