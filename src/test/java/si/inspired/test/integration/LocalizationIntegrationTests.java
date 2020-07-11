package si.inspired.test.integration;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import si.inspired.Service;
import si.inspired.spring.TestIntegrationConfig;
import static org.hamcrest.Matchers.containsString;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = { Service.class, TestIntegrationConfig.class }, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class LocalizationIntegrationTests {

    @Value("${local.server.port}")
    int port;

    @Before
    public void init() {
        RestAssured.port = port;
        RestAssured.baseURI = "http://localhost";
    }

    @Test
    public void given_theLanuageParamterIsEnglish_then_the_title_of_the_log_page_expected_Login() {
        final RequestSpecification request = RestAssured.given().param("lang", "en");
        request.when().get("/login").then().assertThat().statusCode(200).and().body(containsString("<h1>Login</h1>"));
    }

}