package in.co.capgemini;

public class CellPhone {
	//Instance variable
	private String model;
	private String brand;
	private int price;
	private String specs;
	private String technology;
	
	//Parameterised Constructor
	public CellPhone(String model, String brand, int price, String specs, String technology) {
		super();
		this.model = model;
		this.brand = brand;
		this.price = price;
		this.specs = specs;
		this.technology = technology;
	}
	
	//Getters and Setters
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getSpecs() {
		return specs;
	}
	public void setSpecs(String specs) {
		this.specs = specs;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	
	@Override
	public String toString() {
		return "CellPhone [model=" + getModel() + ", brand=" + getBrand() + ", price=" + getPrice() + ", specs=" + getSpecs()
				+ ", technology=" + getTechnology() + "]";
	}
	
	
}
