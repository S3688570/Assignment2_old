package org.launchcode;

public class Children extends Person {

    //List instance variables
    String parents;

    //Construct default Children object
    public Children() {
    }

    //Construct second Children object with specified parameters
    public Children(String name, int age, String status, String image, String parents) {
        super(name, age, status, image);
        this.parents = parents;
    }

    //Construct third Children object with specified parameters
    public Children(String name, int age, String status, String image) {
        super(name, age, status, image);
        this.parents = parents;
    }

    //Construct fourth Children object with specified parameters
    public Children(String name, int age, String status) {
        super(name, age, status, null);
        this.parents = parents;
    }

    //Construct fourth Children object with specified parameters
    public Children(String name, int age) {
        super(name, age, null, null);
        this.parents = parents;
    }

    //Return parent(s) name(s)
    public String getParents() {
        return parents;
    }

    //Set parent(s) name(s)
    public void setParents(String parents) {
        this.parents = parents;
    }

    //Return a string listing all elements in Children object
    public String toString() {
        return "Name:" + getName() + "\nAge: " + getAge() + "\nStatus: " + getStatus() + "\nImage: " + getImage() + "\nParents: " + parents;
    }

}

