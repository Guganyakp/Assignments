package Assignment1;

import java.util.Scanner;
import java.util.function.IntConsumer;

public class nthFibonnaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number : ");
		int n=sc.nextInt();
		
		IntConsumer bi=(o)->{
			FibSeries(o);
			System.out.println("\n\nnth Element of The Fibonacci Sequence is : "+nthFib(o));
			};
		bi.accept(n);

	}

	private static void FibSeries(int o) {
		int num1=0;
		int num2=1;
		int i=0;
		System.out.print("Fibonacci Series is : ");
		while(i<=o)
		{
			if(i==o)
				System.out.print(num1);
			else
				System.out.print(num1+ "  ");
			
			int sum=num1+num2;
			num1=num2;
			num2=sum;
			i++;
		}
	}
	
	private static int nthFib(int o)
	{
		if(o<=1)
		{
			return o;
		}
		return nthFib(o-1)+nthFib(o-2);
		
	}
}