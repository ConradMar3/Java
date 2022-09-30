package Book3_page235.Chapter06.CloneMethod_page328.UsingCloneShallowCopy_page332;

// Example only:

/*
public class Employee5 implements Cloneable {
    // Fields and methods omitted...
    public Object clone() {
        Employee5 emp;
        try {
            emp = (Employee5) super.clone();
        } catch (CloneNotSupportedException e) {
            return null; // will never happen
        }
        return emp;
    }
}
*/