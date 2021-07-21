package com.company;

import java.util.*;

public  class DataStructures_1 {
    public static void main(String[] args){
        ArrayList<Double> doublesArrayList = new ArrayList<Double>(5);
        for(int i=0; i < 5; i++){
//        for(Double number: doublesArrayList){
            Scanner userInput = new Scanner(System.in);
            System.out.println("Please enter a number: ");
            doublesArrayList.add(Double.parseDouble(userInput.nextLine()));
        }
        double number = 0;
        for(int i=0; i < doublesArrayList.size(); i++){
            number += doublesArrayList.get(i);
        }
        System.out.println("The sum of all of the elements is: " + number);
        number = 1;
        for(int i=0; i < doublesArrayList.size(); i++){
            number = number * doublesArrayList.get(i);
        }
        System.out.println("The product of all of the elements is: " + number);
        number = 0;
        for(int i=0; i < doublesArrayList.size(); i++){
            if(doublesArrayList.get(i) > number){
                number = doublesArrayList.get(i);
            }
        }
        System.out.println("The largest number of all of the elements is: " + number);

        number = doublesArrayList.get(0);
        for(int i=0; i < doublesArrayList.size(); i++){
            if(doublesArrayList.get(i) < number){
                number = doublesArrayList.get(i);
            }
        }
        System.out.println("The smallest number of all of the elements is: " + number);

        System.out.println("###################################################################");
        //create a hash map of vehicles:
        //The model is the Key, the make is the Value
        HashMap<String, String> vehicles = new HashMap<>();

        vehicles.put("COROLLA", "Toyota");
        vehicles.put("LAND CRUISER", "Toyota");
        vehicles.put("CIVIC", "Honda");
        vehicles.put("PILOT", "Honda");
        vehicles.put("MODEL S", "Tesla");
        vehicles.put("CYBERTRUCK", "Tesla");
        vehicles.put("MUSTANG", "Ford");
        vehicles.put("BRONCO", "Ford");

        Scanner modelInput = new Scanner(System.in);
        System.out.println("Welcome! I am a virtual assistant, please tell me What car model are you looking for: ");
        String model = modelInput.nextLine().toUpperCase();
        if(vehicles.containsKey(model)){
            System.out.println("Oh, you\'re looking for a " + model + "? Our " + vehicles.get(model) + " selection is right over here...");
        }else{
            System.out.println("We run out of " + model + "s right now, dude those cars are on fire!");
        }




    }

}
