package practicePrograms;

public class PrintAlpabets {
	public static void main(String args[])
	{
	char ch;
	
	System.out.println("Lowercase letter:");
	for( ch = 'a' ; ch <= 'z' ; ch++ )
	System.out.print(ch);
	
	System.out.println();
	
	System.out.println("Uppercase letters:");
	for( ch = 'A' ; ch <= 'Z' ; ch++ )
		System.out.print(ch);
	}
}
