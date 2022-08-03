package Book03_ObjectOrientatedProgramming.Chapter02.CreatingConstructors.DefaultConstructor;

//Won't compile, if you declare a constructor that accepts parameters and still want to
//have an empty constructor (with no parameters and no body), you must explicitly
//declare an empty constructor for the class.

/*
public class BadActorApp {
    public static void main(String[] args) {
        Actor a = new Actor(); // error: won't compile
    }
}

class Actor {
    private String lastName;
    private String firstName;
    private boolean goodActor;

    public Actor(String last, String first) {
        lastName = last;
        firstName = first;
    }

    public Actor(String last, String first, boolean good) {
        lastName = last;
        firstName = first;
        goodActor = good;
    }
}
*/
