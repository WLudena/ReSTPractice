package com.sparta.wla.restful.storage;

import com.sparta.wla.restful.entities.Rating;

import java.util.HashMap;
import java.util.Map;

public class DataStore {

    private static Map<Integer, Rating> ratings = new HashMap<>();

    public static Map<Integer, Rating> getRatings(){
        return ratings;
    }
}
