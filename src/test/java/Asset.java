import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;
import java.util.ArrayList;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Asset extends Base {
    private static RequestSpecification request;
    private static Response response;

    @Test
    public void getAsset() {

        // Setting up the request and response.

        // obtener colecciones cuando "type" sea "FIAT" y "status" sea "ACTIVE"

        request = given()
                .header("X-RapidAPI-Key", "a1a2b4eb17msh6a7fed06a8297d5p16dae6jsna5e67b4f306c")
                .header("X-RapidAPI-Host", "bravenewcoin.p.rapidapi.com")
                .log().all();

        response = request
                .when()
                .get("/asset?status=ACTIVE&type=FIAT")
                .prettyPeek();

        //ArrayList<String> listFiatAndActive = response.path(("content.name").toString());
        //System.out.println(listFiatAndActive);

    }
}
