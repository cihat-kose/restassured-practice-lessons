package stepDefinitions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PetstoreAPISteps {
    @Given("I have the pet ID {int}")
    public void ıHaveThePetID(int arg0) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("I should receive a {int} status code")
    public void ıShouldReceiveAStatusCode(int arg0) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("The response should contain the pet ID {int}")
    public void theResponseShouldContainThePetID(int arg0) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("I have a new pet with ID {int} and name {string}")
    public void ıHaveANewPetWithIDAndName(int arg0, String arg1) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("The response should contain the name {string}")
    public void theResponseShouldContainTheName(String arg0) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("I have an existing pet with ID {int} and status {string}")
    public void ıHaveAnExistingPetWithIDAndStatus(int arg0, String arg1) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("I update the pet status to {string}")
    public void ıUpdateThePetStatusTo(String arg0) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("The response should contain the status {string}")
    public void theResponseShouldContainTheStatus(String arg0) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("I delete the pet by ID {int}")
    public void ıDeleteThePetByID(int arg0) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("The response should contain the message {string}")
    public void theResponseShouldContainTheMessage(String arg0) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
