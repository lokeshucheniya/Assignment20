package in.co.capgemini;

public class Car {
	
	private String model;
	private double price;
	private int year;
	private String manufacturer;
	

	public Car(String model, double price, int year, String manufacturer) {
		super();
		this.model = model;
		this.price = price;
		this.year = year;
		this.manufacturer = manufacturer;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	@Override
	public String toString() {
		return "Car [model=" + getModel() + ", price=" + getPrice() + ", year=" + getYear()
				+ ", manufacturer=" + getManufacturer() + "]";
	}
	

}
