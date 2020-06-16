import java.util.*;

public class q2 extends Main {

      public static void StringSample(String StringSample) {
          System.out.println(isPalindrome(StringSample)); // prints out checked string
      }

      static boolean isPalindrome(String str) {
           for(int lett = 0; lett < str.length() / 2; lett++) {   //Rounds down if the string is odd. the center is irrelevent to Palindromes.
               if(str.charAt(lett) != str.charAt(str.length() - lett - 1)) { //Checks the first and last characters if they are identical, immediately returns false once unidentical
                   return false;
               }
           }
           return true; //Returns true if it does not detect any nonidendical characters
         }

}
