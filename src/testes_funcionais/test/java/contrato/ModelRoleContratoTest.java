package contrato;


import client.ModelRoleClient;
import org.apache.http.HttpStatus;
import org.junit.Test;
import utils.BaseTest;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;


public class ModelRoleContratoTest extends BaseTest {

    @Test
    public void deveValidarContratoDaRecuperacaoDeCargos(){

        ModelRoleClient.recuperarCargos(specification)
                .statusCode(HttpStatus.SC_OK)
                .body(matchesJsonSchemaInClasspath
                        ("json_schemas/esquema-de-cargos.json")
                );

    }

}
