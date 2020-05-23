public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if(number>=0) {
            int firstDigit = 0;
            int lastDigit=number%10;
            while(number != 0) {
                firstDigit = number;
                number /=10;
            }
            return firstDigit+lastDigit;
        } else {
            return -1;
        }
    }
}
