package in.co.capgemini;

import java.util.TreeSet;

import in.co.capgemini.Car;

public class TestCarTreeSet {

	public static void main(String args[]) {
		
		//Creating TreeSet for Class Car
		TreeSet<Car> treeset = new TreeSet<>();

		treeset.add(new Car("Diablo", 600000, 1998, "Chrevolet"));
		treeset.add(new Car("Focus", 300000, 1990, "Fords"));
		treeset.add(new Car("Indica", 200000, 1890, "Tata"));

		//Lambda expression for printing value
		treeset.stream().forEach((name) -> System.out.println(name));

	}

}
