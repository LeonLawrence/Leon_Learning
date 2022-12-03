package java_learning_archive.Exercises.Exercise_14_Sum_Odds;

public class SumOdd {
    public static boolean isOdd(int number) {
      if (number > 0 && number % 2 != 0) {
          return true;
      }
      return false;
    }

    public static int sumOdd(int start, int end) {

        int sum = 0;

      if (start > 0 && end > 0 && start <= end) {
          // Check to see if number is odd;
          for (int i = start; i <= end; i++) {
              if (isOdd(i)) {
//                  System.out.println("The number is: " + i);
                  sum += i;
              }
          }
          return sum;
      }
        return - 1;
    }
}
