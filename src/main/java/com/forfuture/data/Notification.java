package com.forfuture.data;

/**
 * A Notification is an event viewed by service consumers.
 * A notification is tied to a single route i.e. where the event occurred.
 * A time is registered along with the notification.
 * Notification have N:1 relationship with Routes, N:1 relationship with
 * Providers
 */

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.forfuture.data.user.User;


public class Notification {
    private int id;
    private Date date;
    private NotificationType type;
    private User user;
    private String message;
    private int votes = 0;

    public enum NotificationType {
        Accident, TrafficJam
    }
    private Route route;


    public Notification(int id,
                        NotificationType type, Route route,
                        User user, String message) {
        this.id = id;
        this.date =  new Date();
        this.type = type;
        this.route = route;
        this.user = user;
        this.message = message;
    }

    public int getId() { return id; }

    public Date getDate() { return date; }

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

    @JsonIgnore
    public User getUser() { return user; }

    @JsonProperty("userId")
    public int getUserId() { return user.getId(); }

    @JsonProperty("username")
    public String getUsername() { return user.getUsername(); }
}
