package Book4_page375.Chapter03.AddingArrayElements_page428;

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

        System.out.println(nums);

    }
}