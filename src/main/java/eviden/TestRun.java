package eviden;

public class TestRun {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setAge(20);
		e1.setDASID("A999999");
		e1.setName("Nash");
		System.out.println(e1.toString());
		
		Car c1 = new Car(2020, 2021, "Suz");
		System.out.println(c1.toString());
	}

}
