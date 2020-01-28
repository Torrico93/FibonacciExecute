package com.company;

import java.util.Scanner;

import static com.company.FibonacciExecute.execute;


public class FibonacciProgram {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int fibonacciCardinal = scanner.nextInt();

        System.out.println(execute(fibonacciCardinal));


    }
}
