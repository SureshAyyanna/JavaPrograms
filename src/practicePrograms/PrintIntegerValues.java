package practicePrograms;

import java.util.Scanner;

public class PrintIntegerValues {

	public static void main(String[] args) {
		int num;
		
		Scanner n=new Scanner(System.in);
		
		System.out.println("Enter the number value to print Integer numbers:");
		num = n.nextInt();
		
		System.out.println("The Integer values are:");
		for (int i = 1; i <= num; i++) {
			System.out.println(i);
		}
	}
}
