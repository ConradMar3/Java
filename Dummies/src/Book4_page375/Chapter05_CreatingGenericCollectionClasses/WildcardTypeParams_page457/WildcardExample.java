package Book4_page375.Chapter05_CreatingGenericCollectionClasses.WildcardTypeParams_page457;

public class WildcardExample {
    /*
    Suppose you have a method that’s declared like this:
    > public void addItems(ArrayList<Object> list)
        {
            // body of method not shown
        }

    Thought question: Does the following statement compile?
    >addItems(new ArrayList<String>());
    Answer: Nope

    Unfortunately, inheritance doesn't work quite that way when it comes to for-
    mal type parameters. Instead, you have to use another feature of generics, called
    wildcards.

    In short, if you want to create a method that accepts any type of ArrayList, you
    have to code the method like this:
    >public void addItems(ArrayList<?> list)
    !!! In this case, the QUESTION MARK indicates that you can code any kind of type here.

    That’s almost as good as inheritance, but what if you want to actually limit the
    parameter to collections of a specific superclass? For example, suppose you’re
    working on a payroll system that has an 'Employee' superclass with two subclasses
    named 1-'HourlyEmployee' and 2-'SalariedEmployee', and you want this method to
    accept an ArrayList of Employee objects, HourlyEmployee objects, or Salaried
    Employee objects?

    In that case, you can add an extends clause to the wildcard, like this:
    >public void addItems(ArrayList<? extends Employee> list)

    Then you can call the addItems method with an ArrayList of type Employee,
    HourlyEmployee, or SalariedEmployee.

    Now, before you call it a day, take this example one step further: Suppose this
    addItems method appears in a generic class that uses a formal type parameter
    <E> to specify the type of elements the class accepts, and you want the addItems
    method to accept an ArrayList of type E or any of its subclasses.

    To do that, you'd declare the addItems method like this:
    >public void addItems(ArrayList<? extends E> list)
    Here the wildcard type parameter <? extends E> simply means that the ArrayList
    can be of type E or any type that extends E.
     */
}
