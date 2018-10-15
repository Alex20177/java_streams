package com.min;

import java.util.Arrays;
import java.util.List;

public class Example1 {

	public static void main(String[] args) {

		List<Integer> l=Arrays.asList(25,10,0,15,20,5);
		Integer min=l.stream().min((i1,i2)->i1.compareTo(i2)).get();
		
		System.out.println("Min value = "+min);
		
	}//Close main

}//Close Example1
