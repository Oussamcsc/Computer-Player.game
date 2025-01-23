package alma.edu.abouyahia1o;

public class PairOfDice {
    private int die1;
    private int die2;

    public PairOfDice() {
        roll();  // Roll the dice initially
    }

    public void roll() {
        die1 = (int) (Math.random() * 6) + 1;  // Random number between 1 and 6
        die2 = (int) (Math.random() * 6) + 1;
    }

    public int getDie1() {
        return die1;
    }

    public int getDie2() {
        return die2;
    }

    public int getSum() {
        return die1 + die2;
    }
}
