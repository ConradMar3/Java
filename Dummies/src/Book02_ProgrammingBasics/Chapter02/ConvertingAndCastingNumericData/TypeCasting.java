package Book02_ProgrammingBasics.Chapter02.ConvertingAndCastingNumericData;

public class TypeCasting {
    public static void main(String[] args) {
        double pi = 3.1314;
        int iPi;
        iPi = (int) pi;
        System.out.println(iPi);

        // Note the fractional part of double is discarded.
    }
}
