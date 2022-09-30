package Book3_page235.Chapter06.ObjectAsType.Book04_StringsArraysCollections.Chapter05_CreatingGenericCollectionClasses.GenericQueueClass_page458;

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
