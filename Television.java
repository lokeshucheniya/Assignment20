package in.co.capgemini;

public class Television {
	
	//Instance Variable
	private String company;
	private String type;
	private String enabled;
	private int price;
	
	//Parameterised Constructor
	public Television(String company, String type, String enabled, int price) {
		super();
		this.company = company;
		this.type = type;
		this.enabled = enabled;
		this.price = price;
	}
	
	//Getters and Setters
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getEnabled() {
		return enabled;
	}
	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Television [company=" + getCompany() + ", type=" + getType() + ", enabled=" + getEnabled() + ", price=" + getPrice() + "]";
	}
	
}
