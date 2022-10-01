package Book4_page375.Chapter6_BulkDataOperations.StreamInterface_page467;

public class Stream {
    /*
    The Stream interface defines about 40 methods. In addition, three related
    interfaces — DoubleStream, IntStream, and LongStream — extend the Stream
    interface to define operations that are specific to a single date type: double, int,
    and long. Table 6-1 lists the most commonly used methods of these interfaces.

    The filter method is one of the most commonly used stream methods. It’s argument,
    called a predicate, is a function that returns a boolean value. The function is
    called once for every element in the stream and is passed a single argument that
    contains the element under question. If the method returns true, the element is
    passed on to the result stream. If it returns false, the element is not passed on.

    The easiest way to implement a filter predicate is to use a lambda expression that
    specifies a conditional expression. For example, the following lambda expression
    inspects the name field of the stream element and returns true if it begins with
    the letter a (upper- or lowercase):
    > s -> s.name.toLowerCase().startsWith("a");

     */
}
