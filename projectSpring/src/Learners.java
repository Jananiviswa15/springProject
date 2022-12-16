
//encapsulated cls, POJO (plain old java object)
public class Learners {

	private String name;
	private int age;
	
	public Learners(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	Learners(String name) {
		this.name = name;
	}
	
	Learners(int age) {
	
		this.age = age;
	}
	Learners(){
		System.out.println("constr");
	}
	void display() {
		System.out.println("name is : "+name + " "+age);
	}

/*	public String getName() {
		return name;
	}

	public void setName(String name) {
//		System.out.println("i ca,e here to assign value");
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}*/
}
