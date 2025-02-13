package org.isimg.utils;

import org.isimg.exceptions.TooLargeValueException;
import org.isimg.exceptions.IllegalDivisionException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OperationArithmetiqueTest {
	
	@Test
    public void testAddition() throws TooLargeValueException {
        assertEquals(5, OperationArithmetique.addition(2, 3));
        assertThrows(TooLargeValueException.class, () -> OperationArithmetique.addition(Integer.MAX_VALUE, 1));
    }

    @Test
    public void testSoustraction() throws TooLargeValueException {
        assertEquals(1, OperationArithmetique.soustraction(3, 2));
        assertThrows(TooLargeValueException.class, () -> OperationArithmetique.soustraction(Integer.MAX_VALUE, -1));
    }

    @Test
    public void testMultiplication() throws TooLargeValueException {
        assertEquals(6, OperationArithmetique.multiplication(2, 3));
        assertThrows(TooLargeValueException.class, () -> OperationArithmetique.multiplication(Integer.MAX_VALUE, 2));
    }

    @Test
    public void testDivision() throws IllegalDivisionException {
        assertEquals(2, OperationArithmetique.division(6, 3));
        assertThrows(IllegalDivisionException.class, () -> OperationArithmetique.division(5, 0));
    }

}
