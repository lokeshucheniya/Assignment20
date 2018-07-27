package in.co.capgemini;

public class Collection {
	 public static void main(String args[]) {
		 Car car = new Car("Figo",3000000,1990,"Ford");
		 Car car1 = new Car("Suzuki",3000000,1990,"Ford");
		 Car car2 = new Car("Figo",3000000,1990,"Ford");
		 
		 
		 CellPhone cellphone = new CellPhone("Moto","MotoZ2Play","Improved Features","Android",30000);
		 CellPhone cellphone1 = new CellPhone("Moto","MotoZ2Play","Improved Features","Android",30000);
		 CellPhone cellphone2 = new CellPhone("Moto","MotoZ2Play","Improved Features","Android",30000);
		 
		 
		 Laptop laptop = new Laptop("Dell", "xps13", "windows", "i5");
		 Laptop laptop1 = new Laptop("Dell", "xps13", "windows", "i5");
		 Laptop laptop2 = new Laptop("Dell", "xps13", "windows", "i5");
		 
		 
		 School school = new School(" "," "," "," ");
		 School school1 = new School(" "," "," "," ");
		 School school2 = new School(" "," "," "," ");
		 
		 
		 Television television = new Television(" "," "," "," ");
		 Television television1 = new Television(" "," "," "," ");
		 Television television2 = new Television(" "," "," "," ");
		 
		 
		 OperatingSystem operatingsystem = new OperatingSystem(" "," "," "," ");
		 OperatingSystem operatingsystem1 = new OperatingSystem(" "," "," "," ");
		 OperatingSystem operatingsystem2 = new OperatingSystem(" "," "," "," ");
		 
		 List<Car> cars = new ArrayList<Car>();
		 cars.add(car);
		 cars.add(car1);
		 cars.add(car2);
		 for(Car cars3 : cars) {
			 System.out.println(car3);
		 }
		 
		 List<CellPhone> cellphones = new ArrayList<CellPhone>();
		 cellphones.add(cellphone);
		 cellphones.add(cellphone1);
		 cellphones.add(cellphone2);
		 for(CellPhone cellphone3 : cellphones) {
			 System.out.println(cellphone3);
		 }
		 
		 List<Laptop> laptops = new ArrayList<Laptop>();
		 laptops.add(laptop);
		 laptops.add(laptop1);
		 laptops.add(laptop2);
		 for(CellPhone laptop3 : laptops) {
			 System.out.println(cellphone3);
		 }
		 		  
	 }
}
