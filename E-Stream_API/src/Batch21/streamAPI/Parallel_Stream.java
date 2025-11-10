package Batch21.streamAPI;

import java.util.Arrays;
import java.util.List;

public class Parallel_Stream {
	
	public static void main(String[] args) {
		
    List<String> names = Arrays.asList("Nitin", "Rajiv", "Sunita", "Amit", "Radha", "Nikita", "Arun", "Om");
		
       // Using Stream
    
    // to get uppercase name
    names.stream()
         .map(String::toUpperCase)
         .forEach(name->System.out.println(Thread.currentThread().getName() +" : " +name ));
    
    
    
    
    
    
    System.out.println("-----------||---------");
    
    
    
    
    
        // Using Prallel Stream 
    
    // to get lowercase name
    names.parallelStream()
         .map(String::toLowerCase)
         .forEach(name->System.out.println(Thread.currentThread().getName()+ ":" +name));
    
	}
	
}

