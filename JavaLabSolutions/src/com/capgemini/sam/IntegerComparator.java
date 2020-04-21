package com.capgemini.sam;

import java.util.Comparator;

public class IntegerComparator implements Comparator<Integer> {
		
	@Override
	public int compare(Integer o1, Integer o2) {
		int i1 = o1.intValue();
		int i2 = o2.intValue();
		return i1-i2;
	}
}
