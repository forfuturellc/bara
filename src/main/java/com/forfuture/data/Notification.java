package com.forfuture.data;

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
    private Integer route;
    private Date date;
}
