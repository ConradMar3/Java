package Book4_page375.Chapter02.SolvingHomeworkProblems_page397;


/*
Bobo (these problems always had a character named Bobo in them) visits the local
high school on a Saturday and finds that all the school’s 1,000 lockers are neatly
closed. So he starts at one end of the school and opens them all. Then he goes
back to the start and closes every other locker (lockers 2, 4, 6, and so on). Then he
goes back to the start and hits every third locker: If it’s open, he closes it; if it’s
closed, he opens it. Then he hits every fourth locker, every fifth locker, and so on.
He keeps doing this all weekend long, walking the hallways opening and closing
lockers 1,000 times. Then he gets bored and goes home. How many of the school’s
1,000 lockers are left open, and which ones are they?
 */

public class BoboAndTheLockers {
    public static void main(String[] args) {
// true = open; false = closed
        boolean[] lockers = new boolean[1001];
// close all the lockers
        for (int i = 1; i <= 1000; i++)
            lockers[i] = false;
        for (int skip = 1; skip <= 1000; skip++) {
            System.out.println("Bobo is changing every "
                    + skip + " lockers.");
            for (int locker = skip; locker < 1000;
                 locker += skip)
                lockers[locker] = !lockers[locker];
        }
        System.out.println("Bobo is bored"
                + " now so he's going home.");
// count and list the open lockers
        String list = "";
        int openCount = 0;
        for (int i = 1; i <= 1000; i++)
            if (lockers[i]) {
                openCount++;
                list += i + " ";
            }
        System.out.println("Bobo left " + openCount
                + " lockers open.");
        System.out.println("The open lockers are: "
                + list);
    }
}
