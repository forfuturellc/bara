package com.forfuture.router;

/**
 * API endpoint "/countries/"
 */

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.forfuture.data.Country;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.HashMap;

@RestController
public class CountriesController {

    @RequestMapping(value = "/countries", method = RequestMethod.GET)
    String getCountries() {
        ObjectMapper mapper = new ObjectMapper();
        Country kenya = new Country(1, "Kenya");
        Country uganda = new Country(2, "Uganda");
        ArrayList<Country> countries = new ArrayList<Country>();
        countries.add(kenya);
        countries.add(uganda);
        HashMap<String, ArrayList<Country>> response = new HashMap<String, ArrayList<Country>>();
        response.put("countries", countries);
        try {
            return mapper.writeValueAsString(response);
        } catch (JsonProcessingException error) {
            return error.toString();
        }
    }
}
