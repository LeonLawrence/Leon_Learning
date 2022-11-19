package java_programming_masterclass.java_learning.archive.Exercises.Exercise_11_Playing_Cat;

public class Main {

    public static void main(String[] args) {
        PlayingCat playingCat = new PlayingCat();

        System.out.println(playingCat.isCatPlaying(true, 10));
        System.out.println(playingCat.isCatPlaying(false, 36));
        System.out.println(playingCat.isCatPlaying(false, 35));


    }
}
