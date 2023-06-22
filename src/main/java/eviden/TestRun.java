package eviden;

public class TestRun {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		((Employee) e1).setAge(20);
		((Employee) e1).setDASID("A999999");
		((Employee) e1).setName("Nash");
		System.out.println(e1.toString());
	}

}
