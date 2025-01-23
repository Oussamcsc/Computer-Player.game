package alma.edu.abouyahia1o;

public class Player {
    private int totalPoints;  // This holds the player's total points
    private int turnPoints;   // This holds points accumulated during a turn

    public Player() {
        this.totalPoints = 0;
        this.turnPoints = 0;
    }

    // Getter for totalPoints
    public int getTotalPoints() {
        return totalPoints;
    }

    // Add points to totalPoints
    public void addTotalPoints(int points) {
        this.totalPoints += points;
    }

    // Getter for turnPoints
    public int getTurnPoints() {
        return turnPoints;
    }

    // Add points to turnPoints (during a single turn)
    public void addTurnPoints(int points) {
        this.turnPoints += points;
    }

    // Reset turnPoints after a turn ends or when a "1" is rolled
    public void resetTurnPoints() {
        this.turnPoints = 0;
    }

    // Method to roll again
    public boolean rollAgain() {
        // Here we simulate whether the player wants to roll again (can be customized)
        return true; // Default to true, can change based on game rules
    }

    // Reset totalPoints (can be used in certain game modes, but not in the "1 die" case)
    public void resetTotalPoints() {
        this.totalPoints = 0;
    }
}
