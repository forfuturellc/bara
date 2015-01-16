package com.forfuture.data.transport;

/**
 * Road Transport
 */

import com.fasterxml.jackson.annotation.JsonIgnore;


public class RoadTransport implements Transport {
    private int id;
    String name  = "road";

    private static RoadTransport instance = new RoadTransport();
    private RoadTransport() {}

    @JsonIgnore
    public static  RoadTransport getInstance() { return instance; }

    public int getId() { return id; }
    public String getName() { return name; }
}
