package mavendemo.mavendemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest2 {

	
	@Test
	void test() {
		Calculator calc=new Calculator();
		
		assertEquals(400, calc.add(200,200));
		
	}
	

}
