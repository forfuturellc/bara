package com.forfuture.data;

/**
 * A Route is a A-B path in a transport system. This is implemented by all
 * routes.
 * Relationships:
 *  N:1 - Country
 *  1:1 - Transport
 *  1:N - Transporters
 *  What makes routes unique?
 *  - code
 *  - pointA-pointB combination
 */

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.forfuture.data.transport.Transport;


public class Route {
    private int id;
    private String code;
    private String pointA;
    private String pointB;
    private Country country;
    private Transport transport;

    public Route(int id, String code,
                 String pointA, String pointB,
                 Country country, Transport transport) {
        this.id = id;
        this.code = code;
        this.pointA = pointA;
        this.pointB = pointB;
        this.country = country;
        this.transport = transport;
    }

    public int getId() { return id; }
    public String getCode() { return code; }
    public String setCode(String code) {
        this.code = code;
        return code;
    }

    @JsonProperty("points")
    public ArrayList<String> getPoints() {
        ArrayList<String> points = new ArrayList<String>();
        points.add(pointA);
        points.add(pointB);
        return points;
    }

    @JsonIgnore
    public Country getCountry() { return country; }

    @JsonProperty("countryId")
    public int getCountryId() { return country.getId(); }

    @JsonIgnore
    public Transport getTransport() { return transport; }

    @JsonProperty("transport")
    public String getTransportName() { return transport.getName(); }
}
