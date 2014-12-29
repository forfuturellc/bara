package com.forfuture.data;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.forfuture.data.Route;

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
    private Date date;
    private NotificationType type;
    private String message;
    private int votes = 0;

    public enum NotificationType {
        Accident, TrafficJam
    }
    private Route route;


    public Notification(int id, Date date,
                        NotificationType type, Route route,
                        String message) {
        this.id = id;
        this.date = date;
        this.type = type;
        this.route = route;
        this.message = message;
    }

    public int getId() { return id; }

    public int getVotes() { return votes; }
    public int incrementVotes() { return ++votes; }
    public int decrementVotes() { return --votes; }

    public String getMessage() { return message; }

    @JsonIgnore
    public Route getRoute() { return route; }

    @JsonProperty("routeId")
    public int getRouteId() { return route.getId(); }

    @JsonProperty("transport")
    public String getTransportName() { return route.getTransport().getName(); }

    @JsonProperty("type")
    public NotificationType getType() { return type; }
}
