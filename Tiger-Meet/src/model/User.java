package com.tigermeet.api.tigermeetapi.model;
import java.util.Date;
import java.util.logging.Logger;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * represents a User entity.
 *
 * @author kara kolodinsky
 * @author code heavily based on heroes-api by SWEN Faculty
 */
public class User {
    private static final Logger LOG = Logger.getLogger(User.class.getName());

    // Package private for tests
    static final String STRING_FORMAT = "User [id=%d, name=%s, gender=%s, seeking=%s, birthday=%s, deaf=%b, eatery=%s ]";

    @JsonProperty("id") private int id;
    @JsonProperty("name") private String name;
    //replace with @JsonProperty("googleAuthentification") private idConfiguration googleAuthentification;
    @JsonProperty("gender") private Gender gender;
    @JsonProperty("seeking") private Gender[] seeking;
    @JsonProperty("birthday") private Date birthday;
    @JsonProperty("deaf") private boolean deaf;
    @JsonProperty("eateryLocation") private EateryLocation eaterylocation;
    @JsonProperty("studyLocation") private StudyLocation studylocation;
    //@JsonProperty("club") private Club clubs;
    //@JsonProperty("questions") private Questions questions;
    //@JsonProperty("matchList") private Match[] matchlist;



    

    /**
     * create a user with the given id, name, and stock.
     * @param id the id of the user
     * @param name the name of the user
     * 
     * {@literal @}JsonProperty is used in serialization and deserialization
     * of the JSON object to the Java object in mapping the fields.  If a field
     * is not provided in the JSON object, the Java field gets the default Java
     * value, i.e. 0 for int
     */
    public User(@JsonProperty("id") int id, @JsonProperty("name") String name,  @JsonProperty("gender") Gender gender, 
    @JsonProperty("seeking") Gender[] seeking,  @JsonProperty("birthday") Date birthday,  @JsonProperty("deaf") boolean deaf,
    @JsonProperty("eaterylocation") EateryLocation eaterylocation,  @JsonProperty("studylocation") StudyLocation studylocation
    ) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.seeking = seeking;
        this.birthday = birthday;
        this.deaf = deaf;
        this.eaterylocation = eaterylocation;
        this.studylocation = studylocation;
    }

    /**
     * retrieves the id of the user
     * @return The id of the user
     */
    public int getId() {return id;}

        /**
     * retrieves the id of the user
     * @return The id of the user
     */
    public Gender getGender() {return gender;}

    /**
     * retrieves the id of the user
     * @return The id of the user
     */
    public String getName() {return name;}


    /**
     * sets the name of the user; necessary for JSON object to Java object deserialization.
     * @param name The name of the user
     */
    public void setName(String name) {this.name = name;}

    /**
     * retrieves the name of the user
     * @return the name of the user
     */
    public Gender[] getSeeking() {return seeking;}

     /**
     * retrieves the name of the user
     * @return the name of the user
     */
    public Date getBirthday() {return birthday;}

    /**
     * retrieves the name of the user
     * @return the name of the user
     */
    public boolean getDeaf() {return deaf;}

    /**
     * retrieves the name of the user
     * @return the name of the user
     */
    public EateryLocation getEatery() {return eaterylocation;}

        /**
     * retrieves the name of the user
     * @return the name of the user
     */
    public StudyLocation getStudy() {return studylocation;}


    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return String.format(STRING_FORMAT,id,name,gender,seeking,birthday,deaf,eaterylocation, studylocation);
    }
}