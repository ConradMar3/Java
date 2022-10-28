package Book4_page375.Chapter01.InitializingAnArray_page395;


import java.util.Arrays;

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

        System.out.println(Arrays.toString(days));

        // Shorthand java:
        String[] days6 = { "Sunday", "Monday", "Tuesday",
                "Wednesday", "Thursday",
                "Friday", "Saturday" };

        System.out.println(Arrays.toString(days6));

        //Array 'int[]' - Note: (Arrays.toString(primes)); = Converts String '{}' to Arrays '[]'.
        int[] primes = { 2, 3, 5, 7, 11, 13, 17 };
        System.out.println(Arrays.toString(primes));
        //Note: The length of an array created with an initializer is determined by the number
        //of values listed in the initializer.


        //Array 'int[]' - Note: (Arrays.toString(primes)); = Converts String '{}' to Arrays '[]'.
        int[] primes1 = new int[] { 2, 3, 5, 7, 11, 13, 17 };
        System.out.println(Arrays.toString(primes1));
        //To use this type of initializer, you use the new keyword followed by the array type
        //and a set of empty brackets. Then you code the initializer.
    }
}
