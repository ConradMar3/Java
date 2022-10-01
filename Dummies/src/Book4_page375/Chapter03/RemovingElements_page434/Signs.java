package Book4_page375.Chapter03.RemovingElements_page434;


import Book3_page235.Chapter06.ObjectAsType.Employee;

import java.util.ArrayList;

public class Signs {
    public static void main(String[] args) {
        // Multi line Array method:
        //ArrayList signs;
        //signs = new ArrayList();

        // Single line:
        // > ArrayList signs = new ArrayList();

        // To remove all the elements, use the clear method, like this:
        // > nums.clear();

        // To remove a specific element, use the remove method:
        // > nums.remove(0);

        ArrayList sign = new ArrayList(100);

        // ArrayList that holds a String Object:
        ArrayList<Employee> ems = new ArrayList<>();
// create employee objects
        Employee emp1 = new Employee("Addams", "Gomez");
        Employee emp2 = new Employee("Taylor", "Andy");
        Employee emp3 = new Employee("Kirk", "James");
// add employee objects to array list
        ems.add(emp1);
        ems.add(emp2);
        ems.add(emp3);
// print the array list
        System.out.println(ems);
// remove one of the employees
        ems.remove(emp2);
// print the array list again
        System.out.println(ems);

    }
}
