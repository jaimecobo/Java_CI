package com.company;

import java.util.Scanner;



public class HelloName {
    public static void scanNameSayHello(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = input.nextLine().toUpperCase();
        System.out.println("HELLO " + name + "!");
    }

    static int petAge;
    static int luckyNumber;
    static int jerseyNumber;
    static int carYearMade;
    static int randNumber;
    static String redCar;
    static String petName;
    static String actName;

    public static void keepAsking(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 'Yes' if you want to continue: ");
        String answer = input.nextLine().toUpperCase();
//        System.out.println(answer);
//        String redCar;
//        String petName;
//        String actName;
        if(answer.equals("YES")){
            System.out.println("Do you have a red car? (yes, no):");
            redCar = checkYesOrNO(input.nextLine().toUpperCase());
            System.out.println("What is the name of your favorite pet?");
            petName = input.nextLine().toUpperCase();
            System.out.println("How old is your favorite pet? if it is younger than 1 year, please enter 1");
            checkPetAge(input.nextLine());
            System.out.println("What is your lucky number? between 1 and 2147483646");
            checkLuckyNumber(input.nextLine());
            System.out.println("Do you have a favorite quarterback?  If so please enter his jersey number: / Otherwise please enter 0");
            checkJerseyNumber(input.nextLine());
            System.out.println("What year was you car made?, 2 digits please!");
            checkYearMade(input.nextLine());
            System.out.println("What is the first name of the your favorite actor or actress?");
            actName = input.nextLine().toUpperCase();
            System.out.println("Please enter a number between 1 and 50");
            checkRandomNumber(input.nextLine());

//            System.out.println("These is what you just entered: ");
//            System.out.println("redCar= " + redCar + ", petName= " + petName + ", petAge= " + petAge + ", luckyNumber= " + luckyNumber +
//                    ", jerseyNumber= " + jerseyNumber + ", carYearMade= " + carYearMade + ", Favorite actor or actress' name= " + actName +
//                    ", Number between 1 & 50 = " + randNumber);
            LotteryNumbers.magicBall(jerseyNumber, luckyNumber);
            LotteryNumbers.ballsValues01(convertCharToInt.converter(petName));
            LotteryNumbers.ballsValues02(randNumber);
            LotteryNumbers.ballsValues03(carYearMade, petAge);
            LotteryNumbers.ballsValues04(actName);
            LotteryNumbers.ballsValues05(42);

        }else System.out.println("Please return later to complete the survey.");

    }

    public static String checkYesOrNO(Object obj){
        String str;
        Scanner input = new Scanner(System.in);
        if(obj instanceof String) {
            str = obj.toString();
            if ((!str.equals("YES")) && (!str.equals("NO"))) {
                System.out.println("Please try again, enter \"Yes\" or \"No\"");
                str = input.nextLine().toUpperCase();
                checkYesOrNO(str);
            }
        }else {
            System.out.println("Please try again, enter \"Yes\" or \"No\"");
            str = input.nextLine().toUpperCase();
            checkYesOrNO(str);
        }

        return str;
    }

    public static void checkPetAge(String petAgeString){
        Scanner input = new Scanner(System.in);
        int number01 = tryParse(petAgeString);
        if (number01 == 0) {
            System.out.println(("You entered an invalid value, then 0 will be!"));
            petAge = 0;
        }
        else if((number01 > 0) && (number01 <= 511)){
//            System.out.println("Thank you!, you entered " + number01);
            petAge = number01;
        }
//        else if((number01 < 0) || (number01 > 511)) {
        else{
            System.out.println("Your input is invalid, please try again");
            petAgeString = input.nextLine();
            checkPetAge(petAgeString);
        }

    }

    public static void checkLuckyNumber(String luckyNum){
        Scanner input = new Scanner(System.in);
        int number02 = tryParse(luckyNum);
        if (number02 == 0) {
            System.out.println(("You entered an invalid value, then 0 will be!"));
            luckyNumber = 0;
        }
        else if((number02 > 0) && (number02 <= 2147483646)){
//            System.out.println("Thank you!, you entered " + number02);
            luckyNumber = number02;
        }

//        else if((number02 < 0) || (number02 > 2147483646)) {
        else{
            System.out.println("Your input is invalid, please enter a number greater than 0 and lower than 2147483647");
            luckyNum = input.nextLine();
            checkLuckyNumber(luckyNum);
        }
    }

    public static void checkJerseyNumber(String j_number){
        Scanner input = new Scanner(System.in);
        int number03 = tryParse(j_number);
        if(number03 == 0){
            System.out.println("You have no favorite quarterback, and entered 0");
            jerseyNumber = 0;
        }
        else if((number03 > 0) && (number03 <= 99)){
//            System.out.println("Thank you!, you entered " + number03);
            jerseyNumber = number03;
        }

//        else if ((number03 < 0) || (number03 > 100)) {
        else{
            System.out.println("Your entered an invalid jersey number, please try again");
            j_number = input.nextLine();
            checkJerseyNumber(j_number);
        }
    }

    public static void checkYearMade(String carYear){
        Scanner input = new Scanner(System.in);
        int number04 = tryParse(carYear);
        if (number04 == 0) {
            System.out.println(("You entered an invalid value, then 0 will be!"));
            carYearMade = 0;
        }
        else if((number04 > 0) && (number04 <= 99)){
//            System.out.println("Thank you!, you entered " + number04);
            carYearMade = number04;
        }

//        else if((number04 < 0) || (number04 > 99)) {
        else{
            System.out.println("Your entered an invalid format, please try again");
            carYear = input.nextLine();
            checkYearMade(carYear);
        }
    }

    public static void checkRandomNumber(String randNumb){
        Scanner input = new Scanner(System.in);
        int number05 = tryParse(randNumb);
        if (number05 == 0) {
            System.out.println(("You entered an invalid value, then 0 will be!"));
            randNumber = 0;
        }

        else if((number05 > 0) && (number05 <= 50)){
//            System.out.println("Thank you!, you entered " + number04);
            randNumber = number05;
        }
//        else if((number05 < 0) || (number05 > 50)) {
        else {
            System.out.println("Your entered an invalid number, please try again, select a number between 1 & 50");
            randNumb = input.nextLine();
            checkRandomNumber(randNumb);
        }
    }


    public static int tryParse(String text) {
        try {
            return Integer.parseInt(text);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

}
