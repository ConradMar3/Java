package Book4_page375.Chapter01_UsingForLoopsWithArrays_page396;

import java.util.Scanner;

public class Players {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int count = 0;
        int[] numbers = new int[100];
        for (int i = 0; i < 100; i++)
            numbers[i] = (int) (Math.random() * 100) + 1;

        String[] players = new String[count];
        for (int i = 0; i < count; i++) {
            System.out.print("Enter player name: ");
            players[i] = sc.nextLine(); // sc is a Scanner

        }
        for (int i = 0; i < count; i++)
            System.out.println(players[i]);

        for (int i = 0; i < players.length; i++)
            System.out.println(players[i]);
    }
}
