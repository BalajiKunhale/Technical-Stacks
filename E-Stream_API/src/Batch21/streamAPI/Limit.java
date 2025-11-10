package Batch21.streamAPI;

import java.util.List;

public class Limit{
	
	public static void main(String[] args) {
		
		List<Integer> numList = List.of(1,5,4,6,8,7,9,2,4,6,9);
		
		List<Integer> limitList = numList.stream().limit(5).toList();
		System.out.println(limitList);
		
		
	}

}
