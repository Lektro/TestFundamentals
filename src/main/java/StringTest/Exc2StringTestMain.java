package StringTest;

public class Exc2StringTestMain {

    public static void main(String[] args) {

        /** counters for vowels */
        int countA = 0;
        int countB = 0;
        int countC = 0;

        /** variables predefined by excersise */
        String a = "Lepel";
        String b = "http://www.smartdeveloper.be";
        String c = "De mooie zeeman nam Anne mee zei oom Ed";

        /** to lowercase so I don't have to search for capital letters */
        a = a.toLowerCase();
        b = b.toLowerCase();
        c = c.toLowerCase();

        /** for loop to count the vowels */
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == ' ') {
                countA++;
            }
        }
        /** print result vowel count in string a */
        System.out.println("Total number of vowels in String: " + a + " is equal to: " + countA);

        /** print result URL check */
        System.out.println("Is this a valid URL?: " + !ValidateUrl.validateURL(a));

        /** if else statement to check the string for a valid palindrome sequence */
        if (PalindromeCheck.isPalindrome(a))
            System.out.println("This is a valid palindrome! ");
        else
            System.out.println("This is not a valid palindrome! ");

        /** to make the output readable by printing an empty line between the string results */
        System.out.println();


        /** for loop to count the vowels in string b */
        for (int j = 0; j < b.length(); j++) {
            char ch = b.charAt(j);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == ' ') {
                countB++;
            }
        }

        /** print results */
        System.out.println("Total number of vowels in String: " + b + " is equal to: " + countB);

        System.out.println("Is this a valid URL?: " + !ValidateUrl.validateURL(b));

        /** if else statement to check the string for a valid palindrome sequence */
        if (PalindromeCheck.isPalindrome(b))
            System.out.println("This is a valid palindrome! ");
        else
            System.out.println("This is not a valid palindrome! ");

        /** to make the output readable by printing an empty line between the string results */
        System.out.println();

        /** for loop to count the vowels in string c */
        for (int k = 0; k < c.length(); k++) {
            char ch = c.charAt(k);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == ' ') {
                countC++;
            }
        }

        System.out.println("Total number of vowels in the String: " + c + " is equal to: " + countC);
        System.out.println("Is this a valid URL?: " + !ValidateUrl.validateURL(c));
        if (PalindromeCheck.isPalindrome(a))
            System.out.println("This is a valid palindrome! ");
        else
            System.out.println("This is not a valid palindrome! ");

    }
}



