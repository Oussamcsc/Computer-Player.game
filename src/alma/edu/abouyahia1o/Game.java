package alma.edu.abouyahia1o;

public class Game {
    private HumanPlayer humanPlayer;
    private ComputerPlayer computerPlayer;
    private PairOfDice dice;

    public Game() {
        humanPlayer = new HumanPlayer();
        computerPlayer = new ComputerPlayer(20);  // Computer stops after 20 points
        dice = new PairOfDice();
    }

    public void start() {
        System.out.println("Starting the Pig Game...");

        while (humanPlayer.getTotalPoints() < 100 && computerPlayer.getTotalPoints() < 100) {
            // Human player's turn
            System.out.println("\nYour Turn!");
            takeTurn(humanPlayer);

            if (humanPlayer.getTotalPoints() >= 100) {
                System.out.println("Congratulations! You win with " + humanPlayer.getTotalPoints() + " points!");
                break;
            }

            // Computer player's turn
            System.out.println("\nComputer's Turn!");
            takeTurn(computerPlayer);

            if (computerPlayer.getTotalPoints() >= 100) {
                System.out.println("Computer wins with " + computerPlayer.getTotalPoints() + " points!");
                break;
            }
        }
    }

    private void takeTurn(Player player) {
        int totalPointsBeforeTurn = player.getTotalPoints();  // Store the previous total points before the turn
        boolean rolling = true;

        while (rolling) {
            dice.roll();  // Roll the dice

            // Display the dice values and current turn points
            System.out.println("Rolled: " + dice.getDie1() + " and " + dice.getDie2());
            System.out.println("Sum of dice: " + dice.getSum());

            // If snake eyes (both dice show 1)
            if (dice.getDie1() == 1 && dice.getDie2() == 1) {
                System.out.println("Rolled snake eyes! Turn over! No points for this turn.");
                player.resetTurnPoints();  // Reset turn points to 0
                rolling = false;  // End the turn
            } else if (dice.getDie1() == 1 || dice.getDie2() == 1) {
                // If a single 1 is rolled
                System.out.println("Rolled a 1! Turn over! No points for this turn.");
                player.resetTurnPoints();  // Reset turn points to 0
                rolling = false;  // End the turn
            } else {
                // If no 1 was rolled, add the sum to the player's turn points
                int rollSum = dice.getSum();
                player.addTurnPoints(rollSum);
                System.out.println("Current turn points: " + player.getTurnPoints());

                rolling = player.rollAgain();  // Ask the player if they want to continue rolling

                // If player decides not to roll again, add the accumulated turn points to the total points
                if (!rolling) {
                    player.addTotalPoints(player.getTurnPoints());
                    System.out.println("Turn ended. Total points: " + player.getTotalPoints());
                }
            }
        }

        // If the turn ended with a "1" roll, restore total points before the turn
        if (player.getTotalPoints() == totalPointsBeforeTurn) {
            player.addTotalPoints(player.getTurnPoints());
            System.out.println("Total points before the turn: " + totalPointsBeforeTurn);
        }
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.start();  // Start the game
    }
}
