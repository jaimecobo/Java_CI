package com.company;

public class AsciiChars {
    public static void printNumbers()
    {
        // TODO: print valid numeric input
        for(int i = 0; i <= 9; i++){
            if(i == 9){
                System.out.print(i + ".\n");
            }
            else System.out.print(i + ", " );
        }
//        System.out.println("");
    }

    public static void printLowerCase()
    {
        // TODO: print valid lowercase alphabetic input
        for(char character = 'a'; character <= 'z'; character++){
            if(character == 'z'){
                System.out.print(character + ".\n");
            }
            else System.out.print(character + ", " );
        }
//        System.out.println("");
    }

    public static void printUpperCase()
    {
        // TODO: print valid uppercase alphabetic input
        for(char character = 'A'; character <= 'Z'; character++){
            if(character == 'Z'){
                System.out.print(character + ".\n");
            }
            else System.out.print(character + ", " );
        }
//        System.out.println("");
    }
}
