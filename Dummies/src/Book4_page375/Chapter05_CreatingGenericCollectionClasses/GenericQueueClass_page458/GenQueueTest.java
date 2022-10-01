package Book4_page375.Chapter05_CreatingGenericCollectionClasses.GenericQueueClass_page458;

public class GenQueueTest {
    public static void main(String[] args) {
        GenQueue<Employee> empList;
        empList = new GenQueue<Employee>();
        GenQueue<HourlyEmployee> hList;
        hList = new GenQueue<HourlyEmployee>();
        hList.enqueue(new HourlyEmployee(
                "Maré", "Conrad"));
        hList.enqueue(new HourlyEmployee(
                "Gates", "Bill"));
        hList.enqueue(new HourlyEmployee(
                "Jobbs", "Steve"));
        hList.enqueue(new HourlyEmployee(
                "Wozniack", "Bill"));
        hList.enqueue(new HourlyEmployee(
                "Musk", "Elon"));
        empList.addItems(hList);
        while (empList.hasItems()) {
            Employee emp = empList.dequeue();
            System.out.println(emp.firstName
                    + " " + emp.lastName);
        }
    }
}

