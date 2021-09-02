package com.example.retrofittrial;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

//this interface is used to declare an endpoint
//an end point refers to the path where information is obtained
//since our aim is to  obtain information  from the api  we will be using the
// @get annotation  since we are making a get request
//we are getting our information from marvel
public interface Api {
    String BASE_URL="https://simplifiedcoding.net/demos/";
    @GET ("marvel")
    //returns information from the api
    Call<List<Results>> getSuperHeroes();

}
