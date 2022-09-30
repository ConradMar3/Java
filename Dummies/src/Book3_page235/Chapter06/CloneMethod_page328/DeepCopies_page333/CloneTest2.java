package Book3_page235.Chapter06.CloneMethod_page328.DeepCopies_page333;

//Creating a Deep Copy:

public class CloneTest2 {
    public static void main(String[] args) {
        Employee emp1 = new Employee(
                "Martinez", "Anthony");
        emp1.setSalary(40000.0);
        emp1.address = new Address(
                "1300 N. First Street",
                "Fresno", "CA", "93702");
        Employee emp2 = (Employee) emp1.clone();
        System.out.println(
                "**** after cloning ****\n");
        printEmployee(emp1);
        printEmployee(emp2);
        emp2.setLastName("Smith");
        emp2.address = new Address(
                "2503 N. 6th Street",
                "Fresno", "CA", "93722");
        System.out.println(
                "**** after changing emp2 ****\n");
        printEmployee(emp1);
        printEmployee(emp2);
    }
    //Clones the employee (okay, just the object, not the co-worker).

    private static void printEmployee(Employee e) {
        System.out.println(e.getFirstName()
                + " " + e.getLastName());
        System.out.println(e.address.getAddress());
        System.out.println("Salary: " + e.getSalary());
        System.out.println();
    }
}

//The Employee5 class. Notice that this class implements Cloneable.
class Employee implements Cloneable {
    private String lastName;
    private String firstName;
    private Double salary;
    public Address address;

//The address field, which holds an object of type Address.
    public Employee(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.address = new Address();
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Double getSalary() {
        return this.salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

//The clone method in the Employee5 class.
    public Object clone() {
        Employee emp;
        try {
            emp = (Employee) super.clone(); //Creates a shallow copy of the Employee5 object.
            emp.address = (Address) address.clone();
            /*Creates a shallow copy of the Address object and assigns it to the
            address field of the cloned Employee5 object.*/
        } catch (CloneNotSupportedException e) {
            return null; // will never happen
        }
        return emp; //Returns the cloned Employee5 object.
    }
    /*
    Catches CloneNotSupportedException, which won’t ever happen
    because the class implements Cloneable. The compiler requires the
    try/catch statement here because CloneNotSupportedException is
    a checked exception.
     */

    public String toString() {
        return this.getClass().getName() + "["
                + this.firstName + " " + this.lastName + ", "
                + this.salary + "]";
    }
}

class Address implements Cloneable {
    private String street;
    private String city;
    private String state;
    private String zipCode;

    public Address() {
        this.street = "";
        this.city = "";
        this.state = "";
        this.zipCode = "";
    }

    public Address(String street, String city,
                   String state, String zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return null; // will never happen
        }
    }
    /*
    Catches CloneNotSupportedException, which won’t ever happen
    because the class implements Cloneable. The compiler requires the
    try/catch statement here because CloneNotSupportedException is
    a checked exception.
     */

    public String getAddress() {
        return this.street + "\n"
                + this.city + ", "
                + this.state + " "
                + this.zipCode;
    }
}
