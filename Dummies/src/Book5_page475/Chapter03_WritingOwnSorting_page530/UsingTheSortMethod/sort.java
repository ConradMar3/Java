package Book5_page475.Chapter03_WritingOwnSorting_page530.UsingTheSortMethod;



public class sort {
    public static void sort(int low, int high) {
        if (low >= high)
            return;
        int p = partition(low, high);
        sort(low, p);
        sort(p + 1, high);
    }

    private static int partition(int low, int high) {
        return low;
    }
}