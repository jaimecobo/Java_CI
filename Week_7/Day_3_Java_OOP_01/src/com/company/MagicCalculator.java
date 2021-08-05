package com.company;

public class MagicCalculator extends Calculator{
    public static double findSquareRoot(double number){
        return Math.sqrt(number);
    }

    public static double findSine(double number){
        return Math.sin(number);
    }

    public static double findCosine(double number){
        return Math.cos(number);
    }

    public static double findTangent(double number){
        return Math.tan(number);
    }

    public static double findFactorial(double number){
        if(number < 0)
            return -1;
        else if(number == 0)
            return 1;
        else
            number = (number * findFactorial(number - 1));

        return number;

    }


}
