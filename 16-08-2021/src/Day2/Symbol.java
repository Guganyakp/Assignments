package Day2;

import java.util.Scanner;

public class Symbol 
{
	public static void main(String[] args) 
	{
		int a=20,b=50;
		Scanner s=new Scanner(System.in);
		System.out.println("enter symbol");
		char c=s.next().charAt(0);
		switch(c)
		{
		case '+':
			System.out.println(a+b);
			break;
		case '-':
			System.out.println(a-b);
			break;
		case '/':
			System.out.println(a/b);
			break;
		case '*':
			System.out.println(a*b);
			break;
		case '%':
			System.out.println(a%b);
			break;
		
		default:
			System.out.println("Not a symbol");

	}

}
}

