package Book5_page475.Chapter04_CalculatingDates_page552;

import java.util.*;
import java.time.*;

public class CalculateDate {
    public static void main(String[] args) {

        System.out.println("Today: " + LocalDate.now());
        System.out.println("Tomorrow: " + LocalDate.now().plusDays(1));
        System.out.println("Next week: " + LocalDate.now().plusWeeks(1));
        System.out.println("Next month: " + LocalDate.now().plusMonths(1));
        System.out.println("Next year: " + LocalDate.now().plusYears(1));

    }
}
