package inheritance;

public class Person {
	
	private String name;
	private int age;
	private boolean gender; //true -> female and false -> male
	
	public Person(String name, int age, boolean gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public void happyBirthday() {
		age++;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public boolean isGender() {
		return gender;
	}	
	
	@Override
	public String toString() {
		if(gender)
			return "His name is " + getName() + ". He is " + getAge() + " years old!";
		else
			return "Her name is " + getName() + ". She is " + getAge() + " years old!";
	}
}
