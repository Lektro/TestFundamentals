public class StringTest {

    public static void main(String[] args) {

        int count = 0;
        String a = "Lepel";
        String b = "http://www.smartdeveloper.be";
        String c = "De mooie zeeman nam Anne mee zei oom Ed";

        for(int i = 0; i < a.length(); i++) {
            if(a.charAt(i) != ' ')
                count++;
        }
        System.out.println("Total number of characters in the String: " + a + " equals: " + count);


    }
}
