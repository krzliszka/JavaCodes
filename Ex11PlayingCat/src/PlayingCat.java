public class PlayingCat {

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if((temperature>=25 && temperature <=35 && !summer)||(summer && temperature>=25 && temperature <=45)) {
            return true;
        } return false;
    }
}
