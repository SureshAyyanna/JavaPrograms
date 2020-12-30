package practicePrograms;

import java.util.Scanner;

public class PrintStarPatterenusingloop {

	public static void main(String[] args) {
		int row, noOfStars;

		for (row = 1; row <= 5; row++) {
			for (noOfStars = 1; noOfStars <=row; noOfStars++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
