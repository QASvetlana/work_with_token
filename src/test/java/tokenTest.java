import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;


public class tokenTest {
    @Test
    public void testRestAssured() throws InterruptedException {


        Response response = RestAssured
                .given()
                .get("https://playground.learnqa.ru/ajax/api/longtime_job")
                .andReturn();

        response.prettyPrint();


        Response response1 = RestAssured
                .given()
                .queryParams("token", "AMzoDMxoDOwAiMw0SMx0iMyAjM")
                .queryParams("seconds", 18)
                .get("https://playground.learnqa.ru/ajax/api/longtime_job")
                .andReturn();

        response1.prettyPrint();


        Response response2 = RestAssured
                .given()
                .queryParams("token", "AMzoDMxoDOwAiMw0SMx0iMyAjM")
                .queryParams("seconds", 18)
                .get("https://playground.learnqa.ru/ajax/api/longtime_job")
                .andReturn();
        Thread.sleep(1000);
        response2.prettyPrint();


    }
}


