package Book5_page475.Chapter02_PatternAndMatcher_page521;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {
    private static Pattern droidPattern;
    private static boolean validDroidName(String droid)
    {
        if (droidPattern == null)
        {
            String regex = "(\\w\\d-\\w\\d)|"
                    + "(\\w-\\d\\w\\w)";
            droidPattern = Pattern.compile(regex);
        }
        Matcher m = droidPattern.matcher(droid);
        return m.matches();
    }
}
