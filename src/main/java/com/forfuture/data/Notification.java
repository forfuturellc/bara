package com.forfuture.data;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Date;

/**
 * A Notification is an event viewed by service consumers.
 * A notification is tied to a single route i.e. where the event occurred.
 * A time is registered along with the notification.
 * Notification have N:1 relationship with Routes, N:1 relationship with
 * Providers
 */

public class Notification {
    private int id;

    @JsonIgnore
    private Route route;
    //private Date date;

    public Notification(int id, Route route) {
        this.id = id;
        this.route = route;
    }

    public int getId() { return id; }
    public Route getRoute() { return route; }

    @JsonProperty("routeId")
    public int getRouteId() { return route.getId(); }
}
