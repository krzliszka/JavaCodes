import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        long avg = 0;
        int counter=0;

        while(true) {
            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt) {
                int number = scanner.nextInt();
                sum+=number;
                counter++;
                avg = Math.round((double)sum/(counter));
            } else {
                break;
            }
            scanner.nextLine(); // handle enter key
        }
        System.out.println("SUM = " + sum + " AVG = " + avg);
        scanner.close();
    }
}
