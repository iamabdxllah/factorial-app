
package com.example;

public class App {

    public long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException(
                "Number must be non-negative");
        }

        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }

    public static void main(String[] args) {
        int n = args.length > 0
                ? Integer.parseInt(args[0]) : 5;

        App app = new App();

        System.out.println(
            "Factorial of " + n + " = " + app.factorial(n));
    }
}
