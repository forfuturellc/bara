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

public interface Route {
    int id = null;
    String origin = null;
    String destination = null;
    Country country;
    Transport transport;
    Collection<User> transporters;
}
