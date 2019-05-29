package day53_Inheritance06;

public class Capital extends City{

	private long population;
	public int count =1;
	public Capital(int id, String name, long population ) {
		super(id, name);
		this.population = population;
		
	}
	@Override
	public String toString() {
		return super.toString()+ " population: "+ population + " CapCount: "+count;
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}
	
	
	public void displayCount() {
		System.out.println("City count: "+ super.count);
		System.out.println("Capital count: "+ count);
	}
	//
	public static void buildARaod() {
		System.out.println("Capital City - building a road");
	}
	
}
