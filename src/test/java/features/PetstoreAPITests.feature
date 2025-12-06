Feature: Petstore API Tests

  Scenario: Get Pet by ID
    Given I have the pet ID 2
    Then I should receive a 200 status code
    And The response should contain the pet ID 2

  Scenario: Add new Pet
    Given I have a new pet with ID 100 and name "Buddy"
    Then I should receive a 200 status code
    And The response should contain the name "Buddy"

  Scenario: Update Pet Info
    Given I have an existing pet with ID 100 and status "avaliable"
    When I update the pet status to "sold"
    Then I should receive a 200 status code
    And The response should contain the status "sold"

  Scenario: Delete Pet by ID
    Given I have the pet ID 100
    When I delete the pet by ID 100
    Then I should receive a 200 status code
    And The response should contain the message "100"



