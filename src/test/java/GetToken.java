import static io.restassured.RestAssured.*;
import java.io.File;
import java.net.URISyntaxException;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.http.ContentType;

public class GetToken extends Base {
    private static RequestSpecification request;
    private static Response response;

    @Test
    public void postGetToken() throws URISyntaxException {

        File clientFile = new File(getClass().getResource("/ClientCredentials.json").toURI());

        request = given()
                .header("x-rapidapi-key", "a1a2b4eb17msh6a7fed06a8297d5p16dae6jsna5e67b4f306c")
                .header("x-rapidapi-host", "bravenewcoin.p.rapidapi.com")
                .contentType(ContentType.JSON)
                .baseUri("https://bravenewcoin.p.rapidapi.com")
                .basePath("/oauth")
                .log().all();

        response = request
                .given()
                .body(clientFile)
                .when()
                .post("/token")
                .prettyPeek();
        // Verificar que se creo el recurso en el servidor (http code 201)

        // Assert.assertEquals(response.getStatusCode(), 201);

    }

}
