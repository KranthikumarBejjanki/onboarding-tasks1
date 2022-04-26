package com.restapiautomation.task;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.core.IsEqual.equalTo;

public class RestAssuredAPITesting {

  @BeforeClass
  public void setUp() {
    RestAssured.baseURI = "https://reqres.in";
    RestAssured.basePath = "/api";

    RestAssured.requestSpecification =
        new RequestSpecBuilder().setContentType("application/json").build();
    responseSpecification = new ResponseSpecBuilder().expectContentType("application/json").build();
  }

  @Test
  public void verifyGetRequest() {
    Response response =
        get("/users/2")
            .then()
            .assertThat()
            .statusCode(200)
            .spec(responseSpecification)
            .body("data.first_name", equalTo("Janet"))
            .body("data.last_name", equalTo("Weaver"))
            .body("data.email", equalTo("janet.weaver@reqres.in"))
            .extract()
            .response();
    String text = response.path("support.text").toString();
    System.out.println(text);
  }

  @Test
  public void verifyGetListUsers() {
    Response response =
        given()
            .queryParam("page", "2")
            .get("/users")
            .then()
            .assertThat()
            .statusCode(200)
            .spec(responseSpecification)
            .extract()
            .response();

    String pageNumber = response.path("page").toString();
    System.out.println(pageNumber);
    String data = response.path("data").toString();
    System.out.println(data);
  }

  @Test
  public void verifyPostRequest() {
    Response response =
        given()
            .body("{\"name\":\"morpheus\",\"job\":\"leader\"}")
            .when()
            .post("/users")
            .then()
            .assertThat()
            .statusCode(201)
            .spec(responseSpecification)
            .extract()
            .response();

    String id = response.path("id");
    System.out.println("Created User id is: " + id);
    String createdDate = response.path("createdAt");
    System.out.println("User Created date is: " + createdDate);
  }

  @Test
  public void verifyPutRequest() {
    Response response =
        given()
            .body("{\"name\":\"morpheus\",\"job\":\"zion resident\"}")
            .when()
            .put("/users/2")
            .then()
            .assertThat()
            .statusCode(200)
            .spec(responseSpecification)
            .extract()
            .response();

    String job = response.path("job");
    System.out.println("Created User id is: " + job);
    String updatedDate = response.path("updatedAt");
    System.out.println("User Updated date is: " + updatedDate);
  }

  @Test
  public void verifyUserRegister() {
    Response response =
        given()
            .body("{\"email\":\"eve.holt@reqres.in\",\"password\":\"pistol\"}")
            .when()
            .post("/register")
            .then()
            .assertThat()
            .statusCode(200)
            .spec(responseSpecification)
            .extract()
            .response();
    String id = response.path("id").toString();
    System.out.println("Generated Id is:" + id);
    String token = response.path("token");
    System.out.println("Generated Id is:" + token);
  }

  @Test
  public void verifyUserLogin() {
    Response response =
        given()
            .body("{\"email\":\"eve.holt@reqres.in\",\"password\":\"cityslicka\"}")
            .when()
            .post("/login")
            .then()
            .assertThat()
            .statusCode(200)
            .spec(responseSpecification)
            .extract()
            .response();

    String token = response.path("token");
    System.out.println("Generated Id is:" + token);
  }

  @Test
  public void verifyUserRegisterUnSuccessful() {
    given()
        .body("{\"email\":\"sydney@fife\"}")
        .when()
        .post("/register")
        .then()
        .assertThat()
        .statusCode(400)
        .spec(responseSpecification)
        .body("error", equalTo("Missing password"));
  }

  @Test
  public void verifyUserLoginUnSuccessful() {
    given()
        .body("{\"email\":\"peter@klaven\"}")
        .when()
        .post("/login")
        .then()
        .assertThat()
        .statusCode(400)
        .spec(responseSpecification)
        .body("error", equalTo("Missing password"));
  }

  @Test
  public void verifyDelayedResponse() {
    given()
        .queryParam("delay", "3")
        .when()
        .get("/user")
        .then()
        .assertThat()
        .statusCode(200)
        .spec(responseSpecification);
  }

  @Test
  public void verifyGetInvalidUserResponse() {
    Response response =
        get("/users/23")
            .then()
            .assertThat()
            .statusCode(404)
            .spec(responseSpecification)
            .extract()
            .response();
  }
}
