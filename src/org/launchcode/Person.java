package org.launchcode;

public class Person {

    //List instance variables
    private String lastName;
    private String firstName;
    private int age;
    private String status;
    private String image;

    //Construct default Person object
    public Person() {
    }

    //Construct Person object containing specified parameters
    public Person(String lastName, String firstName, int age, String status, String image) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
        this.status = status;
        this.image = image;
    }

    //Construct second Person object containing specified parameters
    public Person(String lastName, String firstName, int age, String status) {
        this(lastName, firstName, age, status, null);
    }

    //Construct third Person object containing specified parameters
    public Person(String lastName, String firstName, int age) {
        this(lastName, firstName, age, null, null);
    }

    //Return name of person's first name
    public String getFirstName() {
        return firstName;
    }

    //Return person's last name
    public String getLastName() {
        return lastName;
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

    //Set a person's first name
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    //Set person's last name
    public void setLastName(String lastName) {
        this.lastName = lastName;
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

