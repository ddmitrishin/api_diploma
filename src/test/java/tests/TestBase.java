package tests;

import com.codeborne.selenide.Configuration;
import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;

import static helpers.CustomApiListener.withCustomTemplates;

public class TestBase {
    @BeforeAll
    public static void setup() {
        RestAssured.filters(withCustomTemplates());
        RestAssured.baseURI = "https://reqres.in/";
        Configuration.baseUrl = "https://reqres.in/";
    }
}
