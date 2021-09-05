package Assignment1;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class TestingClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Arithmetic ao=new Arithmetic();
		int expected=ao.add(12, -3);
		int actual=91;
		if(expected == actual)
		{
			System.out.println("testing passed");
		}
		else
			System.out.println("Testing Failed");*/
		
		Result res=JUnitCore.runClasses(Arithmetic.class);
		
		if(res.wasSuccessful())
		{
			System.out.println("success");
		}
		else
			System.out.println("fail");
			

	}

}
