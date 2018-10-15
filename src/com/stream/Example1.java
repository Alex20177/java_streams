package com.stream;

import java.util.stream.Stream;

public class Example1 {

	public static void main(String[] args) {

		Stream<Integer> s=Stream.of(9,99,999,9999,99999);	
		s.forEach(System.out::println);
		
		Double d[]= {10.0,10.1,10.2,10.3,10.4};
		Stream<Double> s1=Stream.of(d);
		s1.forEach(System.out::println);
		
	}//Close main

}//Close Example1
