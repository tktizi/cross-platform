package com.example.demo;

public class User {
    private String name;
    private int followerCount;

    public User(String name, int followerCount) {
        this.name = name;
        this.followerCount = followerCount;
    }

    public String getName() {
        return name;
    }

    public int getFollowerCount() {
        return followerCount;
    }
}
