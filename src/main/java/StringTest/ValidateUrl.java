package StringTest;

import StringTest.Exc2StringTestMain;

import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUrl extends Exc2StringTestMain {
    static boolean isValid(String url) {
        try {
            new URL(url).toURI();
            return true;
        }
        catch (Exception e){
            return false;
        }

    }
}
