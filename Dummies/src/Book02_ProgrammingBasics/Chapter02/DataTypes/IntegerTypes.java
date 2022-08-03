package Book02_ProgrammingBasics.Chapter02.DataTypes;

public class IntegerTypes {
    public static void main(String[] args) {
        int xInt;
        long yLong;
        yLong = 32;
        xInt = (int) yLong;

        System.out.println(yLong + "" + xInt);

        long xLong1 = 58473882;
        long xLong2 = 58_473_882;

        System.out.println(xLong1 + "" + xLong2);

    }
}
