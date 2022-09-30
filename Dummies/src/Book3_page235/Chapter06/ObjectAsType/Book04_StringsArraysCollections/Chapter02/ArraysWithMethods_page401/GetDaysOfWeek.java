package Book3_page235.Chapter06.ObjectAsType.Book04_StringsArraysCollections.Chapter02.ArraysWithMethods_page401;

public class GetDaysOfWeek {
    public static String[] getDaysOfWeek() {
        String[] days = {"Sunday", "Monday", "Tuesday",
                "Wednesday", "Thursday",
                "Friday", "Saturday"};
        return days;
    }

    public static void printStringArray(String[] strings) {
        for (String s : strings)
            System.out.println(s);


        String[] days = getDaysOfWeek();

        printStringArray(days);

    }
}
