package Batch21.streamAPI;

import java.util.List;

public class StreamAPI_demo1 {
	
	public static void main(String[] args) {
		 
	       List<Integer> numbers = List.of(3,6,5,2,7,8,9,2,5,7,3,8);
	     
	       // Distinct & Unique Number
	       List<Integer> distinctNumber = numbers.stream().distinct().toList();       
	       System.out.println(distinctNumber);
	       
	       
	       // Distinct & Sorted Number 
	       List<Integer> DistinctSortedNumber = numbers.stream().distinct().sorted().toList();
	       System.out.println(DistinctSortedNumber);
	       
	       
	       //  Count the element in List
	       long count = numbers.stream().count();
	       System.out.println(count);
	       
	}
	
	
	
}
