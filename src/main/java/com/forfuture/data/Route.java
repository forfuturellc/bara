package com.forfuture.data;

import java.util.Collection;

/**
 * A Route is a A-B path in a transport system. This is implemented by all
 * routes.
 * Relationships:
 *  N:1 - Country
 *  1:1 - Transport
 *  1:N - Transporters
 */

import com.forfuture.data.transport.Transport;
import com.forfuture.data.user.User;

public class Route {
    private int id;
    private String code;
    private String origin;
    private String destination;
    private Country country;
    private Transport transport;

    public Route(int id, String code) {
        this.id = id;
        this.code = code;
    }

    public int getId() { return id; }
    public String getCode() { return code; }
    public String setCode(String code) {
        this.code = code;
        return code;
    }
    public String getOrigin() { return origin; }
    public String setOrigin(String origin) {
        this.origin = origin;
        return origin;
    }
    public String getDestination() { return destination; }
    public String setDestination(String destination) {
        this.destination = destination;
        return  destination;
    }
    public Country getCountry() { return country; }
    public Transport getTransport() { return transport; }
}
