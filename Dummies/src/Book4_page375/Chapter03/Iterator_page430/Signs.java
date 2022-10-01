package Book4_page375.Chapter03.Iterator_page430;

import java.util.ArrayList;
import java.util.Iterator;

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

        ArrayList<String> nums1 = new ArrayList<String>();
        nums1.add("One");
        nums1.add("Two");
        nums1.add("Three");

        nums1.add("Four");
        String s;
        Iterator e = nums1.iterator();
        while (e.hasNext())
        {
            s = (String)e.next();
            System.out.println(s);
        }
    }
}