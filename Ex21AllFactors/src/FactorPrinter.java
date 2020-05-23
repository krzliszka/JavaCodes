public class FactorPrinter {
    public static void printFactors(int number) {
        if(number<1) {
            System.out.println("Invalid Value");
        } else {
           // System.out.println("Printing all factors for " + number);
            for(int i=1;i<=number;i++) {
                if(number%i==0) {
                    System.out.println(i);
                }
            }
        }
    }
}
