package com.company;

public class Calculator {

    public static int add(int num01, int num02){
        num01 += num02;
        return num01;
    }


    public static int subtract(int num01, int num02){
        return num01 - num02;
    }

    public static int multiply(int num01, int num02){
        return num01 * num02;
    }
    public static float divide(float num01, float num02){
        return num01 / num02;
    }
    public static int square(int num01){
        return num01 * num01;
    }

}
