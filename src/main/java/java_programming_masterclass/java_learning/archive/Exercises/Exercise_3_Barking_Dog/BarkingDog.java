package java_programming_masterclass.java_learning.archive.Exercises.Exercise_3_Barking_Dog;

public class BarkingDog {

    public boolean shouldWakeUp(boolean barking, int hourOfDay) {

//        Invalid option
        if (!barking || (hourOfDay < 0 || hourOfDay > 23)) {
            return false;
        }
//        Wake the owner if the dog is barking 10pm - 8am;
        if (hourOfDay < 8 || hourOfDay > 22 && barking) {
            return true;
        } else {
            return false; //  not within times
        }
    }
}
