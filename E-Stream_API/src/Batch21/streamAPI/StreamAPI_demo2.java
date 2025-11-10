package Batch21.streamAPI;

import java.util.List;
import java.util.stream.Stream;

public class StreamAPI_demo2 {
	
	public static void main(String[] args) {
		
		List<Integer> numList = List.of(23, 45, 12, 43, 16, 18, 19, 25, 28, 17, 15);
		
		// skip 3 elements from list
		List<Integer> skipList = numList.stream().skip(3).toList();
		System.out.println(skipList);
		
		
		//limit 5 elements 		
		 List<Integer> limitElements = numList.stream().limit(5).toList();
		System.out.println(limitElements);
		
		// combination of skip & limit
		 List<Integer> skipLimit = numList.stream().skip(4).limit(6).toList();
		System.out.println(skipLimit);
		
		
	}

}
