package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("The addition of 49 & 63 is " + Calculator.add( 49, 63 ));
        System.out.println("The subtraction of 49 & 63 is " + Calculator.subtract( 49, 63 ));
        System.out.println("The multiplication of 49 & 63 is " + Calculator.multiply( 49, 63 ));
        System.out.println("The division of 49 & 63 is " + Calculator.divide( 49, 63 ));
        System.out.println("The square of 63 is " + Calculator.square(63 ));
        System.out.println("The square root of 63 is " + MagicCalculator.findSquareRoot(63 ));
        System.out.println("The sine of 63 is " + MagicCalculator.findSine(63 ));
        System.out.println("The cosine of 63 is " + MagicCalculator.findCosine(63 ));
        System.out.println("The tangent of 63 is " + MagicCalculator.findTangent(63 ));
        System.out.println("The factorial of 63 is " + MagicCalculator.findFactorial(63 ));
    }
}
