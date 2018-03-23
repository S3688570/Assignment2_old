package org.launchcode;

public class Person extends Driver {

    //List instance variables
    private String name;
    private int age;
    private String status;
    private String image;

    //Construct default Person object
    public Person() {
    }

    //Construct Person object containing specified parameters
    public Person(String name, int age, String status, String image) {
        this.name = name;
        this.age = age;
        this.status = status;
        this.image = image;
    }

    //Construct second Person object containing specified parameters
    public Person(String name, int age, String status) {
        this(name, age, status, null);
    }

    //Construct third Person object containing specified parameters
    public Person(String name, int age) {
        this(name, age, null, null);
    }

    //Return name of person
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

    //Set a person's age
    public void setAge(int newAge) {
        age = newAge;
    }

    //Set a person's age
    public void setName(String newName) {
        name = newName;
    }

    //Set a person's status
    public void setStatus(String newStatus) {
        status = newStatus;
    }

    //Set the image
    public void setImage(String image) {
        this.image = image;
    }


}

