package Book3_page235.Chapter05.UsingInterfaces.ImplementingInterfaces;

public class Poker extends Game
        implements Playable, CardGame{
    @Override
    public void play() {

    }
    // inherits all members of the Game class
    // must implement methods of the Playable
    // and CardGame interfaces
}
