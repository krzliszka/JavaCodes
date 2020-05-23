public class IntEqualityPrinter {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";
    public static void printEqual(int param1, int param2, int param3) {
        if(param1 < 0 || param2 < 0 || param3 < 0) {
            System.out.println(INVALID_VALUE_MESSAGE);
        } else if(param1==param2 && param1==param3) {
            System.out.println("All numbers are equal");
        } else if(param1!=param2 && param1 != param3 && param2 != param3) {
            System.out.println("All numbers are different");
        } else
        System.out.println("Neither all are equal or different");
    }
}
