package Book4_page375.Chapter02.CreatingArrays_page394.UsingAbstractClasses;

public abstract class Ball {
    public abstract int hit(int batSpeed);

    //Ball b = new Ball(); // error: Ball is abstract

    private String userChoice;
    Ball b = BallFactoryInstance.getBall(userChoice);

}
