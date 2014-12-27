package com.forfuture.router;

/**
 * Maps requests for Transports. Defines different endpoints available
 * to retrieve and put data concerning Transports e.g. Road
 */

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@RestController
public class TransportsController {

    // GET /transports
    @RequestMapping(value = "/transports", method = RequestMethod.GET)
    public String getAllTransports() {
        return "Shows All Transports";
    }

    // POST /transports
    @RequestMapping(value = "/transports", method = RequestMethod.POST)
    public String addNewTransport() {
        return "Adds new Transport: ";
    }

    // DELETE /transports
    @RequestMapping(value = "/transports", method = RequestMethod.DELETE)
    public String removeTransport() {
        return "Removes a Transport";
    }
}