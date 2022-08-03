package Book03_ObjectOrientatedProgramming.Chapter05.UsingAbstractClasses;

abstract class BallFactoryInstance extends Ball {
    public static Ball getBall(String s) {
        if (s.equalsIgnoreCase("BaseBall"))
            return new BaseBall();
        if (s.equalsIgnoreCase("SoftBall"))
            return new SoftBall();
        return null;
    }
}
