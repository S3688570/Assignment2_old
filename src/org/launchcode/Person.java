package org.launchcode;

public abstract class Person extends Array{

    //List instance variables
    private String name;
    private String age;
    private String status;
    private String image;
    private String friends;
    private String parents;
    private String children;

    //Construct default Person object
    protected Person() {
    }

    //Construct Person object containing specified parameters
    protected Person(String name, String age, String status, String image, String friends, String parents, String children) {
        this.name = name;
        this.age = age;
        this.status = status;
        this.image = image;
        this.friends = friends;
        this.parents = parents;
        this.children = children;
    }

    //Return name of person's name
    public String getName() {
        return name;
    }


    //Return age of person
    public String getAge() {
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

    //Return parents names
    public String getParents() {
        return parents;
    }

    //Return child(rens)'s name(s)
    public String getChildren() {
        return children;
    }

    //Set parents names
    public void setParents(String parents) {
        this.parents = parents;
    }

    //Set child(ren)'s name(s)
    public void setChildren(String children) {
        this.children = children;
    }

    //Set a person's age
    public void setAge(String age) {
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

