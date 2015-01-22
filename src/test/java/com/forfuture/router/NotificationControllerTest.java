package com.forfuture.router;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.Ignore;
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
public class NotificationControllerTest {

    @Test
    public void getAllNotifications() {
      given().
        standaloneSetup(new NotificationController()).
        param("name", "Johan").
      when().
        get("/notifications").
      then()
        .assertThat()
        .body(matchesJsonSchemaInClasspath("notifications-schema.json"));
    }

}
