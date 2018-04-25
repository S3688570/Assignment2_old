package org.launchcode;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Array {
    //Created by Charles Galea (March 2018)

    public Array() {
    }

    //Load the social network
    public static void loadArray() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a filename: ");
        String fname = keyboard.nextLine();
        ArrayList<String> list = new ArrayList<String>();

        try {
            Scanner in = new Scanner(new File(fname));
            while (in.hasNext()) {
                String value = in.nextLine();
                list.add(value);
            }
            in.close();
        } catch (IOException e) {
            System.out.println("Error! File " + fname + " not found!");
            System.exit(0);
        } catch (InputMismatchException e) {
            System.out.println("Error! Non string in file " + fname);
            System.exit(0);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
            System.out.println();
        }
    }
}

    /*public void printArray() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
            System.out.println();
        }
    }
} */
