package practicePrograms;

import java.util.Scanner;

public class ExceptionHanding {

	public static void main(String[] args) {
		int a, b, result;
		Scanner input = new Scanner(System.in);
		System.out.println("Input two integers");
		a = input.nextInt();
		b = input.nextInt();

		// try-catch block
		try {
			result = a / b;
			System.out.println("Result = " + result);
		} catch (ArithmeticException e) {
			System.out.println("Exception caught: Division by zero.");
		}
	}
}