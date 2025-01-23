package alma.edu.abouyahia1o;

public class Dice {
    private int die1;
    private int die2;

    public void roll() {
        this.die1 = (int) (Math.random() * 6) + 1;
        this.die2 = (int) (Math.random() * 6) + 1;
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
