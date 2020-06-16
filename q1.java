import java.util.*;

public class q1 extends Main {

      public static void FindPairs(int[] testArray, int targetSum) { // findPairs(testArray, targetSum)

      int StoreArray[]; //
      StoreArray = new int[testArray.length];
      boolean searching = true; // while true loop
      Arrays.sort(testArray); // sorts array from smallest to largest number

       // searching method
       while(searching) {
         for (var i = 0; i < testArray.length; i++) {
           for (var k = i + 1; k < testArray.length; k++) {
             if ((testArray[i] + testArray[k]) == targetSum) { // if ( i loop Array[actual number in array] + k loop Array[actual number in array]) == target number)
               if (StoreArray[0] != testArray[i] && StoreArray[1] != testArray[k]) // check test array  matches with store array
                  if (StoreArray[0] != testArray[k] && StoreArray[1] != testArray[k])
                    System.out.println("(" + testArray[i] + ", " + testArray[k] + ")");
                        StoreArray[0] = testArray[i];
                        StoreArray[1] = testArray[k];
                        searching = false; // stop loop
                 }
              }
           }
        }
    }
}
