public class LastDigitChecker {

    public static boolean isValid(int number) {
        if(number>=10 && number <=1000) {
            return true;
        } return false;
    }
    public static boolean hasSameLastDigit(int a, int b, int c) {
        if (a < 10 || a > 1000 || b < 10 || b > 1000 || c < 10 || c > 1000) {
            return false;
        } else {
            int count = 0;
            int lastDigitA = 0;
            int lastDigitB = 0;
            int lastDigitC = 0;
            while (true) {
                lastDigitA = a % 10;
                lastDigitB = b % 10;
                lastDigitC = c % 10;
                if (lastDigitA == lastDigitB || lastDigitA == lastDigitC || lastDigitB == lastDigitC) {
                    count++;
                    if (count == 2) {
                        break;
                    }
                } else return false;
            } return true;
        }
    }
}

