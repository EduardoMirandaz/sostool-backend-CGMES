package client;

import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import static io.restassured.RestAssured.given;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ModelRoleClient {

    public static ValidatableResponse recuperarCargos(RequestSpecification specification){

        return given()
                .spec(specification)
                .when()
                .get("/modelrole")
                .then();


    }

}
