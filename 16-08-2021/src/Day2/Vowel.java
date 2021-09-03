package Day2;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the character");
		char ch=s.next().charAt(0);
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
		{
			System.out.println("it is vowel");
		}
		else
		{
			System.out.println("not a vowel");
		}

	}

}
