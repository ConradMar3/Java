package Book4_page375.Chapter05_CreatingGenericCollectionClasses.GenericQueueClass_page458;

class Employee {
    public String lastName;
    public String firstName;

    public Employee() {
    }

    public Employee(String last, String first) {
        this.lastName = last;
        this.firstName = first;
    }

    public String toString() {
        return firstName + " " + lastName;
    }
}
