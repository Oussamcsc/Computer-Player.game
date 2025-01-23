package alma.edu.abouyahia1o;

public class ComputerPlayer extends Player {
    private int threshold;

    public ComputerPlayer(int threshold) {
        super();
        this.threshold = threshold;
    }

    @Override
    public boolean rollAgain() {
        // The computer rolls again until it has at least 'threshold' points in the current turn
        return this.getTurnPoints() < threshold;
    }
}
