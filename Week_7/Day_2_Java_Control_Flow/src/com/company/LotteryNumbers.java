package com.company;
import java.util.Arrays;
import java.util.Random;

public class LotteryNumbers {

    final static int numOfLottoBalls = 5;
//    final static int minBall = 1;
    final static int max_nonMagicBall = 65;
    final static int maxMagicBall = 75;
    static int MagicBallItSelf = 0;
    static int[] lottoArray = new int[numOfLottoBalls];


        public static void magicBall(int j_number, int l_number){
            if(l_number > 99){
                l_number = 99;
            }
            int magicBall;
            Random rand = new Random();
            if((j_number%2==0) && (l_number%2 != 0)){
                magicBall = rand.nextInt(maxMagicBall)+1;
                magicBall += j_number - l_number;
                if(magicBall > maxMagicBall){
                    magicBall(j_number, l_number);
                }else MagicBallItSelf = Math.abs(magicBall);
            }else{
                magicBall = rand.nextInt(maxMagicBall)+1;
                magicBall += l_number - j_number;
                if(magicBall > maxMagicBall){
                    magicBall(j_number, l_number);
                }else MagicBallItSelf = Math.abs(magicBall);
            }
//            System.out.println("Only magicBall = " + Arrays.toString(lottoArray));

        }

        public static void ballsValues01(int number){
            Random rand = new Random();
            int ball = rand.nextInt(max_nonMagicBall)+1;
            ball = ball + number;
            ball = ball / number;
//            System.out.println("ball is = " + ball);
            if(ball == 0){
                ball = rand.nextInt(16)+1;
//                System.out.println("Now ball is = " + ball);
            }
            else lottoArray[0] = ball;
//            System.out.println("Ball one + magicBall " + Arrays.toString(lottoArray));

        }

        public static void ballsValues02(int number){
            Random rand = new Random();
            int ball = rand.nextInt(max_nonMagicBall)+1;
            ball = ball + number;
            ball = ball / 2;
            ball = ball + 3;
            if(ball == 0){
                ball = rand.nextInt(36-10)+10;
            }
            else lottoArray[1] = ball;
//            System.out.println("Ball one + Ball two + magicBall " + Arrays.toString(lottoArray));
        }

    public static void ballsValues03(int number01, int numnber02){
        Random rand = new Random();
        int ball = 0;
        ball = ball + number01 + numnber02;
        if(ball <=65){
            lottoArray[2] = ball;
        }
        else if(ball<=100){
            ball = rand.nextInt(20)+1;
           lottoArray[2] = ball;
        }
        else if(ball<=150){
            ball = rand.nextInt(40-21) + 21;
            lottoArray[2] = ball;
        }
        else if(ball > 151){
            ball = rand.nextInt(65-41) + 41;
            lottoArray[2] = ball;
        }

//        System.out.println("Ball one + Ball two + Ball three + magicBall " + Arrays.toString(lottoArray));
    }

    public static void ballsValues04(String name){
            Random rand = new Random();
            int ball = 1;
            if(name.length() < 2){
                ball = 13;
            }
            else if((name.length() >= 3) && (name.length() <=5)){
                ball = 31;
            }
            else if(name.length() >= 6 ){
                if(name.charAt(6) == 'A' || name.charAt(6) == 'E' || name.charAt(6) == 'I' || name.charAt(6) == 'O' || name.charAt(6) == 'U'){
                    ball = 43;
                }else ball = 61;
            }
            ball = ball * max_nonMagicBall;
            ball = ball / maxMagicBall;
            if(ball <= 0){
                ball = rand.nextInt(56-36)+36;
            }else lottoArray[3] = ball;
//        System.out.println("Ball one + Ball two + Ball three + Ball four + magicBall " + Arrays.toString(lottoArray));
    }

    public static void ballsValues05(int number){
        Random rand = new Random();
        int ball = 0;
        int num1 = rand.nextInt(max_nonMagicBall)+1;
        int num2 = rand.nextInt(max_nonMagicBall)+1;
        num1 *= num2;
        ball = num1 / number;
        if(ball == 0){
            ball = rand.nextInt(65-31)+31;
        }
        else lottoArray[4] = ball;
//        System.out.println("Ball_one + Ball_two + Ball_three + Ball_four + Ball_five + MagicBall " + Arrays.toString(lottoArray));
        Arrays.sort(lottoArray);
        System.out.println(("Lottery numbers: " + lottoArray[0] + ", " + lottoArray[1] + ", " + lottoArray[2] + ", " +
                lottoArray[3] + ", " + lottoArray[4] + " Magic Ball: "  + MagicBallItSelf));
    }

}
