/**
 * Created by andrewdmo on 8/4/16.
 */
public class Main {
    public static void main(String[] args) {

        BaseballPlayers player1 = new BaseballPlayers();

        player1.minorProfile("The Babe", "Pitcher", 75000);
        System.out.println("\nMinor league player:" + player1.toString());

        player1.calledUp(player1);
        System.out.println("\nMajor League player:" + player1.toString() + "\n\nLa Fin!");
    }
}