package Book3_page235.Chapter06.ObjectAsType.Book04_StringsArraysCollections.Chapter02.CreatingArrays_page394.UsingAbstractClasses;

public abstract class Ball {
    public abstract int hit(int batSpeed);

    //Ball b = new Ball(); // error: Ball is abstract

    private String userChoice;
    Ball b = BallFactoryInstance.getBall(userChoice);

}
