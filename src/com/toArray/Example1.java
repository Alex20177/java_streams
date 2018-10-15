package com.toArray;

import java.util.Arrays;
import java.util.List;

public class Example1 {

	public static void main(String[] args) {

		List<Integer> l= Arrays.asList(15,0,10,20,5,25);
		Integer x[]=l.stream().toArray(Integer[]::new);
		
		for(Integer i : x)
			System.out.println(i);
		
		
	}//Close main

}//Close Example1
