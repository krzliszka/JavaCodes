public class NumberPalindrome {

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int remainder = 0;
        int temp=number;
        while(number != 0) {
            remainder = number%10;
            reverse = reverse * 10 + remainder;
            number /=10;
        }

        if(reverse==temp) {
            return true;
        } else {
            return false;
        }
    }
}
