package com.sorted;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example1 {

	public static void main(String[] args) {

		List<Integer> l = Arrays.asList(15,0,10,20,5,25);
		System.out.println("Before sort list = "+l);
		
		List<Integer> l1  = l.stream().sorted().collect(Collectors.toList());
		System.out.println("After sort list = "+l1);
		
		List<Integer> l2 = l.stream().sorted((i1,i2)->(i1>i2)?-1:(i1<i2)?1:0).collect(Collectors.toList());
		System.out.println("Descending order = "+l2);
				
//(i1,i2)->(i1>i2)?-1:(i1<i2)?1:0
//(i1,i2)->i2.compareTo(i1)
				
	}//Close main

}//Close Example1
