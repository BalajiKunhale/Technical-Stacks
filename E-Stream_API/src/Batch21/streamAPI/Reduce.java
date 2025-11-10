package Batch21.streamAPI;

import java.util.List;

public class Reduce{
	
	//reduce() is used to perform reduction operation on elements of stream
	//it combines the elements of a stream into a single result
	//syntax: reduce (binaryOperator<T> accumulator)
	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(2,4,3,5,6,7,8);
		
		//sum of numbers
		Integer sum = numbers.stream() 
				             .reduce((a,b) -> a+b)  // .reduce(0,(a,b)->a+b):
				             .get();		
		System.out.println(sum);
		
		
		
		// Maximum
		Integer max = numbers.stream().reduce(Integer.MIN_VALUE, (a,b) -> a > b ? a:b);
		System.out.println(max);
		
		
		
		//to concatenate strings		
		List<String> words = List.of("I", "am", "a", "Java", "developer");
		String sentence = words.stream()
		                       .reduce("",(a,b)->  a + " " +b);
		System.out.println(sentence);
		
		
    }
}
