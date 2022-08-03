package Book02_ProgrammingBasics.Chapter03.NumbersAndExpressions.ArithmeticOperators.VariablesAndDataTypes.PrimitiveDataTypes;

// Floating-point numbers are numbers that have fractional parts.
// Usually six or seven decimal digits.

// By contrast, double variables have a precision of about 15 digits.

public class FloatingPointTypes {
  public static void main(String[] args) {
      double period = 99.0;

      // Using an "F" or a "D" suffix at the end of a value saves time.

      float value1 = 199.33F;
      double value2 = 200495.995D;

    System.out.println(period + " " + value1 + " " + value2);
  }
}
