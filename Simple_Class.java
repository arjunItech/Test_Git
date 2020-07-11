package simple_Maven;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Simple_Class {
	
	public static void main(String [] args) {
		
		
		List<String> week = Arrays.asList("Monday","Tuesday","Wednesday","Thursday");
		
		
		List<Object> Stringo = week.stream().collect(Collectors.toList());
		
		
		
		System.out.println("Hello World"+Stringo.toString());
	}
	

}
