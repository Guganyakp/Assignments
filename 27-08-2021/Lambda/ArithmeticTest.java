package Assignment1;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArithmeticTest {
	Arithmetic ao;
@BeforeEach
	public void init()
	{
		ao=new Arithmetic();
	}
	
	@Test
	void testAdd() {
		//Arithmetic ao=new Arithmetic();
		assertEquals(68,ao.add(45, 23));
	}
	
	@Test
	void testDivision() {
		//Arithmetic ao=new Arithmetic();
		assertThrows(ArithmeticException.class,()->ao.div(45, 0),"Number divide by zero");
	}
	
	@Test
	void testAreaOfCircle()
	{
		//Arithmetic ao=new Arithmetic();
		assertNotNull(ao);
		double actual=ao.areaOfCircle(1);
		assertEquals(Math.PI,ao.areaOfCircle(1),"pivalue");
		
		String string1="guganya";
		String string2="guganya";
		assertSame(string1,string2);
		
	}

}
