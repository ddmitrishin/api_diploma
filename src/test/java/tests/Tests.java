package tests;

import io.restassured.response.Response;
import models.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static specs.Specs.*;

public class Tests extends TestBase {

    @Test
    @DisplayName("Successful Login")
    void successfulLoginTest() {
        User user = new User();
        user.setEmail("eve.holt@reqres.in");
        user.setPassword("cityslicka");
        String token = "QpwL5tke4Pnpja7X4";

        User responseUser =
                given()
                        .spec(request)
                        .body(user)
                        .when()
                        .post("/login")
                        .then()
                        .spec(response200)
                        .log().body()
                        .extract().as(User.class);

        assertEquals(token, responseUser.getToken());
    }

    @Test
    @DisplayName("Unsuccessful Login")
    void unSuccessfulLoginTest() {
        User user = new User();
        user.setEmail("peter@klaven");
        String message = "Missing password";

        Response response =
                given()
                        .spec(request)
                        .body(user)
                        .when()
                        .post("/login")
                        .then()
                        .spec(response400)
                        .log().body()
                        .extract().response();

        assertEquals(message, response.path("error"));
    }

    @Test
    @DisplayName("Successful Register")
    void successfulRegisterTest() {
        User user = new User();
        user.setEmail("eve.holt@reqres.in");
        user.setPassword("pistol");
        Integer id = 4;
        String token = "QpwL5tke4Pnpja7X4";

        User responseUser =
                given()
                        .spec(request)
                        .body(user)
                        .when()
                        .post("/register")
                        .then()
                        .spec(response200)
                        .log().body()
                        .extract().as(User.class);

        assertEquals(id, responseUser.getId());
        assertEquals(token, responseUser.getToken());
    }

    @Test
    @DisplayName("Unsuccessful Register")
    void unSuccessfulRegisterTest() {
        User user = new User();
        user.setEmail("sydney@fife");
        String message = "Missing password";

        Response response =
                given()
                        .spec(request)
                        .body(user)
                        .when()
                        .post("/register")
                        .then()
                        .spec(response400)
                        .log().body()
                        .extract().response();

        assertEquals(message, response.path("error"));
    }

    @Test
    @DisplayName("Check list resource")
    void listTest() {
        Integer id = 1;
        String name = "cerulean";
        Integer year = 2000;

        Response response =
                given()
                        .spec(request)
                        .when()
                        .get("/unknown")
                        .then()
                        .spec(response200)
                        .log().body()
                        .extract().response();

        assertEquals(id, response.path("data[0].id"));
        assertEquals(name, response.path("data[0].name"));
        assertEquals(year, response.path("data[0].year"));

    }

    @Test
    @DisplayName("Single user not found")
    void singleUserNotFoundTest() {
        String emptyJson = null;

        User responseUser =
                given()
                        .spec(request)
                        .when()
                        .get("/users/23")
                        .then()
                        .spec(response404)
                        .log().body()
                        .extract().as(User.class);

        assertEquals(emptyJson, responseUser.getFirstName());
    }

    @Test
    @DisplayName("Create user")
    void createTest() {
        User user = new User();
        user.setName("Dima");
        user.setJob("QA");

        User responseUser =
                given()
                        .spec(request)
                        .body(user)
                        .when()
                        .post("/users")
                        .then()
                        .spec(response201)
                        .log().body()
                        .extract().as(User.class);

        assertNotEquals(responseUser.getId(), null);
        assertEquals(user.getName(), responseUser.getName());
        assertEquals(user.getJob(), responseUser.getJob());
    }
}
