package Book5_page475.Chapter04_CalculatingDates_page552.ChronoUnits_page553;

import java.time.temporal.*;
import java.util.*;
import java.time.*;

public class ChronoUnit {

    /*
    ChronoUnit is an enumeration that defines the various units of time that can be
    used in date and time calculations. The possible values are:
    CENTURIES
    DAYS
    DECADES
    ERAS
    FOREVER
    HALF-DAYS
    HOURS
    MICROS
    MILLENNIA
    MILLIS
    MINUTES
    MONTHS
    NANOS
    SECONDS
    WEEKS
    YEARS
     */
}
    // Most of these are self-explanatory, but two of them are a bit peculiar:
    /*
        » ERA indicates whether the date refers to the Common Era (CE, also known as
            AD) or Before Era (BCE, also known as BC).
        » FOREVER represents the largest value that can be represented as a duration.
            Sadly, Java won’t let you live forever. The following code throws an exception:

    public static void main(String[] args) {
        LocalDate birthday = LocalDate.parse("1959-05-16);
                birthday = birthday.plus(1,ChronoUnit.FOREVER);
    }
}
*/