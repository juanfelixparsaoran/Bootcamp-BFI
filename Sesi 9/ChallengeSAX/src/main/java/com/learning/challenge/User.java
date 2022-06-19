package com.learning.challenge;

public class User {
    String firstName, lastName;
    int id;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public int getId() {
        return id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append(id + ":" + firstName + ":" + lastName);
        return builder.toString();
    }

}
