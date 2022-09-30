package Book3_page235.Chapter06.CloneMethod_page328.DeepCopies_page333;

//Example:

/*
public class Employee5 {
    public Address address;
    // other fields and methods omitted
}
 */

//A deep copy is a clone in which any sub-objects within the main object are also cloned.

//To accomplish this feat, the clone method override first calls super.clone() to create
//a shallow copy of the object. Then it calls the clone method of each of the sub-objects
//contained by the main object to create clones of those objects. (For a deep copy
//to work, of course, those objects must also support the clone methods.)
