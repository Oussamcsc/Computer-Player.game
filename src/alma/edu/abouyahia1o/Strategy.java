package alma.edu.abouyahia1o;

public class Strategy {
    public static void main(String[] args) {
        // Loop through various thresholds to test the strategy
        for (int threshold = 5; threshold <= 50; threshold += 5) {
            ComputerPlayer computer = new ComputerPlayer(threshold);
            int turns = testComputerPlayer(computer);
            System.out.println("Threshold: " + threshold + ", Turns: " + turns);
        }
    }

    private static int testComputerPlayer(ComputerPlayer computer) {
        Game game = new Game();
        game.start();  // Run the game with the given strategy
        return computer.getTotalPoints();
    }
}
