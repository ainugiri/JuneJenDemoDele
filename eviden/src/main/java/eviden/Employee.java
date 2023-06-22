package eviden;

public class Employee {
	String DASID;
	public String getDASID() {
		return DASID;
	}
	public void setDASID(String dASID) {
		DASID = dASID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	String Name;
	int age;
	@Override
	public String toString() {
		return "Employee [DASID=" + DASID + ", Name=" + Name + ", age=" + age + "]";
	}
	
	

}
