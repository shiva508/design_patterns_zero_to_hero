package com.pool.master.singleton.model;

public class UserProfileVolatile {
    private static volatile UserProfileVolatile SINGLETONINSTANCE;

    private UserProfileVolatile() {

    }

    public UserProfileVolatile createSingleTonInstance() {
        if (SINGLETONINSTANCE == null) {
            synchronized (UserProfileVolatile.class) {
                if (SINGLETONINSTANCE == null) {
                    SINGLETONINSTANCE = new UserProfileVolatile();
                }
            }
        }
        return SINGLETONINSTANCE;
    }
}
