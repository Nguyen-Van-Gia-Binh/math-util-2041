package com.giaolang.mathutil;

import com.giaolang.mathutil.core.MathUtil;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        //test run #1
        testFactorialGivenValidN5RunWells();
        testFactorialGivenValidN6RunWells();
    }

    //test case #2 check the getFactorial() method with valid n, n = 6
    public static void testFactorialGivenValidN6RunWells() {

        int n = 6;                //tui mún tính 6!
        long expectedValue = 720; //hy vọng 6! trả về 720
        long actualValue = MathUtil.getFactorial(n);
        System.out.println("6! => Expected: " + expectedValue + " | Actual: " + actualValue);
    }

    //test case #1 check the getFactorial() method with valid n, n = 5
    public static void testFactorialGivenValidN5RunWells() {

        int n = 5;                //tui mún tính 5!
        long expectedValue = 120; //hy vọng 5! trả về 120
        long actualValue = MathUtil.getFactorial(n);
        System.out.println("5! = ");
        System.out.println("Expected: " + expectedValue);
        System.out.println("Actual: " + actualValue);
    }

}
