package com.pool.master.singleton.model;

public class UserProfile {

    private static UserProfile singletonInstance;
    String userName;

    private UserProfile() {

    }

    public static UserProfile createSingletonInstance() {
        if (singletonInstance == null) {
            singletonInstance = new UserProfile();
        }
        return singletonInstance;
    }
}
