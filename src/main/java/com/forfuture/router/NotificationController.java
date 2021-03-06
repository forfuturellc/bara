package com.forfuture.router;

import com.forfuture.data.Country;
import com.forfuture.data.Notification;
import com.forfuture.data.NotificationPayload;
import com.forfuture.data.Route;
import com.forfuture.data.transport.RoadTransport;
import com.forfuture.data.user.User;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;


/**
 * Created by gocho on 12/23/14.
 *
 * Handles API request on the "notifications" endpoint
 */
@RestController
public class NotificationController {
    // Sample notifications
    static int numNotifications = 0;
    static Country kenya = new Country(1, "kenya");
    static Route route1 = new Route(1, "125", "nairobi - cbd", "ongata rongai", kenya, RoadTransport.getInstance());
    static User user1 = new User(1, "gocho", "mugo@forfuture.co.ke");
    static Notification notification1 = new Notification(++numNotifications, Notification.NotificationType.TrafficJam, route1,user1 , "accident at strathmore");
    static Notification notification2 = new Notification(++numNotifications, Notification.NotificationType.TrafficJam, route1,user1 , "traffic jam globe roundabout");

    private static ArrayList<Notification> notifications = new ArrayList<Notification>(){{
        add(notification1); add(notification2);
    }};

    @RequestMapping(value = "/notifications", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, ArrayList<Notification>> getAllNotifications() {
        HashMap<String, ArrayList<Notification>> response = new HashMap<String, ArrayList<Notification>>();
        response.put("notifications", notifications);
        return response;
    }

    @RequestMapping(value = "/notifications", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> postNotification(@RequestParam("userId") String userId,
                                                    @RequestParam("username") String username, @RequestParam("message") String message) {
        Notification newNotification = new Notification(++numNotifications, Notification.NotificationType.TrafficJam, route1, user1, message);
        notifications.add(newNotification);
        HashMap<String, String> response = new HashMap<String, String>();
        response.put("message", "succeeded!");
        return response;
    }

}
