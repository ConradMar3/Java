package Book02_ProgrammingBasics.Chapter02.DataTypes;

import Book02_ProgrammingBasics.Chapter03.NumbersAndExpressions.ArithmeticOperators.VariablesAndDataTypes.ReferenceTypes.Ball;

public class ReferenceTypes {
    public static void main(String[] args) {
        //Object:
        Ball b1 = new Ball();
        Ball b2 = b1;

        //Assign int class:
        b1.setSpeed(50);
        b2.setSpeed(100);
        int speed = b1.getSpeed();

        System.out.println();

    }
}
