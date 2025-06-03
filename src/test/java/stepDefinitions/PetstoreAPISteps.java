package stepDefinitions;

import io.restassured.response.Response;
import io.cucumber.java.en.*;
import pages.APIPage;

import static org.hamcrest.Matchers.equalTo;

public class PetstoreAPISteps {

    private APIPage apiPage = new APIPage();
    private Response response;

    // Corresponds to: "Given I have the pet ID {int}"
    // Step: Sends a GET request to retrieve the pet with the given ID.
    @Given("I have the pet ID {int}")
    public void i_have_the_pet_ID(int petId) {
        response = apiPage.getPetById(petId);
    }

    // Corresponds to: "Given I have a new pet with ID {int} and name {string}"
    // Step: Sends a POST request to create a new pet with the given ID and name.
    @Given("I have a new pet with ID {int} and name {string}")
    public void i_have_a_new_pet_with_ID_and_name(int id, String name) {
        response = apiPage.addNewPet(id, name, "available");
    }

    // Corresponds to: "Given I have an existing pet with ID {int} and status {string}"
    // Step: Prepares data to update the status of an existing pet.
    @Given("I have an existing pet with ID {int} and status {string}")
    public void i_have_an_existing_pet_with_ID_and_status(int id, String status) {
        response = apiPage.updatePetStatus(id, status);
    }

    // Corresponds to: "When I update the pet status to {string}"
    // Step: Sends a PUT request to update the pet's status with a new value.
    @When("I update the pet status to {string}")
    public void i_update_the_pet_status_to(String newStatus) {
        response = apiPage.updatePetStatus(100, newStatus);
    }

    // Corresponds to: "When I delete the pet by ID {int}"
    // Step: Sends a DELETE request to remove the pet with the given ID.
    @When("I delete the pet by ID {int}")
    public void i_delete_the_pet_by_ID(int petId) {
        response = apiPage.deletePetById(petId);
    }

    // Corresponds to: "Then I should receive a {int} status code"
    // Step: Verifies if the returned status code matches the expected value.
    @Then("I should receive a {int} status code")
    public void i_should_receive_a_status_code(int expectedStatusCode) {
        response.then().statusCode(expectedStatusCode);
    }

    // Corresponds to: "And the response should contain the pet ID {int}"
    // Step: Verifies if the pet ID in the API response is correct.
    @Then("the response should contain the pet ID {int}")
    public void the_response_should_contain_the_pet_ID(int petId) {
        response.then().body("id", equalTo(petId));
    }

    // Corresponds to: "And the response should contain the name {string}"
    // Step: Verifies if the name in the API response is correct.
    @Then("the response should contain the name {string}")
    public void the_response_should_contain_the_name(String name) {
        response.then().body("name", equalTo(name));
    }

    // Corresponds to: "And the response should contain the status {string}"
    // Step: Verifies if the status in the API response is correct.
    @Then("the response should contain the status {string}")
    public void the_response_should_contain_the_status(String status) {
        response.then().body("status", equalTo(status));
    }

    // Corresponds to: "And the response should contain the message {string}"
    // Step: Verifies if the message in the API response is correct (usually after delete operations).
    @Then("the response should contain the message {string}")
    public void the_response_should_contain_the_message(String message) {
        response.then().body("message", equalTo(message));
    }
}
