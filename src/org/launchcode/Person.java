package org.launchcode;

public abstract class Person extends Array{
    //Created by Charles Galea (March 2018)

    //List instance variables
    private String name;
    private String image;
    private String status;
    private String gender;
    private int age;
    private String state;

    //Construct default Person object
    protected Person() {
    }

    //Construct Person object containing specified parameters
    protected Person(String name, String image, String status, String gender, int age, String state) {
        this.name = name;
        this.image = image;
        this.status = status;
        this.gender = gender;
        this.age = age;
        this.state = state;
    }

    //Return name
    public String getName() {
        return name;
    }

    //Return mage
    public String getImage() {
        return image;
    }

    //Return status
    public String getStatus() {
        return status;
    }

    //Return gender
    public String getGender() {
        return gender;
    }

    //Return age
    public String getAge() {
        return age;
    }

    //Return state
    public String getState() {
        return state;
    }

    //Set new name
    public void setName(String name) {
        this.name = name;
    }

    //Set new image
    public void setImage(String image) {
        this.image = image;
    }

    //Set new status
    public void setStatus(String status) {
        this.status = status;
    }

    //Set new gender
    public void setGender(String gender) {
        this.gender = gender;
    }

    //Set new age
    public void setAge(String age) {
        this.age = age;
    }

    //Set new age
    public void setState(String state) {
        this.state = state;
    }

    //Return a string listing object parameters
    public abstract String toString();

}

