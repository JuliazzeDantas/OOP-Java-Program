package polymorphism;

public class Mammal extends Animal{
	
	private String furColor;
	private boolean getPregnant;
	public Mammal(float height, float weight, int age, boolean gender, String furColor) {
		super(height, weight, age, gender);
		this.furColor = furColor;
		this.getPregnant = false;
	}
	
	
	@Override
	public void toMove(boolean xOrY, double time) { //false = x and true = y
		// TODO Auto-generated method stub
		System.out.println("To run!");
	}
	@Override
	public void toEat() {
		// TODO Auto-generated method stub
		System.out.println("Baby => to nurse");
		System.out.println("Adult => to eat");
	}
	@Override
	public void toEmitSound() {
		// TODO Auto-generated method stub
		System.out.println("Generic mammal sound!");
	}

	public boolean isGetPregnant() {
		return getPregnant;
	}
	
	public void giveBirth() {
		if(isGetPregnant() == true) {
			System.out.println("A new baby was born!");
			setGetPregnant(false);
		}
	}

	public void setGetPregnant(boolean getPregnant) {
		if(isGender() == false)
			this.getPregnant = getPregnant;
	}


	public String getFurColor() {
		return furColor;
	}
	
}
