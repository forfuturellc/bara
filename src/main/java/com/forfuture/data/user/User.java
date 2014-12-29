package com.forfuture.data.user;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * A User is an entity that utilizes the service in any manner. A user may
 * provide data to ot retrieve data from the service. They implement this
 * interface.
 */

public class User {
    private int id;
    private String username;
    private String email;

    public User(int id, String username, String email) {
        this.id = id;
        this.username = username;
        this.email = email;
    }

    public int getId() { return id; }

    public String getUsername() { return username; }
    public String setUsername(String username) {
        this.username = username;
        return username;
    }

    String getEmail() { return email; }
    String setEmail(String email) {
        this.email = email;
        return email;
    }
}