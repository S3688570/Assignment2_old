package org.launchcode;

/**
 * Creates an adult profile.
 * <p>Includes the person's name, age,
 * status, friends and children. There is also the potion to
 * include a profile image.
 * </p>
 * @see Person
 *
 * @param name
 */
public class Adult extends Person implements PrintPerson{
    //Created by Charles Galea (March 2018)


    //Construct default Adult object
    public Adult() {
    }

    //Construct Friend object with specified parameters
    public Adult(String name, String age, String status, String image, String friends, String parents, String children) {
        super(name, age, status, image, friends, parents, children);
    }

    //Construct second Friend object with specified parameters
    public Adult(String name, String age, String status, String image, String friends, String parents) {
        super(name, age, status, image, friends, parents, null);
    }

    //Construct third Friend object with specified parameters
    public Adult(String name, String age, String status, String image) {
        super(name, age, status, image, null, null, null);
    }

    //Construct fourth Friend object with specified parameters
    public Adult(String name, String age, String status) {
        super(name, age, status, null, null, null, null);
    }

    //Construct fifth Friend object with specified parameters
    public Adult(String name, String age) {
        super(name, age, null, null, null, null, null);
    }

    //Print profile parameters
    public String toString() {
        return "Name:" + getName() + "\nAge: " + getAge() + "\nStatus: " + getStatus() + "\nImage: " + getImage() + "\nParents: " + getParents();
    }


}

