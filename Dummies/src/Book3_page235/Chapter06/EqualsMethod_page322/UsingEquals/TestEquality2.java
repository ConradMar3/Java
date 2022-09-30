package Book3_page235.Chapter06.EqualsMethod_page322.UsingEquals;

/*
To test objects using the equals' method rather than the equality operator, you
simply rewrite the comparison expression like this:
 */

public class TestEquality2 {
    public static void main(String[] args) {
        Employee emp1 = new Employee(
                "Martinez", "Anthony");
        Employee emp2 = new Employee(
                "Martinez", "Anthony");
        if (emp1.equals(emp2))
            System.out.println("These employees are the same.");
        else
            System.out.println
                    ("These are different employees.");
    }
}

class Employee {
    private String lastName;
    private String firstName;

    public Employee(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }
}

/*
By default, the equals' operator returns the same result as the equality operator.
So just replacing == with the equals' method doesn't have any effect unless you
also override the equals' method.
 */