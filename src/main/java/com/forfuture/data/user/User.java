package com.forfuture.data.user;

/**
 * A User is an entity that utilizes the service in any manner. A user may
 * provide data to ot retrieve data from the service. They implement this
 * interface.
 */


public abstract interface User {
    int getId();
    String getEmail();
}