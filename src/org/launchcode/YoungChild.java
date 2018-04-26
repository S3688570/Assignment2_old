package org.launchcode;

public class YoungChild extends Person implements PrintPerson{
    //Created by Charles Galea (April 2018)

    //Create default YoungChild object
    public YoungChild() {
    }

    //Construct second Children object with specified parameters
    public YoungChild(String name, String image, String status, String gender, String age, String state) {
        super(name, image, status, gender, age, state);
    }

    //Print profile parameters
    public String toString() {
        return "Name:" + getName() + "\nImage: " + getImage() + "\nStatus: " + getStatus() + "\nGender: " + getGender() + "\nAge: " + getAge() + "\nState: " + getState();
    }

}
