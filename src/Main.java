/**
 * Created by andrewdmo on 8/4/16.
 */
public class Main {
    public static void main(String[] args) {

       // BaseballPlayers player1 = new BaseballPlayers();

        BaseballPlayer ruth = new BaseballPlayer("The Babe", "Pitcher");
        System.out.println("\nAmateur:\n" + ruth);
        System.out.println("\nMinor leaguer:\n" + ruth.minorLeaguer());
        System.out.println("\nCalled up:\n" + ruth.calledUp());

        BaseballPlayer piazza = new BaseballPlayer("Mike Piazza", "Catcher");
        System.out.println("\nAmateur:\n" + piazza);
        System.out.println("\nMinor leaguer:\n" + piazza.minorLeaguer());
        System.out.println("\nCalled up:\n" + piazza.calledUp());

    }
}