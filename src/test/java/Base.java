import org.testng.annotations.BeforeClass;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class Base {

  @BeforeClass
  public static void setUpRestAsurred() {

    // Setting the base URI and base path for the API.
    RestAssured.baseURI = "https://bravenewcoin.p.rapidapi.com";
    RequestSpecification requestSpecification = new RequestSpecBuilder()
        .addHeader("ContentType", ContentType.JSON.toString())
        .addHeader("Accept", ContentType.JSON.toString())
        .build();

    RestAssured.requestSpecification = requestSpecification;

  }

}

/*
 * Probar la clase Base solo con la baseURI, agregar la basePath en la clase que
 * sea manualmente.
 * 
 * Probar la clase Base sin baseURI y basePath, agregarla en la clase que sea
 * necesaria manualmente.
 */
