package com.capgemini.sam;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		
		Map<Integer, String> mapin = new TreeMap<>();
		mapin.put(2, "two");
		mapin.put(3, "three");
		mapin.put(1, "one");
		
		String fetched = mapin.get(2);
		
		MapEx example = new MapEx();
		example.displayByForEach(mapin);
		
		mapin.remove(3);
		example.displayByForEach(mapin);
		System.out.println("DisplayByForEach keys are:");
		example.displayByForEach(mapin);
		System.out.println("DisplayByKeys keys are:");
		example.displayByKeys(mapin);
		System.out.println("DisplayByFo keys are:");
		example.displayByEntries(mapin);
	}

	public void displayByForEach(Map<Integer, String> mapin) {
		
		Set<Integer> keys = mapin.keySet();
		for(Integer key: keys) {
			System.out.println(key);
		}
		
	}
	
	public void displayByKeys(Map<Integer, String> map) {
		Set<Integer> keys = map.keySet();
		for(Integer key: keys) {
			String value = map.get(key);
			System.out.println("Keys= "+ key + " value = " +value);
		}
	}
	
	public void displayByEntries(Map<Integer, String> map) {
		Set<Map.Entry<Integer, String>> entries = map.entrySet();
		for(Map.Entry<Integer, String> entry: entries) {
			Integer key = entry.getKey();
			String val = entry.getValue();
			System.out.println("Key= "+ key + " Value = " +val);
		}
	}

}
