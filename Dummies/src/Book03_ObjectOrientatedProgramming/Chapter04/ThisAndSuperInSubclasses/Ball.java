package Book03_ObjectOrientatedProgramming.Chapter04.ThisAndSuperInSubclasses;

public class Ball {
    private int velocity;

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public void hit() {
        System.out.println("You hit it a mile!");
    }
}

class BaseBall extends Ball {
    public void hit() {
        System.out.println("You tore the cover off!");
        super.hit();
    }
}

