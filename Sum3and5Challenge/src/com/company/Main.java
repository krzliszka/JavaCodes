package com.company;

public class Main {

    public static void main(String[] args) {
        int sumCount = 0;
        int sum = 0;
        for(int i=1; i<=1000;i++) {
            if(i%3==0 && i%5==0) {
                System.out.println(i + " can be divided by 3 and 5!");
                sumCount++;
                sum+=i;

            }
            if(sumCount ==5) {
                System.out.println("Exiting the loop");
                break;
            }
        }
        System.out.println("Sum of " + sumCount + " numbers which can be divided by 3 and also by 5 is equal to = " +sum);
    }
}
