package org.launchcode;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Array {
    //Created by Charles Galea (March 2018)

    //List for Person objects
    static ArrayList<Person> list = new ArrayList<>();

    public Array() {
    }

    //Load the social network
    public static void loadArray() {

        //Read data from file
        try (BufferedReader br = new BufferedReader(new FileReader((file)))) {

            //Read file line by line
            String line = "";
            while ((line = br.readLine() != null)) {
                //Parse line to extract individuals fields
                String[] data = this.parseLine(line);

                //Create new Person object
                Person persons = new Person();
                persons.name = data[0;
                persons.image = data[1];
                persons.status = data[2];
                persons.gender = data[3];
                persons.age = Integer.valueOf(data[4]);
                persons.state = data[5];

                //Add object to list
                list.add(persons);
                {
                }
            }
        }
    }


        /*
        Scanner input = null;
        String line = null;

        //Read data from file
        try {
            input = new Scanner(new FileInputStream("C:\\Data\\Database.txt"));

            while ((line ))

        } catch (FileNotFoundException e) {
            System.err.println("No Such File.");
            System.exit(0);
        }

        while (input.hasNextLine()) {
            line = input.nextLine();
            System.out.println(line);
        }
        input.close();
    }
*/
    public void printArray() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
            System.out.println();
        }
    }
}
