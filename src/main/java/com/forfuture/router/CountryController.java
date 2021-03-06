package com.forfuture.router;

/**
 * Handles API requests at "country/{countryName}/" endpoint
 */

import java.util.ArrayList;
import java.util.HashMap;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import com.forfuture.data.Country;
import com.forfuture.data.Notification;
import com.forfuture.data.transport.RoadTransport;
import com.forfuture.data.transport.Transport;
import com.forfuture.data.user.User;
import com.forfuture.data.Route;


@RestController
public class CountryController {
    private ObjectMapper mapper = new ObjectMapper();
    Country kenya = new Country(1, "kenya");
    Route rongai = new Route(1, "125", "nairobi", "rongai", kenya,  RoadTransport.getInstance());
    Route juja = new Route(2, "1008", "juja", "nairobi", kenya, RoadTransport.getInstance());
    User gocho = new User(1, "gocho", "mugo@forfuture.co.ke");
    User james = new User(2, "james", "james@ncece.co.ke");

    @RequestMapping(value = "/country/{countryName}/routes",
            method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, ArrayList<Route>> getRoutes(@PathVariable String countryName,
            @RequestParam("transport") String transport) {
        HashMap<String, ArrayList<Route>> response = new HashMap<String, ArrayList<Route>>();
        ArrayList<Route> routes = new ArrayList<Route>();
        routes.add(rongai);
        routes.add(juja);
        response.put("routes", routes);
        return response;
    }

    @RequestMapping(value = "/country/{countryName}/transports",
            method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, ArrayList<Transport>> getTransports(@PathVariable String countryName) {
        HashMap<String, ArrayList<Transport>> response = new HashMap<String, ArrayList<Transport>>();
        ArrayList<Transport> transports = new ArrayList<Transport>();
        transports.add(RoadTransport.getInstance());
        response.put("transports", transports);
        return response;
    }

    @RequestMapping(value = "/country/{countryName}/notifications",
            method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, ArrayList<Notification>> getNotifications(@PathVariable String countryName,
            @RequestParam("transport") String transport) {
        HashMap<String, ArrayList<Notification>> response = new HashMap<String, ArrayList<Notification>>();
        ArrayList<Notification> notifications = new ArrayList<Notification>();
        Notification notification1 = new Notification(1, Notification.NotificationType.Accident, rongai, gocho, "accident near strathmore");
        Notification notification2 = new Notification(2, Notification.NotificationType.TrafficJam, rongai, james, "jam at KU");
        notifications.add(notification1);
        notifications.add(notification2);
        response.put("notifications", notifications);
        return response;
    }

    @RequestMapping(value = "/country/{countryName}/{transportName}/routes",
            method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, ArrayList<Route>> getTransportRoutes(@PathVariable String countryName,
            @PathVariable String transportName) {
        return getRoutes(countryName, transportName);
    }

    @RequestMapping(value = "/country/{countryName}/{transportName}/notifications",
            method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, ArrayList<Notification>> getTransportNotifications(@PathVariable String countryName,
            @PathVariable String transportName) {
        return getNotifications(countryName, transportName);
    }
}
