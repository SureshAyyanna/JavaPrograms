package practicePrograms;

import java.util.Scanner;

public class CheckEvenOddnumber {

	public static void main(String[] args) {
		int num;

		Scanner val = new Scanner(System.in);
		System.out.println("Enter the number:");
		num = val.nextInt();

		if ((num % 2) == 0)
			System.out.println("You entered an Even number");
		else
			System.out.println("You entered an odd number");

	}

}
