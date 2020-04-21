package com.capgemini.sam;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.*;

public class JUnitTest5 {
	Calculator c;

		@BeforeAll
		public static  void setUpAll() {
			System.out.println("Inside SetUpAll");
		}
		
		@BeforeEach
		public void setup() {
			c = new Calculator();
			System.out.println("Inside Setup");
			
		}
		
		@Test
		public void testAdd_1() {
			System.out.println("inside testADD_1");
			int result = c.add(2, 3);
			Assertions.assertEquals(5, result);
		}
		
		
		@Test
		public void testAdd_2() {
			System.out.println("inside testADD_2");
			int result = c.add(2, 13);
			Assertions.assertEquals(15, result);
		}
		
		@Test
		public void testAdd_3() {
			System.out.println("inside testADD_2");
			Executable e = new Executable() {
				
				@Override
				public void execute() {
					int result = c.add(2, 13);	
				}
			};
			Assertions.assertThrows(RuntimeException.class, e);
		}
		
		@AfterEach
		public void exitAll() {
			System.out.println("Thanks!! Bye");
		}
}
