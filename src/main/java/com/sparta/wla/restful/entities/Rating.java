package com.sparta.wla.restful.entities;

import javax.xml.bind.annotation.XmlRootElement;
import java.time.LocalDateTime;

@XmlRootElement
public class Rating {

    private int id;
    private int movieId;
    private int rating;
    private String authodId;
    private LocalDateTime datePosted;

    public Rating(){}

//    public Rating(int id, int movieId, int rating, String authodId, LocalDateTime datePosted) {
//        this.id = id;
//        this.movieId = movieId;
//        this.rating = rating;
//        this.authodId = authodId;
//        this.datePosted = datePosted;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getAuthodId() {
        return authodId;
    }

    public void setAuthodId(String authodId) {
        this.authodId = authodId;
    }

    public LocalDateTime getDatePosted() {
        return datePosted;
    }

    public void setDatePosted(LocalDateTime datePosted) {
        this.datePosted = datePosted;
    }
}
