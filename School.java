package in.co.capgemini;

public class School {
	
	//Instance Variable
	private String name;
	private String city;
	private String district;
	private int greatSchoolranking;
	
	//Parameterised Constructor
	public School(String name, String city, String district, int greatSchoolranking) {
		super();
		this.name = name;
		this.city = city;
		this.district = district;
		this.greatSchoolranking = greatSchoolranking;
	}
	
	//Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public int getGreatSchoolranking() {
		return greatSchoolranking;
	}

	public void setGreatSchoolranking(int greatSchoolranking) {
		this.greatSchoolranking = greatSchoolranking;
	}

	@Override
	public String toString() {
		return "School [name=" + getName() + ", city=" +  getCity() + ", district=" + getDistrict() + ", greatSchoolranking="
				+ getGreatSchoolranking() +  "]";
	}
	
	
	
}
