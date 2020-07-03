public class StringTest {

    public static void main(String[] args) {

        int countA = 0;
        int countB = 0;
        int countC = 0;

        String a = "Lepel";
        String b = "http://www.smartdeveloper.be";
        String c = "De mooie zeeman nam Anne mee zei oom Ed";

        for(int i = 0; i < a.length(); i++) {
            if(a.charAt(i) != ' ')
                countA++;
        }
        System.out.println("Total number of characters in the String: " + a + " equals: " + countA);


        for(int i = 0; i < b.length(); i++) {
            if(b.charAt(i) != ' ')
                countB++;
        }
        System.out.println("Total number of characters in the String: " + b + " equals: " + countB);
        System.out.println("Is this URL valid: " + !ValidateUrl.validateURL(b));

        for(int i = 0; i < b.length(); i++) {
            if(c.charAt(i) != ' ')
                countC++;
        }
        System.out.println("Total number of characters in the String: " + c + " equals: " + countC);



    }
}
