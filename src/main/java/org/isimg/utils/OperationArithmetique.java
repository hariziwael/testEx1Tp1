package org.isimg.utils;

import org.isimg.exceptions.TooLargeValueException;
import org.isimg.exceptions.IllegalDivisionException;

public class OperationArithmetique {
	
	private static final int MAX_VALUE = Integer.MAX_VALUE;
	
	/**
     * Adds two integers and checks for overflow.
     */
    public static int addition(int a, int b) throws TooLargeValueException {
        long result = (long) a + b;
        if (result > MAX_VALUE) {
            throw new TooLargeValueException("Addition result exceeds maximum allowed value.");
        }
        return (int) result;
    }

    /**
     * Subtracts two integers and checks for overflow.
     */
    public static int soustraction(int a, int b) throws TooLargeValueException {
        long result = (long) a - b;
        if (result > MAX_VALUE) {
            throw new TooLargeValueException("Subtraction result exceeds maximum allowed value.");
        }
        return (int) result;
    }

    /**
     * Multiplies two integers and checks for overflow.
     */
    public static int multiplication(int a, int b) throws TooLargeValueException {
        long result = (long) a * b;
        if (result > MAX_VALUE) {
            throw new TooLargeValueException("Multiplication result exceeds maximum allowed value.");
        }
        return (int) result;
    }

    /**
     * Divides two integers and handles division by zero.
     */
    public static int division(int a, int b) throws IllegalDivisionException {
        if (b == 0) {
            throw new IllegalDivisionException("Division by zero is not allowed.");
        }
        return a / b;
    }

}
