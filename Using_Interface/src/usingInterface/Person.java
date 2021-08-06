package usingInterface;

public class Person {
	
	private String name;
	private int age;
	private boolean gender; //true -> female and false -> male
	
	public Person(String name, int age, boolean gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	public void setAge() {
		age++;
	}
	public boolean isGender() {
		return gender;
	}
	
	public void happyBirthday() {
		setAge();
	}
}
