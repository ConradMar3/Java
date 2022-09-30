package Book3_page235.Chapter06.ObjectAsType.Book04_StringsArraysCollections.Chapter01.ReviewingStrings_page376;

public class Strings {
    public static void main(String[] args) {
        String line1 = "Oh what a beautiful morning!";
        String line2 = line1 + "\nSure!";

        // » You can combine, or concatenate, strings by using the + operator, like this:
        // String line2 = line1 + “\nOh what a beautiful day!”;

        // » You can also use the += operator with strings, like this:
        // line2 += “\nI’ve got a beautiful feeling”;

        System.out.println(line1 + " " + line2);

        // » When a primitive type is used in a concatenation expression, Java automatically
        //  converts the primitive type to a string. Thus, Java allows the following:
        int empCount = 50;
        String msg = "Number of employees: " + empCount;

        System.out.println(msg);

        // » The various primitive wrapper classes (such as integer and double) have
        // parse methods that can convert string values to numeric types. Here’s an
        // example:
        String s = "50";
        int i = Integer.parseInt(s);

        System.out.println(i + " " + s);

        // » You can’t compare strings by using the equality operator (==). Instead, you
        // should use the .equals method. Here’s an example:
        String lastName = "Maré";
            if(lastName.equals("Maré"))
                System.out.println("Yes, I'm the last of my family blood-line!");

        // » The String class also has an equalsIgnoreCase method that compares
        // strings without considering case. Here’s an example:
        if (lastName.equalsIgnoreCase("maré"))
            System.out.println("This is me again!");
    }
}
