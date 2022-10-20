package java_programming_masterclass.java_learning.Exercises.Exercise_11_Playing_Cat;

public class PlayingCat {

    public boolean isCatPlaying(boolean summer, int temperature) {

        if (!summer && (temperature >= 25 && temperature <=35)) {
            return true;
        } else if (summer && (temperature >= 25 && temperature <= 45)) {
            return true;
        } else {
            return false;
        }
    }

//    public static boolean isCatPlaying (boolean summer, int temperature) {
//        return ((summer) && (temperature >= 25 && temperature <= 45)) || ((!summer) && (temperature >= 25 && temperature <= 35));
//    }
}
