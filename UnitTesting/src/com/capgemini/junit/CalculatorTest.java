package com.capgemini.junit;

import org.junit.*;

public class CalculatorTest {
	Calculator c;
	@Before
	public void setup() {
		System.out.println("I'm inside setup()");
		c = new Calculator();
	}
	
	@After
	public void destroy() {
		c = null;
	}
	
	@Test
	public void testAdd_1() {
		System.out.println("I'm inside testAdd_1()");
		int result = c.add(5, 7);
		Assert.assertEquals(12, result);
	}
	
	@Test
	public void testAdd_2() {

		System.out.println("I'm inside testAdd_2()");
		int result = c.add(0, 7);
		Assert.assertEquals(7, result);
	}
}
