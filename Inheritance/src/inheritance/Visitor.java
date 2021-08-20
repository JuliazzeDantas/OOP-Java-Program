package inheritance;

public class Visitor extends Person{

	public Visitor(String name, int age, boolean gender) {
		super(name, age, gender);
		// TODO Auto-generated constructor stub
	}
	
	/*
	@Override  
	public final void happyBirthday() {  =====> I can't do it. happyBirthday() is a final method!
		super.happyBirthday();
	}*/
	
	@Override
	public String getName() {
		return super.getName();
	}
	
	@Override
	public int getAge() {
		return super.getAge();
	}
	
	@Override
	public boolean isGender() {
		return super.isGender();
	}	
	
	@Override
	public String toString() {
		if(isGender())
			return "His name is " + getName() + ". He is " + getAge() + " years old!";
		else
			return "Her name is " + getName() + ". She is " + getAge() + " years old!";
	}
}
