package polymorphism;

public class Reptile extends Animal{
	
	public String color;
	
	public Reptile(float height, float weight, int age, boolean gender, String color) {
		super(height, weight, age, gender);
		this.color = color;
	}

	@Override
	public void toMove(boolean xOrY, double time) {
		// TODO Auto-generated method stub
		System.out.println("To crawl!");
	}

	@Override
	public void toEat() {
		// TODO Auto-generated method stub
		System.out.println("To eat");
	}

	@Override
	public void toEmitSound() {
		// TODO Auto-generated method stub
		System.out.println("Generic reptile sound!");
	}
	
}
