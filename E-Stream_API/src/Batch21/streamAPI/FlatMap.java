package Batch21.streamAPI;

import java.util.Arrays;
import java.util.List;

public class FlatMap{
	
	// flatmap() flattens the nested stream into a single stream
	//it's used to flatten nested structures such list of lists into a single stream 

	public static void main(String[] args) {
		List<List<String>> nestedList = List.of(List.of("a", "b"),
		                                List.of("c", "d", "e"),
		                                List.of("f", "g","h", "i"));
		
		List<String> flattenedList = nestedList.stream()
		                                       .flatMap(List::stream)
		                                       .toList();
		System.out.println(nestedList);      //  [[a, b], [c, d, e], [f, g, h, i]]
		System.out.println( flattenedList);  //   [a, b, c, d, e, f, g, h, i]
		
		
		
		
		
		//2. Split Words into characters
		List<String> words = Arrays.asList("hello", "world");
		List<String> characters = words.stream()
		.flatMap(word ->Arrays.stream(word.split("")))
		.toList();
		System.out.println(words);       //  [hello, world]
		System.out.println(characters);  //  [h, e, l, l, o, w, o, r, l, d]
		
		
		
		
		
		//  flatter & filter unique fruits
		List<String> list = Arrays.asList("apple banana", "orange banana","mango apple", "orange guava");
		List<String> fruits = list.stream()
		.flatMap(l->Arrays.stream(l.split(" ")))
		.distinct()
		.toList();
		System.out.println(list);
		System.out.println(fruits); // [apple, banana, orange, mango, guava]
	
	
		
		
	}
	
}
