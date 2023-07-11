package client;

import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import static io.restassured.RestAssured.given;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ResponsibilityClient {

    public static ValidatableResponse recuperarRosponsabilidades(RequestSpecification specification){

        return given()
                .spec(specification)
                .when()
                .get("/model-responsibility")
                .then();


    }

}
