package practicePrograms;

import java.util.Scanner;

public class swapTwoNumbers {

	public static void main(String[] args) {
		//Swapping values using  3rd value
		int x,y,temp;
		
		Scanner num=new Scanner(System.in);
		
		System.out.println("Enter the 2 values:");
		x=num.nextInt();
		y=num.nextInt();
		
		System.out.println("Before swapping \nx:"+x+"\n y:"+y);
		
		temp=x;
		x=y;
		y=temp;
		
		System.out.println("After Swapping \n x:"+x+"\ny:"+y);

	}

}
