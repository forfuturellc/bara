package com.forfuture.router;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static com.jayway.restassured.module.mockmvc.RestAssuredMockMvc.*;
import static com.jayway.restassured.module.mockmvc.matcher.RestAssuredMockMvcMatchers.*;
import static com.jayway.restassured.module.jsv.JsonSchemaValidator.*;


/**
 * Tests for {@link NotificationController}.
 *
 * @author mugo@forfuture.co.ke (GochoMugo)
 */
public class CountryControllerTest {

    @Test
    public void getRoutes() {
      given().
        standaloneSetup(new CountryController()).
        param("transport", "road").
      when().
        get("/country/kenya/routes").
      then()
        .assertThat()
        .body(matchesJsonSchemaInClasspath("routes-schema.json"));
    }

    @Test
    public void getTransports() {
      given().
        standaloneSetup(new CountryController()).
      when().
        get("/country/kenya/transports").
      then()
        .assertThat()
        .body(matchesJsonSchemaInClasspath("transports-schema.json"));
    }

    @Test
    public void getNotifications() {
      given().
        standaloneSetup(new CountryController()).
        param("transport", "road").
      when().
        get("/country/kenya/notifications").
      then()
        .assertThat()
        .body(matchesJsonSchemaInClasspath("notifications-schema.json"));
    }

    @Test
    public void getTransportRoutes() {
      given().
        standaloneSetup(new CountryController()).
      when().
        get("/country/kenya/road/routes").
      then()
        .assertThat()
        .body(matchesJsonSchemaInClasspath("transports-schema.json"));
    }

    @Test
    public void getTransportNotifications() {
      given().
        standaloneSetup(new CountryController()).
      when().
        get("/country/kenya/road/notifications").
      then()
        .assertThat()
        .body(matchesJsonSchemaInClasspath("notifications-schema.json"));
    }

}
