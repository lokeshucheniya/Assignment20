package in.co.capgemini;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestMap {

	public static void main(String args[]) {
		Map<String, String> map = new HashMap<>();

		map.put("Wiz", "Khalifa");
		map.put("Khaled", "DJ");
		map.put("Lil", "Wayne");
		map.put("Logic", "Ever");
		map.put("Chainz", "rollin");

		Set<Entry<String, String>> set = map.entrySet();

		set.stream().forEach((e) -> System.out.println(e.getKey() + " " + e.getValue()));

		Set<String> keyset = map.keySet();

		String val = map.get("Ryan");
		System.out.println(val);

		System.out.println("Key set values are: " + keyset);
	}

}
