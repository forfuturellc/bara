package com.forfuture.data;

import java.util.Date;

/**
 * Created by gocho on 12/23/14.
 *
 * Notification is an event viewed by service consumers.
 * A notification is tied to a single route i.e. where the event occurred.
 * A time is registered along with the notification.
 */

public class Notification {
    private Integer id;
    private Integer route;
    private Date date;
}
