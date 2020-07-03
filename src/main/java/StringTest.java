public class StringTest {

    public static void main(String[] args) {

        int countA = 0;
        int vowelsA = 0;
        int countB = 0;
        int countC = 0;


        String a = "Lepel";
        String b = "http://www.smartdeveloper.be";
        String c = "De mooie zeeman nam Anne mee zei oom Ed";

        a = a.toLowerCase();

        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                ++vowelsA;
            }

            System.out.println("Total number of vowels in String: " + a + " equals: " + countA);
            System.out.println();

            for (int j = 0; j < b.length(); j++) {
                if (b.charAt(j) != ' ')
                    countB++;
            }
            System.out.println("Total number of characters in String: " + b + " equals: " + countB);
            System.out.println("Is this URL valid: " + !ValidateUrl.validateURL(b));

            for (int k = 0; k < b.length(); k++) {
                if (c.charAt(k) != ' ')
                    countC++;
            }
            System.out.println("Total number of characters in the String: " + c + " equals: " + countC);


        }
    }
}
