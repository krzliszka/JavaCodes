package com.company;

public class Main {

    public static void main(String[] args) {

        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();

        double cent = calcFeetAndInchesToCentimeters(6,3);
        if(cent < 0.0) {
            System.out.println("Invalid parameters");
        }
        calcFeetAndInchesToCentimeters(157);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if(feet>=0 && inches >= 0 && inches <=12) {
            double centimeter = ((feet*12)*2.54)+(2.54*inches);
            System.out.println(feet + " feet, " + inches + " inches = " + centimeter + " cm");
            return centimeter;
        } else {
            System.out.println("Invalid feet or inches parameters...");
            return -1;}
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if(inches >=0) {
            double feet = (int)inches/12;
            double remaindedInches = inches % 12;
            System.out.println(inches + " inches is equal to " + feet + " feet and " + remaindedInches + " inches");
            return calcFeetAndInchesToCentimeters(feet,remaindedInches);
        } else return -1;
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score.");
        return 0;
    }

}
