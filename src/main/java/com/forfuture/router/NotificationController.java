package com.forfuture.router;

import com.forfuture.data.Country;
import com.forfuture.data.Notification;
import com.forfuture.data.Route;
import com.forfuture.data.transport.RoadTransport;
import com.forfuture.data.user.User;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;


/**
 * Created by gocho on 12/23/14.
 *
 * Handles API request on the "notifications" endpoint
 */
@RestController
public class NotificationController {
    // Sample notifications
    Country kenya = new Country(1, "kenya");
    Route route1 = new Route(1, "125", "nairobi - cbd", "ongata rongai", kenya, RoadTransport.getInstance());
    User user1 = new User(1, "gocho", "mugo@forfuture.co.ke");
    Notification notification1 = new Notification(1, Notification.NotificationType.TrafficJam, route1,user1 , "accident at strathmore");
    Notification notification2 = new Notification(2, Notification.NotificationType.TrafficJam, route1,user1 , "traffic jam globe roundabout");

    @RequestMapping(value = "/notifications", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<Notification> getAllNotifications() {
        ArrayList<Notification> notifications = new ArrayList<Notification>();
        notifications.add(notification1);
        notifications.add(notification2);
        return notifications;
    }
}
