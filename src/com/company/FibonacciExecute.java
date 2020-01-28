package com.company;

import java.util.Scanner;

public class FibonacciExecute {

    public static int execute(int numeroFibo) {

        if (numeroFibo < 0) {
            return 99999;
        } else if (numeroFibo > 0 && numeroFibo <= 2) {
            return 1;
        } else {
            return  execute(numeroFibo-1)+ execute(numeroFibo-2);
        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int numeroFibo = scanner.nextInt();

        System.out.println(execute(numeroFibo));



    }
}
