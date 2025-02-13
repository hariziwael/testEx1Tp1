package org.isimg.utils;

import org.isimg.exceptions.InvalidFibonacciIndexException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FibonacciCalculatorTest {
	
	@Test
    public void testFibonacciValues() throws InvalidFibonacciIndexException {
        assertEquals(1, FibonacciCalculator.fibonacci(1));
        assertEquals(1, FibonacciCalculator.fibonacci(2));
        assertEquals(2, FibonacciCalculator.fibonacci(3));
        assertEquals(3, FibonacciCalculator.fibonacci(4));
        assertEquals(5, FibonacciCalculator.fibonacci(5));
        assertEquals(8, FibonacciCalculator.fibonacci(6));
    }

    @Test
    public void testFibonacciThrowsExceptionForZero() {
        assertThrows(InvalidFibonacciIndexException.class, () -> FibonacciCalculator.fibonacci(0));
    }

    @Test
    public void testFibonacciThrowsExceptionForNegative() {
        assertThrows(InvalidFibonacciIndexException.class, () -> FibonacciCalculator.fibonacci(-3));
    }

}
