package Book2_page65.Chapter03.ArithmeticOperators.VariablesAndDataTypes.ReferenceTypes;

public class ReferenceTypes {
  public static void main(String[] args) {

    Ball b1 = new Ball();
    Ball b2 = b1;

      b1.setSpeed(50);
      b2.setSpeed(100);
      int speed = b1.getSpeed();

    System.out.println(speed);
  }
}
