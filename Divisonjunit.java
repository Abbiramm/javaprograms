package divjunit;

import static org.junit.Assert.*;

import org.junit.Test;

import DIv.Divionclas;

public class Divisonjunit {
	Divionclas d1=new Divionclas(10,2);
	Divionclas d2=new Divionclas(10,0);
	@Test
	public void test() {
		assertEquals(5,d1.divisionsum());
		
		
	}
	
	@Test (expected = ArithmeticException.class)
	public void test1() {
		assertEquals(5, d2.divisionsum());
	}


}
