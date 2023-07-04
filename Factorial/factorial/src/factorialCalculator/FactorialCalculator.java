package factorialCalculator;

import java.math.BigInteger;

public class FactorialCalculator implements IFactorialCalculator {

    @Override
    public BigInteger calculateFactorial(int factorial) {
        if (factorial < 0) {
            throw new IllegalArgumentException("Input should not be negative!");
        }

        if (factorial == 0) {
            return BigInteger.ZERO;
        }

        BigInteger result = BigInteger.ONE;

        for (int i = 1; i <= factorial; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        return result;
    }
}
