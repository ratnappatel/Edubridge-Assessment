package com.edu.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo_01 {

	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(20,30,40);
		
		System.out.println("While Loop");
		
		int i=0;
		while(i<numbers.size())
		{
			System.out.println(numbers.get(i));
			i++;
		}
		
		System.out.println("Advanced For Loop");
		for(int no:numbers)
			System.out.println(no);
		
		System.out.println("For Loop");
		for(int x=0;x<numbers.size();x++)
			System.out.println(numbers.get(x));
		
		System.out.println("Using Stream ForEach ");
		
		numbers.stream().forEach(System.out::println);		

	}

}
