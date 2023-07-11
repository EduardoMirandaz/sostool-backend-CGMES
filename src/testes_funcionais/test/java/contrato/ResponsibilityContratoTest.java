package contrato;

import client.ResponsibilityClient;
import org.apache.http.HttpStatus;
import org.junit.Test;
import utils.BaseTest;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;


public class ResponsibilityContratoTest extends BaseTest {

    @Test
    public void deveValidarContratoDaRecuperacaoDeResponsabilidades(){

        ResponsibilityClient.recuperarRosponsabilidades(specification)
                .statusCode(HttpStatus.SC_OK)
                .body(matchesJsonSchemaInClasspath
                        ("json_schemas/esquema-de-responsabilidade.json")
                );


    }

}
