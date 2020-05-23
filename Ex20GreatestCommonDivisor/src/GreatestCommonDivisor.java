public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second) {
        if(first<10 || second<10) {
            return -1;
        } else {
            do {
                if(first>second) {
                     first=first-second;
                } else if(second>first){
                     second = second-first;
                }
            } while(first!=second);
        } return first;
    }
}
