package com.forfuture.data.transport;

/**
 * Transport interface is implemented by the different types of transports
 * such as Road, Water and Railway.
 */

public abstract interface Transport {
    public int getId();
    public String getName();
}
