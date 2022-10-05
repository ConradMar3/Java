package Book5_page475.Chapter04_ZoneOffset_page548;

import java.util.*;
import java.time.*;

public class ZoneOffsetClass {
    public static void main(String[] args) {

        ZoneOffset z = ZoneOffset.ofHours(-8);

        // Alternatively, you could specify the offset as a string, as in this example:

        ZoneOffset z1 = ZoneOffset.of("-08:00");
        //Note that when you use a string offset, you must provide two digits for the hours,
        //minutes, and (optionally) seconds.

        //Once you have a ZoneOffset object, you can use it to create an OffsetTime, as in
        //this example:

        OffsetTime time = OffsetTime.of(10, 30, 0, 0, z);

        //Or if you prefer, you can create the ZoneOffset directly in the call to the Offset
        //Time’s of method:

        OffsetTime time1 = OffsetTime.of(10, 30, 0, 0,
                ZoneOffset.ofHours(-8));

        System.out.println(z + "\n" + z1 + "\n" + time + "\n" + time1);
    }
}
