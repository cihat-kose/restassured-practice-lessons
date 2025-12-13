package stepDefinitions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import pages.APIPage;

import static org.hamcrest.Matchers.equalTo;

public class PetstoreAPISteps {

    private final APIPage apiPage= new APIPage();
    private Response response;
    private int petID;

    // Corresponds to: "Given I have the pet ID {int}"
    // Step: Sends a GET request to retrieve the pet with the given ID.
    @Given("I have the pet ID {int}")
    public void ıHaveThePetID(int petID) {
        this.petID = petID;
        response = apiPage.getPetById(petID);
    }

    // Corresponds to: "Then I should receive a {int} status code"
    // Step: Verifies if the returned status code matches the expected value.
    @Then("I should receive a {int} status code")
    public void ıShouldReceiveAStatusCode(int expectedStatusCode) {
        response.then().statusCode(expectedStatusCode);
    }

    // Corresponds to: "And the response should contain the pet ID {int}"
    // Step: Verifies if the pet ID in the API response is correct.
    @And("The response should contain the pet ID {int}")
    public void theResponseShouldContainThePetID(int petID) {
        response.then().body("id",equalTo(petID));
    }

    // Corresponds to: "Given I have an existing pet with ID {int} and status {string}"
    // Step: Creates a pet with the specified status so it can be updated later.
    @Given("I have a new pet with ID {int} and name {string}")
    public void ıHaveANewPetWithIDAndName(int id, String status) {
        this.petID = id;
        response = apiPage.addNewPet(id,"Buddy",status);
    }

    // Corresponds to: "And the response should contain the name {string}"
    // Step: Verifies if the name in the API response is correct.
    @And("The response should contain the name {string}")
    public void theResponseShouldContainTheName(String name) {
        response.then().body("name",equalTo(name));
    }

    // Corresponds to: "Given I have an existing pet with ID {int} and status {string}"
    // Step: Creates a pet with the specified status so it can be updated later.
    @Given("I have an existing pet with ID {int} and status {string}")
    public void ıHaveAnExistingPetWithIDAndStatus(int id, String status) {
        this.petID = id;
        response = apiPage.addNewPet(id,"Buddy",status);
    }

    // Corresponds to: "When I update the pet status to {string}"
    // Step: Sends a PUT request to update the pet's status with a new value.
    @When("I update the pet status to {string}")
    public void ıUpdateThePetStatusTo(String newStatus) {
        response = apiPage.updatePetStatus(petID,newStatus);
    }

    // Corresponds to: "And the response should contain the status {string}"
    // Step: Verifies if the status in the API response is correct.
    @And("The response should contain the status {string}")
    public void theResponseShouldContainTheStatus(String status) {
        response.then().body("status",equalTo(status));
    }

    // Corresponds to: "When I delete the pet by ID {int}"
    // Step: Sends a DELETE request to remove the pet with the given ID.
    @When("I delete the pet by ID {int}")
    public void ıDeleteThePetByID(int petID) {
        response = apiPage.deletePetById(petID);
    }

    // Corresponds to: "And the response should contain the message {string}"
    // Step: Verifies if the message in the API response is correct (usually after delete operations).
    @And("The response should contain the message {string}")
    public void theResponseShouldContainTheMessage(String message) {
        response.then().body("message",equalTo(message));
    }
}
