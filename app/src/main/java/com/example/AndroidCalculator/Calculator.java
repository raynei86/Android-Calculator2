package com.example.AndroidCalculator;

public class Calculator {


    public int add(int[] addend1, int[] addend2) {

        return addend1[0] + addend2[0];
    }

    public int subtract(int[] subtrahend1, int[] subtrahend2) {
        return subtrahend1[0] - subtrahend2[0];
    }

    public int divide(int[] dividend, int[] divisor) {
        return dividend[0] / divisor[0];
    }

    public int multiply(int[] factor, int[] multiplier) {
        return factor[0] * multiplier[0];
    }
}
