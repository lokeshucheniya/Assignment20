package in.co.capgemini;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestMap {

	public static void main(String args[]) {
		
		//Creating HashMap for storing values
		Map<String, String> map = new HashMap<>();
	
		//Adding value in map
		map.put("Wiz", "Guava");
		map.put("Khaled", "Grapes");
		map.put("Lil", "Apples");
		map.put("Logic", "Orange");
		map.put("Chainz", "Pineapple");

		Set<Entry<String, String>> set = map.entrySet();

		//Lambda expression for printing values
		set.stream().forEach((e) -> System.out.println(e.getKey() + " " + e.getValue()));

		Set<String> keyset = map.keySet();

		//Searching and printing values
		String val = map.get("Wiz");
		System.out.println(val);
		
		System.out.println("Key set values are: " + keyset);
	}

}
