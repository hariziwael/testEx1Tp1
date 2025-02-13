package org.isimg.utils;
import org.isimg.exceptions.InvalidFibonacciIndexException;

public class FibonacciCalculator {
	public static int fibonacci(int n) throws InvalidFibonacciIndexException {
        if (n <= 0) {
            throw new InvalidFibonacciIndexException("Fibonacci index must be greater than 0.");
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

}
