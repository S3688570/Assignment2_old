package org.launchcode;

public class YoungChild extends Person implements PrintPerson{
    //Created by Charles Galea (April 2018)
    private String name;
    private String age;
    private String status;
    private String image;
    private String parents;


    //Create default YoungChild object
    public YoungChild() {
    }

    //Construct second Children object with specified parameters
    public YoungChild(String name, String age, String status, String image, String parents) {
        this.name = name;
        this.age = age;
        this.status = status;
        this.image = image;
        this.parents = parents;
    }

    //Construct third Children object with specified parameters
    public YoungChild(String name, String age, String status, String image) {
        super(name, age, status, image, null, null, null);
    }

    //Construct third Children object with specified parameters
    public YoungChild(String name, String age, String status) {
        super(name, age, status, null, null, null, null);
    }

    //Construct third Children object with specified parameters
    public YoungChild(String name, String age) {
        super(name, age, null, null, null, null, null);
    }

    //Print profile parameters
    public String toString() {
        return "Name:" + getName() + "\nAge: " + getAge() + "\nStatus: " + getStatus() + "\nImage: " + getImage() + "\nParents: " + getParents();
    }


}
