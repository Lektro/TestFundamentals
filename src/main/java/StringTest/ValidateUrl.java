package StringTest;

import java.net.URL;

public class ValidateUrl extends Exc2StringTestMain {

    static boolean isValid(String url) {
        /*
        Applausje!
         */
        try {
            new URL(url).toURI();
            return true;
        }
        catch (Exception e){
            return false;
        }
    }
}
