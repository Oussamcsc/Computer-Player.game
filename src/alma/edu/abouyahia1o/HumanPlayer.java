package alma.edu.abouyahia1o;

import java.util.Scanner;

public class HumanPlayer extends Player {
    private Scanner scanner;

    public HumanPlayer() {
        super();
        scanner = new Scanner(System.in);
    }

    @Override
    public boolean rollAgain() {
        System.out.println("Do you want to roll again? (y/n): ");
        String response = scanner.next();
        return response.equalsIgnoreCase("y");
    }
}
