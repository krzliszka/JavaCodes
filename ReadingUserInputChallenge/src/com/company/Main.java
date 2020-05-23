package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberCounter = 0;
        int sum = 0;

//        while(true) {
        while(numberCounter<10) {
            int order = numberCounter+1;
            System.out.println("Enter number #" + order + ":");

            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt) {
                int number = scanner.nextInt();
                numberCounter++;
                sum += number;
//                if(numberCounter == 10) {
//                    break;
//                }
            } else {
                System.out.println("Invalid number");
            }
            scanner.nextLine(); // handle end of line (enter key)
        }
        System.out.println("Sum = " + sum);
        scanner.close();
    }

//        Scanner scanner = new Scanner(System.in);
//
//        int numberCount = 0;
//        int sum=0;
//        boolean hasNextInt = scanner.hasNextInt();
//
//        if(hasNextInt) {
//            while (numberCount <= 10) {
//                System.out.println("Enter number #" + numberCount + ": ");
//                int number = scanner.nextInt();
//                scanner.nextLine();
//                sum += number;
//                numberCount++;
//            }
//            System.out.println("Sum of 10 entered numbers is equal to = " + sum);
//        } else {
//            System.out.println("Invalid Value");
//        }
//        scanner.close();
//    }
}
