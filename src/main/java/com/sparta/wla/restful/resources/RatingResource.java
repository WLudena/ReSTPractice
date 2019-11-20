package com.sparta.wla.restful.resources;

import com.sparta.wla.restful.entities.Rating;
import com.sparta.wla.restful.services.RatingService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

//ACTUAL RESTFUL CODE
@Path("ratingResource")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class RatingResource {

    private RatingService ratingService = new RatingService(); //Inject this

    @GET
    @Path("{id}") //Curly brackets used only when variables are passed
    public Rating find(@PathParam("id") int id){
        return ratingService.getRating(id);
    }

    @GET
    @Path("all") //
    public List<Rating> findAll(){
        return ratingService.getAllRatings();
    }

    @DELETE
    @Path("{id}")
    public void delete(@PathParam("id") int id){
        ratingService.deleteRating(id);
    }

    @POST
    public Rating create(Rating rating){
        return ratingService.createRating(rating);
    }

    @PUT
    @Path("{id}")
    public Rating edit(@PathParam("id") int id, Rating rating){
        rating.setId(id);
        return ratingService.updateRating(rating);
    }

    @GET
    @Path("{start}/{end}")
    public List<Rating> range(@PathParam("start") int start,@PathParam("end") int end){
        return ratingService.getRange(start, end);
    }
}
