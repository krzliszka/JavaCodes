package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(125));
        System.out.println(sumDigits(133));
        System.out.println(sumDigits(2));
        System.out.println(sumDigits(-2));
    }

    public static int sumDigits(int number) {
        int digitsSum=0;
        if(number>=10) {
            while(number >0) {
                //extract the least-significant digit
                int digit = number%10;
                digitsSum+=digit;

                //drop the least-significant digit
                number/=10;         //same as number = number/10
            }
            return digitsSum;
        } return -1;
    }
}
