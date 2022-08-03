package Book03_ObjectOrientatedProgramming.Chapter04.CastingUpAndDown;

public class UpCasting {
    public static void main(String[] args) {
        Ball x = new Ball();
        SoftBall a = new SoftBall();
        BaseBall b = new BaseBall();
        b.hit(b);
        a.hit(a);
        b.toss(b);
        Ball y = new BaseBall();
        y.toss((BaseBall) y);
    }
}
