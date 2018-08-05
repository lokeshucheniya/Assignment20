package in.co.capgemini;

import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String args[]) {
		
		//Creating TreeSet for adding values
		TreeSet<String> treeset = new TreeSet<>();

		treeset.add("Wiz");
		treeset.add("Khaled");
		treeset.add("Lil");
		treeset.add("Logic");
		treeset.add("Chainz");

		//Lambda expression for printing values
		treeset.stream().forEach((name) -> System.out.println(name));

	}

}
