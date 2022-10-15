import io.restassured.specification.*;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetDailyOHLCV extends Base {
    private static RequestSpecification request;
    private static Response response;

    // CREO que no se puede obtener el dailyohlcv porque no estoy subscrito

    @Test
    public void getDailyOHLCV() {

        request = given()
                .header("Authorization",
                        "Bearer eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCIsImtpZCI6Ik5EVXhNRGhHT0VReE56STVOelJCTTBJM1FrUTVOa0l4TWtRd1FrSTJSalJFTVRaR1F6QTBOZyJ9.eyJpc3MiOiJodHRwczovL2F1dGguYnJhdmVuZXdjb2luLmNvbS8iLCJzdWIiOiJvQ2RRb1pvSTk2RVJFOUhZM3NRN0ptYkFDZkJmNTVSWUBjbGllbnRzIiwiYXVkIjoiaHR0cHM6Ly9hcGkuYnJhdmVuZXdjb2luLmNvbSIsImlhdCI6MTY2NTQxNTAyOSwiZXhwIjoxNjY1NTAxNDI5LCJhenAiOiJvQ2RRb1pvSTk2RVJFOUhZM3NRN0ptYkFDZkJmNTVSWSIsInNjb3BlIjoicmVhZDppbmRleC10aWNrZXIgcmVhZDpyYW5raW5nIHJlYWQ6bXdhIHJlYWQ6Z3dhIHJlYWQ6YWdncmVnYXRlcyByZWFkOm1hcmtldCByZWFkOmFzc2V0IHJlYWQ6b2hsY3YgcmVhZDptYXJrZXQtY2FwIiwiZ3R5IjoiY2xpZW50LWNyZWRlbnRpYWxzIn0.Qe3TlOTL4m4r6HcB9zQxTY8dd8PGZ3duEyakmMo1Bi_aSCFKC4tjcemo2ic1CANxickoOZhdypHv-2V2uFG17t142SDfB6CWLhK0OHycvMpFMNYYNXbNlh6V5dE1TUSHklK1aQ5ugsOqPuZkeOO38Oi02JRcE4Q7JeII5yoUoZhrfYrgkjVnXVW7CvhUvJ3FALOqqVqYsKCMFeyDETfSYuVkWa6MtZd-b98BEj5ciNtPUuagVZF92jlL7LtAXd3RJQPSmohi21FWKZ0cOLlOR2HMOL2o5F4vBH8I1k8g84TxGJNid4vnI-htLleadXL4mRUzq3ScNHbEDVMgirmGzg")
                .header("X-RapidAPI-Key", "a1a2b4eb17msh6a7fed06a8297d5p16dae6jsna5e67b4f306c")
                .header("X-RapidAPI-Host", "bravenewcoin.p.rapidapi.com")
                .contentType(ContentType.JSON)
                .baseUri("https://bravenewcoin.p.rapidapi.com")
                .basePath("/ohlcv?size=10")
                .log().all();

        response = request
                .when()
                .get("/ohlcv?size=10")
                .prettyPeek();

    }
}
