package day53_Inheritance06;

public class City {

	private int id;
	private String name;
	public int count = 100;
	
	public static void buildARaod() {
		System.out.println("City - building a road");
	}
	public void letsBuildARoad() {
		buildARaod();
	}
	
	public City(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int hashCode() {
		return id + name.length();
	}

	@Override
	public String toString() {
		return "ID: " + id + " Name: " + name +" count: "+ count;
	}

	@Override
	public boolean equals(Object obj) {
		City anotherCity = (City) obj;
		if (this.id == anotherCity.id && this.name.equals(anotherCity.name)) {
		  return true;
		}
		  return false;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
