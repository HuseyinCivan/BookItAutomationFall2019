package com.bookit.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.List;

public class APIStepDefinitions {
    private RequestSpecification requestSpecification;  //this is what we put in given
    private Response response;  //this is where we store response data
    private String token; //this is what we use for authentication
    private JsonPath jsonPath; //this is where we store JSON body
    private ContentType contentType; //this is what we use to setup content type


    @Given("authorization token is provided for {string}")
    public void authorization_token_is_provided_for(String string) {

    }

    @Given("user accepts content type as {string}")
    public void user_accepts_content_type_as(String string) {

    }

    @When("user sends GET request to {string}")
    public void user_sends_GET_request_to(String string) {

    }

    @Then("user should be able to see {int} rooms")
    public void user_should_be_able_to_see_rooms(Integer int1) {

    }

    @Then("user verifies that response status code is {int}")
    public void user_verifies_that_response_status_code_is(Integer int1) {

    }

    @Then("user should be able to see all room names")
    public void user_should_be_able_to_see_all_room_names() {

    }

    @Then("user payload contains following room names:")
    public void user_payload_contains_following_room_names( List<String >dataTable) {

    }

}
