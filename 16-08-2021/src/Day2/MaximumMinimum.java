package Day2;

import java.util.Scanner;
public class MaximumMinimum {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
public void maximum()
	{
	int max=a;
	if(b>max)
	{
	max=b;
	}
	if(c>max)
	{
	max=c;
	}
	System.out.println(max +" is the greatest");
	}
	public void minimum()
	{
	int min=a;
	if(b<min)
	{
	min=b;
	}
	if(c<min)
	{
	min=c;
	}
	System.out.println(min +" is the smallest");
	}

	public static void main(String[] args) 
	{
		MaximumMinimum mm=new MaximumMinimum();
		mm.maximum();
		mm.minimum();
	}
	}

