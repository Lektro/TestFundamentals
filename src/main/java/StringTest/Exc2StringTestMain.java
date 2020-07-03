package StringTest;

import static StringTest.ValidateUrl.isValid;

public class Exc2StringTestMain {

    public static void main(String[] args) {

        /** counters for vowels */
        int countA = 0;
        int countB = 0;
        int countC = 0;

        /** variables predefined by excersise */
        String a = "Lepel";
        String b = "http://www.smartdeveloper.be";
        String c = "\"De mooie zeeman nam Anne mee zei oom Ed\"";

        /** for loop to count the vowels */
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == ' ' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'U' ) {
                countA++;
            }
        }

        /** print results of vowel count */
        System.out.println("Total number of vowels in String: " + a + " is equal to: " + countA);

        /** print result URL check */
        String url1 = a;
            if (isValid(url1))
                System.out.println("This a valid URL!");
            else
                System.out.println("This is not a valid URL!");

        /** if else statement to check the string for a valid palindrome sequence */
        if (PalindromeCheck.isPalindrome(a))
            System.out.println("This is a valid palindrome!");
        else
            System.out.println("This is not a valid palindrome!");

        /** to make the output readable by printing an empty line between the string results */
        System.out.println();


        /** for loop to count the vowels in string b */
        for (int j = 0; j < b.length(); j++) {
            char ch = b.charAt(j);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == ' ' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'U' ) {
                countB++;
            }
        }

        /** print results of vowel count */
        System.out.println("Total number of vowels in String: " + b + " is equal to: " + countB);

        /** print result URL check */
        String url2 = b;
        if (isValid(url2))
            System.out.println("This a valid URL!");
        else
            System.out.println("This is not a valid URL!");

        /** if else statement to check the string for a valid palindrome sequence */
        if (PalindromeCheck.isPalindrome(b))
            System.out.println("This is a valid palindrome!");
        else
            System.out.println("This is not a valid palindrome!");

        /** to make the output readable by printing an empty line between the string results */
        System.out.println();

        /** for loop to count the vowels in string c */
        for (int k = 0; k < c.length(); k++) {
            char ch = c.charAt(k);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == ' ' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'U' ) {
                countC++;
            }
        }

        /** print results of vowel count */
        System.out.println("Total number of vowels in the String: " + c + " is equal to: " + countC);

        /** print result URL check */
        String url3 = c;
        if (isValid(url3))
            System.out.println("This s a valid URL!");
        else
            System.out.println("This is not a valid URL!");
        if (PalindromeCheck.isPalindrome(c))
            System.out.println("This is a valid palindrome!");
        else
            System.out.println("This is not a valid palindrome!");
    }
}



