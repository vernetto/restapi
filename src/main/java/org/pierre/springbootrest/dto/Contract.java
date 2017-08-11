package org.pierre.springbootrest.dto;

public class Contract {
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    String name;
    int id;

    public void setName(String name) {
        this.name = name;
    }
}
