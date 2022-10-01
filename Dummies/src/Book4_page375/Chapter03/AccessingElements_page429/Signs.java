package Book4_page375.Chapter03.AccessingElements_page429;

import java.util.ArrayList;

public class Signs {
    public static void main(String[] args) {
        // Multi line Array method:
        //ArrayList signs;
        //signs = new ArrayList();

        // Single line:
        // > ArrayList signs = new ArrayList();

        ArrayList sign = new ArrayList(100);

        // ArrayList that holds a String Object:
        ArrayList<String> nums = new ArrayList<String>();

        nums = new ArrayList<String>();
        nums.add("One");
        nums.add("Two");
        nums.add("Three");
        nums.add("Four");
        nums.add(2, "Two and a half");

        for (int i = 0; i < nums.size(); i++)
            System.out.println(nums.get(i));

        for (String s : nums)
            System.out.println(s);

        for (String s : nums)
        {
            int i = nums.indexOf(s);
            System.out.println("Item " + i + ": " + s);
        }

    }
}
