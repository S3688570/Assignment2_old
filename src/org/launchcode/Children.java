package org.launchcode;

public class Children extends Person implements PrintPerson{
    //Created by Charles Galea (March 2018)

    //Construct default Children object
    public Children() {
    }

    //Construct second Children object with specified parameters
    public Children(String name, String image, String status, String gender, String age, String state) {
        super(name, image, status, gender, age, state);
    }

    //Print profile parameters
    public String toString() {
        return "Name:" + getName() + "\nImage: " + getImage() + "\nStatus: " + getStatus() + "\nGender: " + getGender() + "\nAge: " + getAge() + "\nState: " + getState();
    }

}

