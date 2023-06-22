package eviden;

public class Car {
	int model;
	int year;
	String name;
	public Car(int model, int year, String name) {
		super();
		this.model = model;
		this.year = year;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Car [model=" + model + ", year=" + year + ", name=" + name + "]";
	}
	
	

}
