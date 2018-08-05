package in.co.capgemini;

import java.util.LinkedHashSet;

public class TestLinkedHashSet {

	public static void main(String args[]) {

		//Creating LinkedHashSet for storing value
		LinkedHashSet<String> linkedhashset = new LinkedHashSet<>();

		linkedhashset.add("Wiz");
		linkedhashset.add("Khalid");
		linkedhashset.add("Lil");
		linkedhashset.add("Logic");
		linkedhashset.add("Chainz");

		//Lambda expression for printing value
		linkedhashset.stream().forEach((name) -> System.out.println(name));
	}
}
