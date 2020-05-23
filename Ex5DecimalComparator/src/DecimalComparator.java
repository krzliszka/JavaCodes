public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double par1, double par2) {

        par1 = (int)(par1 * 1000);      //we have to use casting (int), because we want numbers up to 3 decimal places
        par2 = (int)(par2 * 1000);      //and we are multiplying it by 1000 to do that - double*int

        if(par1==par2) {return true;}
        else return false;
    }
}
