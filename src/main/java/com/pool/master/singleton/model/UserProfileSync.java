package com.pool.master.singleton.model;

public class UserProfileSync {

    private static UserProfileSync singletonInstance;
    String userName;

    private UserProfileSync() {

    }

    public static UserProfileSync createSingletonInstance() {
        if (singletonInstance == null) {
            singletonInstance = new UserProfileSync();
        }
        return singletonInstance;
    }
}
