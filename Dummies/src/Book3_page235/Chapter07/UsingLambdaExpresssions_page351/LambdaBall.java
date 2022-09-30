package Book3_page235.Chapter07.UsingLambdaExpresssions_page351;

public class LambdaBall {
    public static void main(String[] args) {
        Ball b = () -> {
            System.out.print("You hit it!");
        };
        b.hit();
    }

    interface Ball {
        void hit();
    }
}
