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
                .pathParam("id",petId)
                .when()
                .get("/pets/{id}");
    }



}
