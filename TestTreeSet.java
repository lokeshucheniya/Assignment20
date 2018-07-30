package in.co.capgemini;

import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String args[]) {
		TreeSet<String> treeset = new TreeSet<>();

		treeset.add("Wiz");
		treeset.add("Khaled");
		treeset.add("Lil");
		treeset.add("Logic");
		treeset.add("Chainz");

		treeset.stream().forEach((name) -> System.out.println(name));

	}

}
