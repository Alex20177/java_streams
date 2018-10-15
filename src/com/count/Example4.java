package com.count;

import java.util.Arrays;
import java.util.List;

public class Example4 {

	public static void main(String[] args) {

		List<String> l=Arrays.asList("Alejandro","Luis","Sergio","Alberto","Francisco");
		int count = (int)( l.stream().filter(s->s.length()>6).count());
		System.out.println("Count = "+count);
		
	}//Close main

}//Close Example4
