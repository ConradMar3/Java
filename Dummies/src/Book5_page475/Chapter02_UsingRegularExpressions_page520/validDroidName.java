package Book5_page475.Chapter02_UsingRegularExpressions_page520;

public class validDroidName {
    private static boolean validDroidName(String droid) {
        String regex = "(\\w\\d-\\w\\d)|(\\w-\\d\\w\\w)";
        return droid.matches(regex);
    }

    public static void main(String[] args) {
        String s = "One:Two;Three|Four\tFive";
        String regex = "[:;|\\t]";
        String strings[] = s.split(regex);
        for (String word : strings)
            System.out.println(word);
    }
}
