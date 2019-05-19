import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {

	public static void main(String[] args) {
		//set is kind of collection that stores unique elements
		//hashSet does not retain order.
		
		//Set<String> set1 = new HashSet<String>();
		
		//linked hash set remembers the order you added items in
		//Set<String> set1 = new LinkedHashSet<String>();
		
		//TreeSet sorts in natural(alphabetical) order
		Set<String> set1 = new TreeSet<String>();
		
		if(set1.isEmpty()) {
			System.out.println("Set is empty at start");
		}
		
		
		set1.add("dog");
		set1.add("cat");
		set1.add("mouse");
		set1.add("snake");
		set1.add("bear");
		
		System.out.println("set is empty after adding (no!)");
		
		
		//Adding duplicate items does nothing
		set1.add("mouse");
		
		System.out.println(set1);
		
		//////////// Iteration/////////////
		
		for(String element: set1) {
			System.out.println(element);
		}
		
		/////////////Does set contain a given item?/////////
		
		
		if(set1.contains("aardvark")) {
			System.out.println("contains aardvark");
		}
		
		if(set1.contains("cat")) {
			System.out.println("Contains cat");
		}
		
		
		/////////////////set11 contains some common elements with set1, and some new 
		
		
		Set<String> set11 = new TreeSet<String>();
		
		
		set11.add("dog");
		set11.add("cat");
		set11.add("giraffe");
		set11.add("monkey");
		set11.add("ant");
		
///////////Intersection//////////
		
		Set<String> intersection = new HashSet<String>(set1);
		
		
		intersection.retainAll(set11);
		
		System.out.println(intersection);

		
		/////////Difference/////////////////
	}
	
	//Set<String>difference = new HashSet<String>(set1);
 
	//difference.removeAll(set11);
	//system.out.println(difference);
	
}
