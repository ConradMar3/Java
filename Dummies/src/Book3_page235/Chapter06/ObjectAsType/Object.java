package Book3_page235.Chapter06.ObjectAsType;

public class Object {
    private java.lang.Object lastName;

    public static void main(String[] args) {
        Employee emp = new Employee();
        ((Employee)emp).setLastName("Smith");
    }

    public void setLastName(java.lang.Object lastName) {
        this.lastName = lastName;
    }
}
