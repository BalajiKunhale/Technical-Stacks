package Batch21.streamAPI;

import java.util.Arrays;
import java.util.List;

public class Filter{
	
	public static void main(String[] args) {
		
		List<Integer>Numbers = Arrays.asList(11,13,15,14,12,16,18,17,19,20); 
		
		// filter even number
		List<Integer> evenNumber = Numbers.stream().filter(n -> n%2 == 0).toList();
		System.out.println(evenNumber);
		
		
		
		//  filter odd numbers
         List<Integer> oddNumber = Numbers.stream().filter(n->n%2 !=0).toList();
		System.out.println(oddNumber);
		
		
		
		
		
		
		
		List<String> cityList = List.of("Pune","Nasik","Kolhapur","Amravati","Nagpur","Solapur","Satara","Nanded");
		
		//  find  out citynames starting with letter "N"
		List<String> cityNList = cityList.stream().filter(city->city.startsWith("N")).toList();
		
		
		
		//   filter out city names containing "pur"
		List<String> purCityList = cityList.stream().filter(c->c.contains("pur")).toList();
		System.out.println(purCityList);
		
		
		
		//   filter cities having length greater than 6
		List<String> list = cityList.stream().filter(c->c.length()>6).toList();
        System.out.println(list);
		
	} 
	
}
