package com.tigermeet.api.tigermeetapi.model;

/**
 * The class for a restaurant location on campus. Contains the restaurant name and the location of the restaurant.
 * @author zmb6893
 */

public enum EateryLocation {
    // TODO: add more EateryLocations
    ARTESANO_BAKERY_AND_CAFE("Artesano Bakey & Cafe", "Monroe Hall, 1 Lomb Memorial Dr, Rochester, NY 14623");

    private String restaurant;
    private String location;

    private EateryLocation(String restaurant, String location){
        this.restaurant = restaurant;
        this.location = location;
    }

    public String getLocation(){
        return this.location;
    }

    public String getRestaurant(){
        return this.restaurant;
    }

    @Override
    public String toString() {
        return restaurant + " at " + location;
    }
}
