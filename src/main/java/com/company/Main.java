package com.company;

import com.company.util.Checker;

import java.io.Console;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Calculator calculator = new Calculator();

	Scanner scanner = new Scanner(System.in);
	int a = scanner.nextInt();
	int b = scanner.nextInt();

	int result = calculator.add(a,b);
	int result1 = calculator.minus(a,b);
	long result2 = calculator.multiply(a,b);
	double result3 = calculator.division(a,b);

        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

        Checker checker = new Checker();
        boolean isEven = checker.isEven(result);
        boolean isOdd = checker.isOdd(result);

        System.out.println(isEven);
        System.out.println(isOdd);

    }
}
