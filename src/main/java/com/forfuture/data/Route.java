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

public interface Route {
    String getId();
    String getCode();
    String setCode();
    String getOrigin();
    String setOrigin();
    String getDestination();
    String setDestination();
    Country getCountry();
    Transport getTransport();
    Collection<User> getTransporters();
}
