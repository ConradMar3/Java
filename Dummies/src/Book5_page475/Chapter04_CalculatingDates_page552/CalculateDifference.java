package Book5_page475.Chapter04_CalculatingDates_page552;

import java.time.temporal.ChronoUnit;
import java.util.*;
import java.time.*;

public class CalculateDifference {
    public static void main(String[] args) {

        LocalDate date1 = LocalDate.parse("2014-05-16");
        LocalDate date2 = LocalDate.parse("2014-12-15");
        System.out.println(date1.until(date2, ChronoUnit.DAYS));

    }
}
