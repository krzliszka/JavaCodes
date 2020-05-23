package com.company;

public class Main {

    public static void main(String[] args) {
//
//        int count = 1;
//        while(count !=6) {
//            System.out.println("Count value is " + count);
//            count++;
//        }
////identical for loop
////        for(int i=1;i<=5;i++) {
////            System.out.println("Count value is " + i);
////        }
//        count=1;
//        while(true) {
//            if(count == 6) {
//                break;
//            }
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        count =6;
//        do {
//            System.out.println("Count value was " + count);
//            count++;
//
//            if(count>100) {
//                break;
//            }
//        } while(count!=6);

        System.out.println(isEvenNumber(2));
        System.out.println(isEvenNumber(412));
        System.out.println(isEvenNumber(-3));

        int number=4;
        int finishNumber=20;
        while(number<= finishNumber) {
            number++;
            if(!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number " + number);
        }
        //modified challenge (executing until found 5 even numbers
        number=4;
        finishNumber=20;
        int evenNumberCount=0;
        while(number<= finishNumber) {
            number++;
            if(!isEvenNumber(number)) {
                continue;
            }
            evenNumberCount++;
            System.out.println("Even number " + number);
            if(evenNumberCount==5) {
                break;
            } else {
                continue;
            }
        }
        System.out.println("Total number of even numbers found = " + evenNumberCount);

       }
    public static boolean isEvenNumber(int number) {
        if(number%2==0) {
            return true;
        } return false;
    }
}
