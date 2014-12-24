package com.forfuture.router;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gocho on 12/21/14.
 *
 * Handles API requests to the Routes endpoint, "/routes".
 */
@RestController
public class RouteController {

    @RequestMapping("/routes")
    public String getAllRoutes() {
        return "All routes";
    }
}