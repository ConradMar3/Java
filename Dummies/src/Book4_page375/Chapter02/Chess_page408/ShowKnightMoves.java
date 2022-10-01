package Book4_page375.Chapter02.Chess_page408;

public class ShowKnightMoves extends Chess {
    public static void showKnightMoves() {
        // The first dimension is the file (a, b, c, etc.)
        // The second dimension is the rank (1, 2, 3, etc.)
        // Thus, board[3][4] is square d5.
        // A value of 0 means the square is empty
        // 1 means the knight is in the square
        // 2 means the knight could move to the square
        int[][] board = new int[8][8];
        String kSquare; // the knight's position as a square
        Pos kPos; // the knight's position as a Pos
        // get the knight's initial position
        do {
            System.out.print("Enter knight's position: ");
            kSquare = sc.nextLine();
            kPos = convertSquareToPos(kSquare);
        } while (kPos == null);
    }

    static Pos convertSquareToPos(String kSquare) {
        return null;
    }
}
