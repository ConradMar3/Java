package Book5_page475.Chapter04_UsingParseToCreateDateTime_page544;

import java.time.format.DateTimeParseException;
import java.util.*;
import java.time.*;

public class ParseDateTime {
    public static void main(String[] args) {

        LocalDate d = LocalDate.parse("2014-12-15");

        LocalDateTime ldt;
        LocalDateTime ldtm = LocalDateTime.parse("2014-12-15T15:45");

        ldt = LocalDateTime.parse("2014-12-15T15:45:13.5");

        /*
        If the string is not in the correct format, the parse method throws a
        DateTimeParseException. Whenever you use the parse method, you should
        enclose it in a try block and catch this exception, as in this example:
         */

        LocalDateTime dt;
        try
        {
            dt = LocalDateTime.parse("2014-12-15T03:45PM");
        }
        catch (DateTimeParseException ex)
        {
            System.out.println(ex.toString());
        }
        System.out.println(d + " " + ldt + " " + ldtm);
    }
}
