package pages;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class APIPage {
    private final String baseUri = "https://petstore.swagger.io/v2";

    public APIPage() {
        RestAssured.baseURI = baseUri;
    }

    // GET request: Fetch a specific pet by ID
    public Response getPetById(int petId) {
        return given()
                .pathParam("id", petId)
                .when()
                .get("/pet/{id}");
    }

    // POST request: Add a new pet
    public Response addNewPet(int id, String name, String status) {
        String requestBody = """
            {
                "id": %s,
                "category": {"id": 1, "name": "Dogs"},
                "name": "%s",
                "photoUrls": ["string"],
                "tags": [{"id": 1, "name": "friendly"}],
                "status": "%s"
            }
            """.formatted(id, name, status);

        return given()
                .header("Content-Type", "application/json")
                .body(requestBody)
                .when()
                .post("/pet");
    }

    // PUT request: Update an existing pet
    public Response updatePetStatus(int id, String newStatus) {
        String requestBody = """
            {
                "id": %s,
                "category": {"id": 1, "name": "Dogs"},
                "name": "Buddy",
                "photoUrls": ["string"],
                "tags": [{"id": 1, "name": "trained"}],
                "status": "%s"
            }
            """.formatted(id, newStatus);

        return given()
                .header("Content-Type", "application/json")
                .body(requestBody)
                .when()
                .put("/pet");
    }

    // DELETE request: Delete a specific pet by ID
    public Response deletePetById(int petId) {
        return given()
                .pathParam("id", petId)
                .when()
                .delete("/pet/{id}");
    }
}
