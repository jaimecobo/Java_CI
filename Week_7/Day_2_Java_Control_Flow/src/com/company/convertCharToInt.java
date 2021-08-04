package com.company;

public class convertCharToInt {
    public static int converter(String petName) {
        int num01 = 0;
        int num02 = 0;
        char character;
        if (petName.length() >= 2) {
            for (int i = petName.length()-1; i > petName.length()-3; i--) {
                character = Character.toUpperCase(petName.charAt(i));
//                System.out.println("the char " + i + " is " + character);
                switch (character) {
                    case '0':
                        num01 = 0;
                        break;
                    case '1':
                    case 'S':
                    case 'J':
                    case 'A':
                        num01 = 1;
                        break;
                    case '2':
                    case 'T':
                    case 'K':
                    case 'B':
                        num01 = 2;
                        break;
                    case '3':
                    case 'C':
                    case 'U':
                    case 'L':
                        num01 = 3;
                        break;
                    case '4':
                    case 'V':
                    case 'M':
                    case 'D':
                        num01 = 4;
                        break;
                    case '5':
                    case 'W':
                    case 'N':
                    case 'E':
                        num01 = 5;
                        break;
                    case '6':
                    case 'X':
                    case 'O':
                    case 'F':
                        num01 = 6;
                        break;
                    case '7':
                    case 'Y':
                    case 'P':
                    case 'G':
                        num01 = 7;
                        break;
                    case '8':
                    case 'Z':
                    case 'Q':
                    case 'H':
                        num01 = 8;
                        break;
                    case '9':
                    case 'R':
                    case 'I':
                        num01 = 9;
                        break;
                    default:
                        num01 += 10;
                        break;
                }
                num02 += num01;
            }
        }else num02 = 11;
//        System.out.println("Num02 = " + num02);
        return num02;
    }
}

