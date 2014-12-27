package com.forfuture.router;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Handles API request on the "consumers" endpoint
 */
@RestController
public class ConsumerController {

    @RequestMapping("/consumers")
    public String getAllConsumers() {
        return "consumers";
    }
}
