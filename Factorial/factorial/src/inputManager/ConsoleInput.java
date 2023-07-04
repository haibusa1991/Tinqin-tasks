package inputManager;

import java.util.Scanner;

public class ConsoleInput implements IConsoleInput {
    @Override
    public int getConsoleInput() {
        Scanner scanner = new Scanner(System.in);
        try {
            return Integer.parseInt(scanner.next());
        } catch (Exception e) {
            throw new IllegalArgumentException("Input should be a number");
        }
    }
}
