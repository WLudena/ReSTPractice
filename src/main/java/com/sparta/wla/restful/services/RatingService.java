package com.sparta.wla.restful.services;

import com.sparta.wla.restful.entities.Rating;
import com.sparta.wla.restful.storage.DataStore;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RatingService {

    private Map<Integer, Rating> ratings = DataStore.getRatings();

//    public RatingService(){
//        ratings.put(1,new Rating(1,1,5,"wla", LocalDateTime.now()));
//        ratings.put(2,new Rating(2,1,5,"wla", LocalDateTime.now()));
//        ratings.put(3,new Rating(3,1,5,"wla", LocalDateTime.now()));
//    }

    public Rating getRating(int id){
        return ratings.get(id);
    }

    public List<Rating> getAllRatings(){
        return new ArrayList<>(ratings.values());
    }

    //Create
    public Rating createRating(Rating rating){
        rating.setId(ratings.size() + 1);
        ratings.put(rating.getId(), rating);
        return ratings.get(ratings.size());
    }

    //Read
    public List<Rating> getRange(int start, int end){
        List<Rating> filteredRatings = new ArrayList<>();
        for(int i = start; i <= end; i++){
            filteredRatings.add(ratings.get(i));
        }
        return filteredRatings;
    }

    //Delete
    public void deleteRating(int id){
        ratings.remove(id);
    }

    //Update
    public Rating updateRating(Rating rating){
        ratings.put(rating.getId(), rating);
        return ratings.get(rating.getId());
    }
}
