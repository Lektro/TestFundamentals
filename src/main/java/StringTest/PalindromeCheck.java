package StringTest;

public class PalindromeCheck extends Exc2StringTestMain {
    static boolean isPalindrome(String str){
        /** Pointers pointing to the beginning and the end of the string */

        int i = 0, j = str.length() - 1;

        /** while there are chars to compare */
        while (i < j) {

            /** if there is a mismatch return false */
            if (str.toLowerCase().charAt(i) != str.toLowerCase().charAt(j))
                return false;

            /**  Increment first pointer and decrement the other */
            i++;
            j--;
        }

        /** returns result as boolean once a palindrome is found */
        return true;
    }
}
