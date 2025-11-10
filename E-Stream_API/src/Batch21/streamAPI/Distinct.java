package Batch21.streamAPI;

import java.util.List;

public class Distinct {
	
	public static void main(String[] args) {
		
		List<Integer> Numbers = List.of(34,65,23,79,65,34,23,20);
		
		// to find distinct elements 
		List<Integer> distinctNum = Numbers.stream().distinct().toList();
		System.out.println(distinctNum);
		
	}

}
