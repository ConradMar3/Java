package Book03_ObjectOrientatedProgramming.Chapter05.UsingInterfaces.InterfacesAsTypes;

public class Poker extends Game
        implements Playable, CardGame {
    private static Object Dealable;
    private static Object String;

    public static void main(String[] args) {
        Object startGame = ((Dealable)(String));

    }

        private void startGame(Dealable deck, String game)
        {
            if (game.equals("Poker"))
                deck.deal(5);
            else if (game.equals("Hearts"))
                deck.deal(13);
            else if (game.equals("Gin"))
                deck.deal(10);
        }

    @Override
    public void play() {

    }
    // inherits all members of the Game class
    // must implement methods of the Playable
    // and CardGame interfaces
}
