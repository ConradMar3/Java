package Book3_page235.Chapter06.ObjectAsType.Book04_StringsArraysCollections.Chapter02.InitializingAnArray_page395;


public class DaysOfTheWeek {
    public static void main(String[] args) {
       String[] days = new String[7];
        days[0] = "Sunday";
        days[1] = "Monday";
        days[2] = "Tuesday";
        days[3] = "Wednesday";
        days[4] = "Thursday";
        days[5] = "Friday";
        days[6] = "Saturday";

// Shorthand java:
        String[] days6 = { "Sunday", "Monday", "Tuesday",
                "Wednesday", "Thursday",
                "Friday", "Saturday" };


        int[] primes = { 2, 3, 5, 7, 11, 13, 17 };
        //Note: The length of an array created with an initializer is determined by the num-
        //ber of values listed in the initializer.

        int[] primes1 = new int[] { 2, 3, 5, 7, 11, 13, 17 };
        //To use this type of initializer, you use the new keyword followed by the array type
        //and a set of empty brackets. Then you code the initializer.

    }
}
