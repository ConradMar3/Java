package Book4_page375.Chapter02.ArraysWithMethods_page401;

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
