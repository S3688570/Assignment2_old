package org.launchcode;

import java.util.Scanner;
import java.io.*;

public class MiniNet {
    /**
     * <h1>MiniNet</h1>
     * MiniNet is a program simulating a social network. A social network, in the simplest sense,
     * is a collection of connections linking a set of people. Each person has a profile in the
     * social network. To do this I created a interactive network called MiniNet containing profile
     * information (i.e. name, age status, profile image, friends, parents and children.
     * The program allows the user to add, search, modify and delete profiles.
     * <p>
     * <b>Note:</b> This project was an assignment completed for the course Advanced Programming
     * as part of the Master of Data Science course at RMIT (Melbourne, Australia).
     *
     * @author: Charles Galea
     * @version: 1.1
     * @since: 2014-04-19
     * </p>
     */
    //Created by Charles Galea (March 2018)
    public MiniNet() {
    }

    //public static void main(String args[]) {

    //   Scanner input = new Scanner(System.in);

    //  Array array = new Array();
    //  array.loadArray();
    // array.printArray();


    public static void main(String[] args)
            throws IOException {
        // create buffered file stream
        BufferedReader bufr = new BufferedReader(new FileReader("C://Data//Data.txt")); //source.txt – file name (need to specify path)
        String inputLine;
        inputLine = bufr.readLine();
        while (inputLine != null) {  //  more input
            System.out.println(inputLine);
            inputLine = bufr.readLine();
        }

        Scanner input = new Scanner(System.in);

        Array array = new Array();
        array.loadArray();
        array.printArray();

        Driver menu = new Driver();
        menu.displayMenu();
    }

}


