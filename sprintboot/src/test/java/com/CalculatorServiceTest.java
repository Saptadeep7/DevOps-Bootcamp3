package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.CalculatorService;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class CalculatorServiceTest {
	
	@Test
	private void test() {
		CalculatorService cs = new CalculatorService();
		
		Assertions.assertEquals(cs.add(), 75);
		Assertions.assertEquals(cs.subtract(), 45);
		Assertions.assertEquals(cs.multiple(), 900);
		Assertions.assertEquals(cs.division(), 4);
		Assertions.assertEquals(cs.modularDivision(), 0);
	}

}
