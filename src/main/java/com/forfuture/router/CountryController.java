package com.forfuture.router;

/**
 * Handles API requests at "country/{countryName}/" endpoint
 */

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.forfuture.data.Country;
import com.forfuture.data.Notification;
import com.forfuture.data.transport.RoadTransport;
import com.forfuture.data.transport.Transport;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import com.forfuture.data.Route;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

@RestController
public class CountryController {
    private ObjectMapper mapper = new ObjectMapper();
    Country kenya = new Country(1, "kenya");
    Route rongai = new Route(1, "125", "nairobi", "rongai", kenya,  new RoadTransport());
    Route juja = new Route(2, "1008", "juja", "nairobi", kenya, new RoadTransport());

    @RequestMapping(value = "/country/{countryName}/routes",
            method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    String getRoutes() {
        HashMap<String, ArrayList<Route>> response = new HashMap<String, ArrayList<Route>>();
        ArrayList<Route> routes = new ArrayList<Route>();
        routes.add(rongai);
        routes.add(juja);
        response.put("routes", routes);
        try {
            return mapper.writeValueAsString(response);
        } catch (JsonProcessingException error) {
            return error.toString();
        }
    }

    @RequestMapping(value = "/country/{countryName}/transports",
            method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    String getTransports() {
        HashMap<String, ArrayList<Transport>> response = new HashMap<String, ArrayList<Transport>>();
        ArrayList<Transport> transports = new ArrayList<Transport>();
        transports.add(new RoadTransport());
        response.put("transports", transports);
        try {
            return mapper.writeValueAsString(response);
        } catch (JsonProcessingException error) {
            return error.toString();
        }
    }

    @RequestMapping(value = "/country/{countryName}/notifications",
            method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    String getNotifications() {
        HashMap<String, ArrayList<Notification>> response = new HashMap<String, ArrayList<Notification>>();
        ArrayList<Notification> notifications = new ArrayList<Notification>();
        Notification notification1 = new Notification(1, new Date(), Notification.NotificationType.Accident, rongai, "accident near strathmore");
        Notification notification2 = new Notification(2, new Date(), Notification.NotificationType.TrafficJam, rongai, "jam at KU");
        notifications.add(notification1);
        notifications.add(notification2);
        response.put("notifications", notifications);
        try {
            return mapper.writeValueAsString(response);
        } catch (JsonProcessingException error) {
            return error.toString();
        }
    }
}
