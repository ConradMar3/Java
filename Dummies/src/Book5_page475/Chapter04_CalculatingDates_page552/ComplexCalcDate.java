package Book5_page475.Chapter04_CalculatingDates_page552;

import java.time.temporal.ChronoUnit;
import java.util.*;
import java.time.*;

public class ComplexCalcDate {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        LocalDate invDate = LocalDate.of(today.getYear(),
                today.getMonthValue(), 15);
        if (today.getDayOfMonth() > 15)
            invDate = invDate.plusMonths(1);
        long daysToInvoice = today.until(invDate,
                ChronoUnit.DAYS);
        System.out.println(daysToInvoice
                + " until next invoice date.");

    }
}
