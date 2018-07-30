package in.co.capgemini;

import java.util.LinkedHashSet;
import java.util.Set;

import in.co.capgemini.Car;
import in.co.capgemini.CellPhone;
import in.co.capgemini.Laptop;
import in.co.capgemini.School;
import in.co.capgemini.Television;

public class SetTest {

	public static void main(String args[]) {
		Set<Object> set = new LinkedHashSet<>();

		set.add(new Car("Figo", 300000, 1990, "Ford"));
		set.add(new Car("Baleno", 200000, 1890, "Maruti Suzuki"));
		set.add(new Car("Swift", 600000, 1998, "Maruti Suzuki"));

		set.add(new CellPhone("Apple", "iPhone10", 900000, "Improved Features", "ios"));
		set.add(new CellPhone("Samsumg", "J7", 8000000, "Improved features", "Android"));
		set.add(new CellPhone("Moto", "Z2 Play", 3000000, "Improved features", "Android"));

		set.add(new Laptop("Dell", "Dell", "Windows", "i5"));
		set.add(new Laptop("lenovo", "lenovo", "Windows", "i3"));
		set.add(new Laptop("Dell", "Dell", "Linux", "i3"));

		set.add(new School("St. Xavier's", "Mumbai", "Mumbai", 345));
		set.add(new School("DBN", "Mumbai", "Mumbai", 567));
		set.add(new School("DPS", "Mumbai", "Mumbai", 234));

		set.add(new Television("Sony Bravia", "LED", "true", 500000));
		set.add(new Television("Videocon", "LCD", "false", 100000));
		set.add(new Television("Sony Bravia", "LED", "true", 500000));

		set.stream().forEach((set1) -> System.out.println(set1));
	}

}
