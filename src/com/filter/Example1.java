package com.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example1 {

	public static void main(String[] args) {
		
//Without stream tool
		
		List<Integer> l= Arrays.asList(0,5,10,15,20,25);
//		ArrayList<Integer> l1=new ArrayList<>();
//		System.out.println("l list = "+l);
//		
//		for (Integer i: l) 
//			if (i%2==0) 
//				l1.add(i);
//		System.out.println("l1 list =  "+l1);
		
		List<Integer> l1 = l.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println("Original List = "+l);
		System.out.println("Even number list = "+l1);		
		
	}//Close main

}//Close Example1
