package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Start {

	public static void main(String[] args) {

		example();

	}
	
	public static void example() {
	//	hashSetExample();
	//treeSetExample();
		linkedHashSetExample();
	}

	private static void linkedHashSetExample() {
		Set <Car> cars = new LinkedHashSet ();
		Car car1 = new Car("BMW");
		Car car2 = new Car ("Niva");
		Car car3 = new Car ("Nissan");
		Car car4 = new Car ("Nissan");
		cars.add(car1);
		cars.add(car2);
		cars.add(car3);
		cars.add(car4);
		
		Iterator <Car> iterator = cars.iterator();
		
		while (iterator.hasNext()) {
			
			Car car = iterator.next();
			System.out.println(car.getName());
		}
	}

	private static void treeSetExample() {
		Set <Integer> numbers = new TreeSet <Integer> ();
		numbers.add(234);
		numbers.add(234);
		numbers.add(23);
		numbers.add(53);
		numbers.add(23);
		numbers.add(234);
		
		Iterator <Integer> iterator = numbers.iterator();
		
		while (iterator.hasNext()) {
			
			System.out.println(iterator.next());
		}
	}

	private static void hashSetExample() {
		
		Set cars = new HashSet();
		
		Car car1 = new Car("BMW");
		Car car2 = new Car ("Niva");
		Car car3 = new Car ("Nissan");
		Car car4 = new Car ("Nissan");
		
		cars.add(car1);
		cars.add(car2);
		cars.add(car3);
		cars.add(car4);
		
		Iterator <Car> iterator = cars.iterator();
		
		while (iterator.hasNext()) {
			Car car =  iterator.next();
			System.out.println(car.getName());
		}
		
	}

}
