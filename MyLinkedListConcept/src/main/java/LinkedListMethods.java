import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMethods {	
	
	public static void main(String[] args) {
		
		LinkedList<String> names = new LinkedList<String>();
		System.out.println(names.size());  // 0
		
		names.add("Tom");
		names.add("Naveen");
		names.add("Robby");
		names.add("Lisa");
		
		System.out.println(names.size());   // 4
		
		System.out.println(names);          //  [Tom, Naveen]
		System.out.println(names.get(1));   //  Naveen
		
		Iterator<String> it = names.iterator();
		while(it.hasNext()) {
		System.out.println(it.next());      //  Tom   Naveen   Robby   Lisa
		}
		
		names.add(4,"Steve");
		System.out.println(names);         //  [Tom, Naveen, Robby, Lisa, Steve]
		
		names.add(2,"Ram");
		System.out.println(names);          //  [Tom, Naveen, Ram, Robby, Lisa, Steve
		
		LinkedList<String> user = new LinkedList<String>();
		user.add("Peter");
		user.add("Trump");
		
		names.addAll(user);             // combine two linkedList
		System.out.println(names);      //  [Tom, Naveen, Ram, Robby, Lisa, Steve, Peter, Trump]

		names.addFirst("Kamla");
		System.out.println(names);      //  [Kamla, Tom, Naveen, Ram, Robby, Lisa, Steve, Peter, Trump]
		
		names.addLast("Shrirn");
		System.out.println(names);      // [Kamla, Tom, Naveen, Ram, Robby, Lisa, Steve, Peter, Trump, Shrirn]
		
		names.remove(2);              // removeAll(),  removeFirst(),   removeLast()
		System.out.println(names);
		
		names.clear();
		System.out.println(names);    //  [ ]
	}

}
