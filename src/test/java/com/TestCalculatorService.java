package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestCalculatorService {
	
	CalculatorService calc = new CalculatorService();

	 @Test
	  public void testSum() {
		  
		  Assertions.assertEquals(30, calc.sum());
	  }
	 
	 @Test
	 public void testMultiply() {
		 Assertions.assertEquals(450, calc.multiply());
	 }
	
	 
	 @Test
	 public void testSubstraction() {
		 Assertions.assertEquals(60, calc.substract());
	 }
	 
	 @Test
	 public void testDivision() {
		 Assertions.assertEquals(5, calc.division());
	 }
	 
	 
}
