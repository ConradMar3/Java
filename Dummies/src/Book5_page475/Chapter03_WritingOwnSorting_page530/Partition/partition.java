package Book5_page475.Chapter03_WritingOwnSorting_page530.Partition;

public class partition {
    private static int[] a;

    public static int partition(int low, int high)
    {
        int pivot = a[low];
        int i = low - 1;
        int j = high + 1;
        while (i < j)
        {
            for (i++; a[i] < pivot; i++);
            for (j--; a[j] > pivot; j--);
            if (i < j)
                swap(i, j);
        }
        return j;
    }

    private static void swap(int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
