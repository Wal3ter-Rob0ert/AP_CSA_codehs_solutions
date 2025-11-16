public class PlayerTester
{
    public static void main(String[] args) {
       
       //Start here
        CricketPlayer player1 = new CricketPlayer("Brian Lara", "West Indies");
        player1.addMatch(10, 2);
        player1.addMatch(8, 1);
        player1.addMatch(9, 2);
        player1.addMatch(9, 2);

        System.out.println("Brian Lara's Stats: ");
        player1.printRunsScored();
        player1.printBallsBowled();
        System.out.println(player1);
        System.out.println();

        CricketPlayer player2 = new CricketPlayer("Fabian Allen");
        player2.addMatch(14, 25);
        player2.addMatch(12, 18);
        player2.addMatch(10, 21);
        player2.addMatch(11, 17);

        System.out.println("Fabian Allen's Stats: ");
        player2.printRunsScored();
        player2.printBallsBowled();
        System.out.println(player2);

    }
}