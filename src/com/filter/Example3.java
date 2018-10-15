package com.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Examples using string method : filter and map
public class Example3 {

	public static void main(String[] args) {

		ArrayList<String> l = new ArrayList<>();
		l.add("Alejandro");
		l.add("Luis");
		l.add("Sergio");
		l.add("Alberto");
		l.add("Francisco");
		
		List<String> list1=l.stream().filter(s->s.length()>6).collect(Collectors.toList());
		List<String> list2=l.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println("Original List = "+l);
		System.out.println("Filter List = "+list1);
		System.out.println("UpperCase List = "+list2);
		
	}//Close main

}//Close Example3
