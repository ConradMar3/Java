package Book4_page375.Chapter02.SortingArrays_page419;

import java.util.Arrays;

public class SortingArrays {
    public static void main(String[] args) {
        int[] lotto = new int[6];
        for (int i = 0; i < 6; i++)
            lotto[i] = (int)(Math.random() * 100) + 1;
        Arrays.sort(lotto);

        System.out.println(lotto);
    }
}
