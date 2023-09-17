package com.pool.master.singleton.client;

import com.learn.master.singleton.model.UserProfile;

public class UserProfileClient {
    public static void main(String[] args) {
        UserProfile userProfile0 = UserProfile.createSingletonInstance();
        UserProfile userProfile1 = UserProfile.createSingletonInstance();
        System.out.println(userProfile0.hashCode());
        System.out.println(userProfile1.hashCode());
    }
}
