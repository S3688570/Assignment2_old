package org.launchcode;

import java.util.ArrayList;


public class Array {

    static ArrayList<Person> nam = new ArrayList<Person>();

    public Array() {
    }

    //Load the social network
    public static void loadArray() {

        nam.add(new Adult("Simon Heron", "37", "Working for KFC", "Image4", "Sid Simon", "Eve and Steve Heron", "Evan"));
        nam.add(new Adult("Joanne Heron", "34", "Looking for job", "none", "Mary Simon", "Michelle and Bob Jip", "Evan"));
        nam.add(new Children("Evan Heron", "6", "School", "none", "none", "Simon and Joanne Heron", "none"));
        nam.add(new Children("John Heron", "12", " School", "none", "Bre Evans", " Simon and Joanne Heron", "none"));
        nam.add(new Adult("Maggie Evans", "43", "Working for RMIT", "Image1", "Jo MacRay", "Simon and Rita Evans", "Bre"));
        nam.add(new Adult("Chuck Evans", "54", "Working at Melbourne University", "Image2", "Maria Draper", "Richard and Cynthia Evans", "Bre"));
        nam.add(new Children("Bre Evans", "15", "School", "none", "John Heron", "Maggie and Chuck Evans", "none"));
        nam.add(new Adult("John Simon", "44", "Freelance", "Image5", "Cisco Draper", "Justine and Roy Simon", "Sid and Lucy"));
        nam.add(new Adult("Mary Simon", "42", "Looking for job", "Image3", "Joanne Heron", "Paul and Ivy MacRay", "Sid and Lucy"));
        nam.add(new Children("Sid Simon", "3", "Working at KPMG", "Image3", "Joanne Heron", "John  and Mary Simon", "none"));
        nam.add(new Children("Lucy Simon", "7", "School", "none", "Tom Thomas", "John  and Mary Simon", "none"));
        nam.add(new Adult("Cisco Draper", "45", "Studying at RMIT", "Image6", "John Simon", "Luke and Tash Draper", "Michael"));
        nam.add(new Adult("Maria Draper", "42", "Working at BHP", "Image7", "Chuck Evans", "Gina and Joseph Formosa", "Michael"));
        nam.add(new Children("Michael Draper", "1", "Day Care", "none", "none", "Maria and Cisco Draper", "none"));
        nam.add(new Children("Tom Thomas", "5", "PreSchool", "none", "Lucy Simon", "Simon and Joanne Falk", "none"));
        nam.add(new Children("Jo MacRay", "52", "Working at RMIT", "Image10", "Maggie Evans", "Paul and Ivy MacRay", "none"));
        nam.add(new Adult("Dean MacIntosch", "20", "Studying at RMIT", "Image15", "Trish Donnell", "Kay and Fred MacIntosch", "none"));
        nam.add(new Adult("Trish Donnell", "20", "Studying at RMIT", "Image14", "Dean MacIntosch", "Fay and John Donnell", "none"));
        nam.add(new Adult("Kay MacIntosch", "54", "Working for Dept of Primary Industries", "Image20", "Maggie Evans", "Carmel and Robbie Zammit", "Dean and Lucy"));
        nam.add(new Adult("Fred MacIntosch", "57", "Working for the CSIRO", "Image21", "Jo MacRay", "Sam and Joy MacIntosch", "Dean and Lucy"));

    }

    public void printArray() {
        for (int i = 0; i < nam.size(); i++) {
            System.out.println(nam.get(i));
            System.out.println();
        }
    }
}
