package Batch21.streamAPI;

import java.util.Arrays;
import java.util.List;

public class Skip{
	
	public static void main(String[] args) {
		
		List<Integer> numList = Arrays.asList(10,30,40,20,60,50,60,80);
		
		List<Integer> skipNum = numList.stream()
				                       .skip(3)
				                       .toList();
		System.out.println(skipNum);
		
		
	}

}
