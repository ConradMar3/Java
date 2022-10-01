package Book4_page375.Chapter02.JaggedArrays_page405;

public class JaggedArrays {
    public static void main(String[] args) {
        String[][] teams
                = {{"Henry Blake", "Johnny Mulcahy"},
                {"Benjamin Pierce", "John McIntyre",
                        "Jonathan Tuttle"},
                {"Margaret Houlihan", "Frank Burns"},
                {"Max Klinger", "Radar O'Reilly",
                        "Igor Straminsky"}};

        /*for (int i = 0; i < teams.length; i++) {
            for (int j = 0; j < teams[i].length; j++)
                System.out.println(teams[i][j]);
            System.out.println();*/

        //Enhanced for loop:
        for (String[] team : teams) {
            for (String player : team)
                System.out.println(player);
            System.out.println();
        }
    }
}
