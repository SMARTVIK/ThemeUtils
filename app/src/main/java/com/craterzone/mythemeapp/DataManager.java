package com.craterzone.mythemeapp;

/**
 * Created by VIK on 24-01-2016.
 */
public class DataManager {

    private static DataManager instance;

    private DataManager() {
    }

    public static DataManager getInstance() {
        if (instance == null) {
            instance = new DataManager();
        }
        return instance;
    }
}
