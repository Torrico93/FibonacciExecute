package com.company;


public class FibonacciExecute {

    public static String ERROR_CODE = "Error no negative numbers are accepted\n";

    public static int execute(int fibonacciCardinal) {


        if (fibonacciCardinal < 0) {
            return Integer.parseInt(ERROR_CODE);
        }

        if (fibonacciCardinal > 0 && fibonacciCardinal <= 2) {
            return 1;
        } else {
            return execute(fibonacciCardinal - 1) + execute(fibonacciCardinal - 2);
        }


    }


}



