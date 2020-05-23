public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        int sum=0;
        if(bigCount<0 || smallCount <0) {
            return false;
        } else {
            while(bigCount>0) {
                if(sum+5>goal) {
                    break;
                } else {
                    sum+=5;
                    bigCount--;
                    if(sum==goal) {
                        return true;
                    }
                }
            }
            while (smallCount >0) {
                if(sum+1 > goal) {
                    break;
                } else {
                    sum+=1;
                    smallCount--;
                    if(sum==goal) {
                        return true;
                    }
                }
            }
            return false;
        }
    }
}
