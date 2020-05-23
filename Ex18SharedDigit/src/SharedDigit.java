public class SharedDigit {
    public static boolean hasSharedDigit(int number1, int number2) {
        if (number1 < 10 || number1 > 99 || number2 < 10 || number2 > 99) {
            return false;
        } else {
            int leftN1 = number1/10;
            int rightN1 = number1%10;
            int leftN2 = number2/10;
            int rightN2 = number2%10;
            if(leftN1 == leftN2 || leftN1 == rightN2 || rightN1 == leftN2 || rightN1 == rightN2) {
                return true;
            } else {
                return false;
            }
        }
    }
}

