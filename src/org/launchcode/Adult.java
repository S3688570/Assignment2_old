package org.launchcode;

/**
 * Creates an adult profile.
 * <p>Includes the person's name, age,
 * status, friends and children. There is also the potion to
 * include a profile image.
 * </p>
 * @see Person
 *
 */
public class Adult extends Person implements PrintPerson{
    //Created by Charles Galea (March 2018)


    //Construct default Adult object
    public Adult() {
    }

    //Construct Friend object with specified parameters
    public Adult(String name, String image, String status, String gender, int age, String state) {
        super(name, image, status, gender, age, state);
    }

    //Print profile parameters
    public String toString() {
        return "Name:" + getName() + "\nImage: " + getImage() + "\nStatus: " + getStatus() + "\nGender: " + getGender() + "\nAge: " + getAge() + "\nState: " + getState();
    }
}

