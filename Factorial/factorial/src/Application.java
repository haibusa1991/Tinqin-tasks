import factorialCalculator.FactorialCalculator;
import inputManager.ConsoleInput;

import java.math.BigInteger;

public class Application {
    public static void main(String[] args) {

        try {
            ConsoleInput input = new ConsoleInput();
            int consoleInput = input.getConsoleInput();

            FactorialCalculator calculator = new FactorialCalculator();
            BigInteger result = calculator.calculateFactorial(consoleInput);
            System.out.println(result.toString());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}