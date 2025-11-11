package Batch21.Java8Features;
	
import java.util.List;
import java.util.stream.Collectors;


	public class Method_Referance{
		
		//Static method Reference
		
		public static boolean isEven(int number) {
		return number%2==0;
		}
		
		public static void main(String[] args) {
		List<Integer> numbers = List. of (10,12,1,31,41,15,16,17,18,19,20);
		List<Integer> evenNumbers = numbers.stream()
		.filter(Method_Referance::isEven)
		.toList();
		System.out.println(evenNumbers);
		
		
		
		
		
		
		//Constructor reference
		
		List<String> names = List.of("Amit", "Sumit", "Mahesh", "Ramesh", "suresh");
		System.out.println(names);
		List<Person> persons = names.stream().map(Person::new).collect(Collectors.toList());
		
		System.out.println(persons);
		
		
		
		
		}
		
	}


