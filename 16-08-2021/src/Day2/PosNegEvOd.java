package Day2;

import java.util.Scanner;
public class PosNegEvOd {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int number=s.nextInt();
		System.out.println(number);
		if(number>0)
		{
			if(number%2==0)
			{
				System.out.println("positive & even");
			}
			else
			{
				System.out.println("positive & odd");
			}
		}
		else
		{
			if(number%2==0)
			{
				System.out.println("negative & even");
			}
			else
			{
				System.out.println("negative & odd");
			}
		}

	}

}