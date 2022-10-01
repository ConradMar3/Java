package Book4_page375.Chapter03.UpdatingElements_page432;

import Book3_page235.Chapter06.ObjectAsType.Employee;

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
        nums.clear();
        nums.add("One");
        nums.add("Two");
        nums.add("Three");
        System.out.println(nums);
        nums.set(0, "Uno");
        nums.set(1, "Dos");
        nums.set(2, "Tres");
        System.out.println(nums);

        // Other method:
        ArrayList<Employee> emp = new ArrayList<Employee>();
// add employees to array list
        emp.add(new Employee("Addams", "Gomez"));
        emp.add(new Employee("Taylor", "Andy"));
        emp.add(new Employee("Kirk", "James"));
// print array list
        System.out.println(emp);
// change one of the employee's names
        Employee e = emp.get(1);
        e.changeName("Robert");
// print the array list again
        System.out.println(emp);
    }
}
