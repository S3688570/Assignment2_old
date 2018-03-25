package org.launchcode;

public abstract class Person extends Array{

    //List instance variables
    private String name;
    private int age;
    private String status;
    private String image;
    private String friends;

    //Construct default Person object
    protected Person() {
    }

    //Construct Person object containing specified parameters
    protected Person(String name, int age, String status, String image, String friends) {
        this.name = name;
        this.age = age;
        this.status = status;
        this.image = image;
        this.friends = friends;
    }

    //Return name of person's name
    public String getName() {
        return name;
    }


    //Return age of person
    public int getAge() {
        return age;
    }

    //Return image
    public String getImage() {
        return image;
    }

    //Return person's status
    public String getStatus() {
        return status;
    }

    //Return friend(s) name(s)
    public String getFriends() {
        return friends;
    }

    //Set friend(s) name(s)
    public void setFriends(String friends) {
        this.friends = friends;
    }

    //Set a person's age
    public void setAge(int age) {
        this.age = age;
    }

    //Set a person's name
    public void setName(String name) {
        this.name = name;
    }

    //Set a person's status
    public void setStatus(String newStatus) {
        this.status = status;
    }

    //Set the image
    public void setImage(String image) {
        this.image = image;
    }


//    public abstract void printProfiles();
}

