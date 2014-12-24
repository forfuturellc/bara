package com.forfuture.router;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by gocho on 12/23/14.
 *
 * Handles API request on the "transporters" endpoint
 */
@RestController
public class TransporterController {

    /**
     *
     * @param filter
     * @return
     */
    @RequestMapping(value = "/transporters", method = RequestMethod.GET)
    public String getTransporters(@RequestParam(value = "filter", required = false) String filter) {

        return  "transporters";
    }

    //@RequestMapping("/transporters/new")
}
