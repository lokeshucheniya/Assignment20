package in.co.capgemini;

import java.util.ArrayList;
import java.util.List;

public class Collection {
	public static void main(String args[]) {
		Car car = new Car("Figo", 3000000, 1990, "Ford");
		Car car1 = new Car("Suzuki", 3000000, 1990, "Ford");
		Car car2 = new Car("Figo", 3000000, 1990, "Ford");
		
		CellPhone cellphone = new CellPhone("Moto", "MotoZ2Play",30000, "Improved Features", "Android");
		CellPhone cellphone1 = new CellPhone("Moto", "MotoZ2Play",30000, "Improved Features", "Android");
		CellPhone cellphone2 = new CellPhone("Moto", "MotoZ2Play",30000, "Improved Features", "Android");
		
		Laptop laptop = new Laptop("Dell", "xps13", "Windows", "i7");
		Laptop laptop1 = new Laptop("Apple", "MacBook Air", "Mac OS", "i5");
		Laptop laptop2 = new Laptop("Hp", "pavillian", "windows", "i5");
		
		School school = new School("DPS ", "New Delhi ", "New Delhi ", 654);
		School school1 = new School("DBN ", "Ajmer ", "Ajmer ", 433);
		School school2 = new School("St. xavier's ", "Mumbai ", "Mumbai ", 435);
		
		Television television = new Television("Sony ", "W43D ", "Yes" , 75000);
		Television television1 = new Television("Sony ", "W63D ", "Yes" , 75000);
		Television television2 = new Television("LG ", "Signature ", "Yes" , 105000);
		
		
		List<Car> cars = new ArrayList<Car>();
		cars.add(car);
		cars.add(car1);
		cars.add(car2);
		for (Car car3 : cars) {
			System.out.println(car3);
		}
		
		List<School> schools = new ArrayList<School>();
		schools.add(school);
		schools.add(school1);
		schools.add(school2);
		for (School school3 : schools) {
			System.out.println(school3);
		}
		
		List<Television> televisions = new ArrayList<Television>();
		televisions.add(television);
		televisions.add(television1);
		televisions.add(television2);
		for (Television television3 : televisions) {
			System.out.println(television3);
		}
		
		
	}
}