package practicePrograms;

import java.util.Scanner;

public class FindLargestNumber {
	public static void main(String[] args) {

		int a, b,c;
		
		Scanner num=new Scanner(System.in);
		System.out.println("Enter the values:");
		a=num.nextInt();
		b=num.nextInt();
		c=num.nextInt();
		 
		//USing if else statements
		if(a>b && a>c)
			System.out.println("a is Largest number and its value:"+a);
		else if (b>a && b>c)
			System.out.println("b is largets number and its value :"+b);
		else if(c>a && c>b)
			System.out.println("c is the largest number and its value is :"+c);
		else
			System.out.println("Entered numbers are not distinct");
			
	}
}
