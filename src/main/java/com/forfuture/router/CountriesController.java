package com.forfuture.router;

/**
 * API endpoint "/countries/"
 */

import java.util.ArrayList;
import java.util.HashMap;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.forfuture.data.Country;


@RestController
public class CountriesController {

    @RequestMapping(value = "/countries",
            method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
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
