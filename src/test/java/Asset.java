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
        // assetId ? = un ejemplo f1ff77b6-3ab4-4719-9ded-2fc7e71cff1f
        // Setting up the request and response.
        request = given()
                .header("X-RapidAPI-Key", "a1a2b4eb17msh6a7fed06a8297d5p16dae6jsna5e67b4f306c")
                .header("X-RapidAPI-Host", "bravenewcoin.p.rapidapi.com")
                .baseUri("https://bravenewcoin.p.rapidapi.com")
                .basePath("/asset?status=ACTIVE")
                .log().all();

        response = request
                .when()
                .get("/asset?status=ACTIVE")
                .prettyPeek();

        // obtener colecciones cuyo "type" sea "FIAT"

        ArrayList<String> typeList = response.path("content.type");
        System.out.println(typeList);

    }
}
