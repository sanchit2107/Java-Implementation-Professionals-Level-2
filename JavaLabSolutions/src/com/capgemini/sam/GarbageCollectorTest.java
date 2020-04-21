package com.capgemini.sam;

class GC {

	protected void finalize() throws Throwable {
		System.out.println("In Finalize");
	}
}

public class GarbageCollectorTest {
	public static void createObjects() {
		GC obj1 = new GC();
		GC obj2 = new GC();
		obj1 = obj2;
	}

	public static void main(String[] args) {
		createObjects();
		System.gc();
	}
}
