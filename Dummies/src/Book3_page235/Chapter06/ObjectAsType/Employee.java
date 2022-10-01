package Book3_page235.Chapter06.ObjectAsType;

public class Employee extends Person {
    public Employee(String addams, String gomez) {

    }

    public Employee() {

    }

    public void changeName(String robert) {
    }

    public void setLastName(String smith) {
    }
    /* If the Employee5 class has a method named
       setLastName, the following code doesn't work:

       Object emp = new Employee5();
       emp.setLastName("Smith"); // error: won't compile

       Because emp is an Object, not an Employee5, the compiler doesn't know about the
       setLastName method.
     */

    // Note that you could still cast the object to an Employee5:

}
