package com.company;

public class Main {

    public static void main(String[] args) {

        byte myByteValue = 10;
        short myShortValue = 20;
        int myIntValue = 50;
        long myLongValue = 50000L + 10 * (myByteValue+myIntValue+myShortValue);
        System.out.println("Total = " + myLongValue);

        short shortTotal = (short) (1000 + 19 *
                (myByteValue+myShortValue+myIntValue));
    }
}
