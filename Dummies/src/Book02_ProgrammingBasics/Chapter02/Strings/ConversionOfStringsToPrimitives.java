package Book02_ProgrammingBasics.Chapter02.Strings;

public class ConversionOfStringsToPrimitives {
    public static void main(String[] args) {
        //Converting a primitive to a String:
        int x = 0;
        String s = Integer.toString(x);
        System.out.println(s + " " + x);

        //Converting a String to a primitive:
        String t = "10";
        int y = Integer.parseInt(s);
        System.out.println(t + " " + y);
    }
}

// Integer parseInt(String) int x = Integer.parseInt("100");
// Short parseShort(String) short x = Short.parseShort("100");
// Long parseLong(String) long x = Long.parseLong("100");
// Byte parseByte(String) byte x = Byte.parseByte("100");
// Float parseByte(String) float x = Float.parseFloat("19.95");

/* Double parseByte(String) double x = Double.parseDouble("19.95");
    Character (none)
    Boolean parseBoolean boolean x = Boolean.parseBoolean
        (String) ("true"); */