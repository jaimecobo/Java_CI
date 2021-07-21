package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner userInput = new Scanner(System.in);
        System.out.println(("Please enter your name: "));
        String yourName = userInput.nextLine();
        String name = "Rose";
        String adjective = "great runner";
        String nounOne = "running partner";
        String nounTwo = "next marathon";
        String verbOne;
        int number = 5;

        //If I don't assign a value or I assign and incorrect value to the variable, it says "java: illegal start of expression"
        //String verbTwo = 123;
        //int number = ;
        //int num = "123";

        //string anotherVerb = "study";
            //Error shown:
            // java: cannot find symbol
            // symbol:   class string
            // location: class com.company.Main
        double doubleNum01 = 123.123456;
        //duble doubleNum02 = 456.45;
            //If typo
            //java: cannot find symbol
            //symbol:   class duble
            //  location: class com.company.Main
        double doubleNum02 = 123.321;




        System.out.println("Dear " + name + ", \nYou are a " + adjective + " and I want to be your " + nounOne +
                " I want to go to the " + nounTwo + " with you in " + number + " days\nSincerely,\n" + yourName);
        System.out.println(doubleNum01);
//        System.out.println(doubleNum02);


    }
}
