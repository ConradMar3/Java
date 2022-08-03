package Book03_ObjectOrientatedProgramming.Chapter04.CastingUpAndDown;

public class Ball {
    public void hit(Ball x){
        System.out.println(x.getClass().getSimpleName() + " I'm being hit.");
    }
    public void toss(BaseBall b) {
        System.out.println("I am a baseball being thrown.");
    }
}
