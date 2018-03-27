package org.launchcode;

import java.util.Scanner;

public class MiniNet {
    //Created by Charles Galea (March 2018)

    public MiniNet() {
    }

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        Array array = new Array();
        array.loadArray();
        array.printArray();


        Driver menu = new Driver();
        menu.displayMenu();

    }
}

