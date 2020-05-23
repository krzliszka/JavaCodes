public class NumberToWords{
    public static void numberToWords(int number) {

        int reverseNumber = reverse(number);
        int digitCount = getDigitCount(number);

        if(reverseNumber < 0) {
            System.out.println("Invalid Value");
        } else {

            while(digitCount > 0) {
                switch(reverseNumber % 10) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    default:
                        System.out.println("Invalid Value");
                        break;
                }

                reverseNumber /= 10;
                digitCount--;
            }
        }
    }

    public static int reverse(int number) {

        int reverseNumber = 0;

        while (number != 0) {
            reverseNumber *= 10;
            reverseNumber += number % 10;
            number /= 10;
        }

        return reverseNumber;

    }

    public static int getDigitCount(int number) {

        int digitCount = 0;

        if(number < 0) {
            return -1;
        } else if (number >= 0 && number <= 9) {
            return 1;
        }

        while (number != 0) {
            number /= 10;
            digitCount++;
        }

        return digitCount;
    }
}