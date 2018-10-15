package com.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example2 {

	public static void main(String[] args) {
		
		List<Integer> l= Arrays.asList(0,5,10,15,20,25);
		List<Integer> l1=l.stream().map(i->i*2).collect(Collectors.toList());
		
		System.out.println("Original List = "+l);
		System.out.println("Origianl List multiply by 2 = \n"+l1);
		
	}//Close man
	
}//Close Example2
