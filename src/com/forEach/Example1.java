package com.forEach;

import java.util.Arrays;
import java.util.List;

public class Example1 {

	public static void main(String[] args) {

		List<Integer> l=Arrays.asList(25,10,0,15,20,5);
		//l.forEach(i->System.out.println(i));
		l.forEach(System.out :: println);
		
	}//Close main

}//Close Example1
