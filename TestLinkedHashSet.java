package in.co.capgemini;

import java.util.LinkedHashSet;

public class TestLinkedHashSet {

	public static void main(String args[]) {

		LinkedHashSet<String> linkedhashset = new LinkedHashSet<>();

		linkedhashset.add("Wiz");
		linkedhashset.add("Khalid");
		linkedhashset.add("Lil");
		linkedhashset.add("Logic");
		linkedhashset.add("Chainz");

		linkedhashset.stream().forEach((name) -> System.out.println(name));
	}
}
