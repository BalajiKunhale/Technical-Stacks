package Batch21.streamAPI;

import java.util.List;
import java.util.stream.Collectors;

public class Map{
	
	public static void main(String[] args) {
		
		 List<String> Names = List.of("Sujit", "Nitin","Radha","Balaji","Ajit","Govinda","anil");
		
		 // Do UpperCase		 
		  List<String> UpperCaseNames = Names.stream().map(name->name.toUpperCase()).toList();
		                             // Names.stream().map(String::toUpperCase).toList();   // by Method Referancing
		 System.err.println(UpperCaseNames);
		 
		 
		 
		 // to obtain list of length of string
		 List<Integer> namesLength = Names.stream().map(name->name.length()).toList();
	                             //  Names.stream().map(String::length).toList(); // by Method Referancing
		 System.out.println(namesLength);
		
		         
		
		// add prefix to names 		
		List<String> namePrefix = Names.stream()
		                               .map(name->"Hello " +name)
		                               .collect(Collectors.toList());
		System.out.println(namePrefix);
		
		
		
		// to obtain list of square of Numbers		
		List<Integer> Nums = List.of(2,5,7,9,6,5,25,1,5,10);
		List<Integer > NumSquare = Nums.stream().map(Num->Num*Num).toList();
		System.out.println(NumSquare);
		
		
		
		
	}
	
	

}
