package com.forfuture.data.transport;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Road Transport
 */

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
