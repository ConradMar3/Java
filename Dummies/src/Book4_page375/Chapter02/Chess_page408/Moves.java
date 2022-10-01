package Book4_page375.Chapter02.Chess_page408;

import java.util.Scanner;

public class Moves extends Chess {
    static Scanner sc = new Scanner(System.in);
    // the following static array represents the 8
    // possible moves a knight can make
    // this is an 8 x 2 array
    static int[][] moves = {
            {-2, +1},
            {-1, +2},
            {+1, +2},
            {+2, +1},
            {+2, -1},
            {+1, -2},
            {-1, -2},
            {-2, -1}
    };
}
