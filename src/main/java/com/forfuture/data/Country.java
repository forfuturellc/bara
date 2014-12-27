package  com.forfuture.data;

/**
*  A Country is a sovereign state that has established a formal way of
 *  classifying its transport system into well-defined routes
 */

public class Country {
    private int id;
    private String name;

    public Country(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() { return id; }

    public String getName() { return name; }

    public String setName(String name) {
        this.name = name;
        return name;
    }
}