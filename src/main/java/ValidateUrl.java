import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUrl extends StringTest {
    static boolean validateURL(String b) {
        String urlRegex = "((http:\\\\/\\\\/|https:\\\\/\\\\/)?(www.)?(([a-zA-Z0-9-]){2,}\\\\.){1,4}([a-zA-Z]){2,6}(\\\\/([a-zA-Z-_\\\\/\\\\.0-9#:?=&;,]*)?)?)";
        Pattern pt = Pattern.compile(urlRegex);
        Matcher matcher = pt.matcher(b);
        return matcher.find();

    }



}
