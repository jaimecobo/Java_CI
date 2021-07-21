package com.company;

import java.util.Arrays;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double[] numbersArray = {1, 2.5, 3, 4, 5.27};
        System.out.println("This is the given Array: " + Arrays.toString(numbersArray) );
        double sum = 0;
        for(double number : numbersArray){
            sum += number;
        }
        System.out.println(("The sum of all of the elements in " + Arrays.toString(numbersArray) + " is equal to " + sum));

        System.out.println(("##################################################"));
        System.out.print("The output of \'What is the output?\' is: ");
        whatIsTheOutPut();

        System.out.println(("##################################################"));
        System.out.print("\'toPower\' method returns: " +Arrays.toString(toPower(8, 3)));


    }

    public static void whatIsTheOutPut() {
        double[ ] exampleArray = {1,5,6,5,4,1};
        double maximum = exampleArray[0];
        int index = 0;
        for (int i = 1; i<exampleArray.length; i++){
            if (exampleArray[ i ] > maximum) {
                maximum = exampleArray[ i ];
                index = i;
            };
        };
        System.out.println(index);
    }

    public static int[] toPower(int size, int power) {
        int[] newArray = new int[size];
        int index = 0;
        for(int element : newArray) {
            newArray[index] = (int) Math.pow(index, power);
            index++;
        }

        return newArray;

    }


}
