
import org.testng.annotations.BeforeClass;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class Base {

  // Me parece que hacer esto es la mejor opcion cuando tengo un endpoint en comun
  // para hacerlo
  // mas rapido. el endpoint en comun aca es "api"
  // por ejemplo: https://bravenewcoin.p.rapidapi.com/api/...
  @BeforeClass
  public static void setUpRestAsurred() {

    // Setting the base URI and base path for the API.
    RestAssured.baseURI = "https://bravenewcoin.p.rapidapi.com";
    // RestAssured.basePath = "/oauth";
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
 * rta:funciona y me parece mas adecuado
 * ------------
 * Probar la clase Base sin baseURI y basePath, agregarla en la clase que sea
 * necesaria manualmente.
 * rta: tambien se puede
 */
