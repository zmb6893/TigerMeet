package com.tigermeet.api.tigermeetapi.model;

/**
 * The class representation for a study location.
 * @author zmb6893
 */

public enum StudyLocation {
    // TODO: Add more study locations

    FIRESIDE_LOUNGE("Fireside Lounge", "68 Lomb Memorial Dr, Rochester, NY 14623");

    private String location;
    private String studyArea;

    private StudyLocation(String studyArea, String location){
        this.studyArea = studyArea;
        this.location = location;
    }

    public String getLocation(){
        return this.location;
    }

    public String getStudyArea(){
        return this.studyArea;
    }

    @Override
    public String toString() {
        return this.studyArea + " at " + this.location;
    }
}
