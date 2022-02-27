package com.tigermeet.api.tigermeetapi.model;

/**
 * The gender of a user.
 * @author zmb6893
 */

public enum Gender {
    FEMALE("Female"),
    MALE("Male"),
    NONBINARY("Nonbinary"),
    ANY("Any of the above");

    private String gender;

    private Gender(String gender){
        this.gender = gender;
    }

    public String getGender(){
        return this.gender;
    }

    @Override
    public String toString() {
        return this.gender;
    }
}