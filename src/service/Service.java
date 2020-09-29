package service;

import java.util.Random;
import java.util.Scanner;

public class Service {
    public static void giveValues(int[] giveArray) {

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            switch (i){
                case 0:
                    System.out.println("Choose the first number:");
                    break;
                case 1:
                    System.out.println("Choose the 2nd number: ");
                    break;
                case  2:
                    System.out.println("Choose the 3rd number: ");
                    break;
                case 3:
                case 4:
                    System.out.println("Choose the " + (i + 1) + "th number:");
                    break;
                case 5:
                    System.out.println("Choose the last number.");
            }
            giveArray[i] = scanner.nextInt();
            if (giveArray[i] < 49){

            }else{
                System.out.println("You introduced a wrong number. Please enter a number between 1 and 49: ");
                giveArray[i] = scanner.nextInt();
            }

        }
        System.out.print("Your numbers are: " );

        for(int i = 0; i< 6; i++){
            System.out.print(giveArray[i] + " ");
        }
        System.out.println(" ");

    }

    public static void randomValues(int[] randomArray){
        System.out.println("The randomly chosen numbers are: ");
        for(int i = 0; i<6; i++){
            Random random = new Random();
            randomArray[i] = random.nextInt(49);
            System.out.print(randomArray[i] + " ");
        }
        System.out.println(" ");
    }

    public static void compareNumbers(int[] compareArray1, int[] compareArray2){
        int counter = 0;
        System.out.println("The numbers you guessed are: ");
        for(int i = 0; i<compareArray1.length; i++){
            for(int j = 0; j<compareArray2.length; j++){
                if (compareArray1[i] == compareArray2[j]){
                    counter = counter + 1;
                    System.out.print(compareArray1[i] + " ");
                }
            }
        }
        System.out.println(" ");
        switch (counter){
            case 3:
                System.out.println("You won 200 ron.");
                break;
            case 4:
                System.out.println("You won 1000 ron.");
                break;
            case 5:
                System.out.println("You won 5000 ron.");
                break;
            case 6:
                System.out.println("You won 100000 ron.");
                break;
            default:
                System.out.println("You haven't guessed enough numbers. Please try again.");
        }
    }
}
