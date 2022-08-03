package Book02_ProgrammingBasics.Chapter03.NumbersAndExpressions.WeirdJavaMath;

import java.text.NumberFormat;

public class FloatingPointWeirdness {
    public static void main(String[] args) {
        //Float or Double can't accurately predict 0.1
        float x = 0.1f;
        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setMinimumFractionDigits(10);
        System.out.println(nf.format(x));
    }
}
