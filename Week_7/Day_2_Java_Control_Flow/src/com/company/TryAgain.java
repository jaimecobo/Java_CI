package com.company;

import java.util.Scanner;

public class TryAgain {

    public static void oneMoreTime(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter \"Yes\" if you would like to complete a new survey an generate a new set of lucky numbers?");
        String answer = input.nextLine().toUpperCase();
        if(answer.equals("YES")){
            System.out.println("Do you have a red car? (yes, no):");
            HelloName.redCar = HelloName.checkYesOrNO(input.nextLine().toUpperCase());
            System.out.println("What is the name of your favorite pet?");
            HelloName.petName = input.nextLine().toUpperCase();
            System.out.println("How old is your favorite pet? if it is younger than 1 year, please enter 1");
            HelloName.checkPetAge(input.nextLine());
            System.out.println("What is your lucky number? between 1 and 2147483646");
            HelloName.checkLuckyNumber(input.nextLine());
            System.out.println("Do you have a favorite quarterback?  If so please enter his jersey number: / Otherwise please enter 0");
            HelloName.checkJerseyNumber(input.nextLine());
            System.out.println("What year was you car made?, 2 digits please!");
            HelloName.checkYearMade(input.nextLine());
            System.out.println("What is the first name of the your favorite actor or actress?");
            HelloName.actName = input.nextLine().toUpperCase();
            System.out.println("Please enter a number between 1 and 50");
            HelloName.checkRandomNumber(input.nextLine());

//            System.out.println("These is what you just entered: ");
//            System.out.println("redCar= " + redCar + ", petName= " + petName + ", petAge= " + petAge + ", luckyNumber= " + luckyNumber +
//                    ", jerseyNumber= " + jerseyNumber + ", carYearMade= " + carYearMade + ", Favorite actor or actress' name= " + actName +
//                    ", Number between 1 & 50 = " + randNumber);
            LotteryNumbers.magicBall(HelloName.jerseyNumber, HelloName.luckyNumber);
            LotteryNumbers.ballsValues01(convertCharToInt.converter(HelloName.petName));
            LotteryNumbers.ballsValues02(HelloName.randNumber);
            LotteryNumbers.ballsValues03(HelloName.carYearMade, HelloName.petAge);
            LotteryNumbers.ballsValues04(HelloName.actName);
            LotteryNumbers.ballsValues05(42);

        }else System.out.println("Your entry wasn't a \"Yes\", we absolutely understand it, and wish you the best of lucks with your new lottery numbers.");
    }
}
