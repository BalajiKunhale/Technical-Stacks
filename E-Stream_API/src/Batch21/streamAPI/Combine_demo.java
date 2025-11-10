package Batch21.streamAPI;

import java.util.Arrays;
import java.util.List;

public class Combine_demo {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,20,30,10,20,70,90,80,60,80);	
		List<Integer> list2 = list.stream()
				                  .distinct() // [10, 20, 30, 70, 90, 80, 60]
				                  .skip(2)    // [30, 70, 90, 80, 60]
				                  .limit(6)   // [30, 70, 90, 80, 60]
				                  .toList();
		
		System.out.println(list2);
	
		
		
		
	}

}
