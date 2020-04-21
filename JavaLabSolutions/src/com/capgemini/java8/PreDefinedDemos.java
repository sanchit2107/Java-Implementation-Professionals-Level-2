package com.capgemini.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PreDefinedDemos {

	public static void main(String[] args) {
		
		Supplier<Double> randomValue = () -> Math.random();
		System.out.println(randomValue.get());
		
		
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(7678);
		list.add(6978);
		list.add(7989);
		list.add(1678);
		
		list.forEach((a) -> System.out.println(a*4) );
		
		
		
		Consumer<List<Integer>> modify = list1 -> 
		{
			for(int i=0; i< list.size(); i++)
				list.set(i, 4 * list.get(i));
		};
		
		Consumer<List<Integer>> dispList = list1 ->
		list.stream().forEach(a -> System.out.print(a + " "));
		
		dispList.andThen(modify).accept(list);
		System.out.println();
		
		
		
		
		Predicate<Integer> lessThan = (i) -> i>45;
		System.out.println(lessThan.test(35));
		
		
		BiPredicate<Integer, Integer> biexample = 
				(i , j) -> i > j;
				System.out.println(biexample.test(230, 89));
				
		
				
				Function<Integer, Double> fun2 = (i) -> i/67.0;
		System.out.println(fun2.apply(4));
		
		
		
		BiFunction<Integer, Integer, Integer> fun3 = (a,b) -> a/b;
		System.out.println(fun3.apply(123, 89));
		System.out.println(fun3.apply(322, 76));
		
		
		
		Comparator<String> comp = (s1, s2) ->
		Integer.compare(s1.length(), s2.length());
		
		String[] values = {"****", "***", "*****", "**", "*"};
		Collections.sort(Arrays.asList(values), comp);
		
		for(String v: values)
			System.out.println(v);
		 
	}

}
