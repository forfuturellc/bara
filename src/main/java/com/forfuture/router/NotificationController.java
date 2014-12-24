package com.forfuture.router;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by gocho on 12/23/14.
 *
 * Handles API request on the "notifications" endpoint
 */
@RestController
public class NotificationController {

    @RequestMapping("/notifications")
    public String getAllNotifications() {
        return "notifications";
    }
}
