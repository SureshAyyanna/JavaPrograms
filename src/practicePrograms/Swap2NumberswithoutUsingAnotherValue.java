package practicePrograms;

import java.util.Scanner;

public class Swap2NumberswithoutUsingAnotherValue {

	public static void main(String[] args) {

		int num1,num2;
		
		Scanner num=new Scanner(System.in);
		
		System.out.println("Enter the 2 values:");
		num1=num.nextInt();
		num2=num.nextInt();
		
		System.out.println("Before swapping values, Num1="+num1+" and Num2:"+num2);
		
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		
		System.out.println("After swapping values, Num1="+num1+" and Num2:"+num2);
	}

}
