package polymorphism;

public abstract class Animal {
	
	private float height;
	private float weight;
	private int age;
	private boolean gender; //true = male and false = female
	private double positionX;
	private double positionY;
	private boolean alive;
	
	public Animal(float height, float weight, int age, boolean gender) {
		this.height = height;
		this.weight = weight;
		this.age = age;
		this.gender = gender;
		this.positionX = 0;
		this.positionY = 0;
		this.alive = true;
	}
	
	public abstract void toMove(boolean xOrY, double time);
	public abstract void toEat();
	public abstract void toEmitSound();

	public double getPositionX() {
		return positionX;
	}

	public void setPositionX(double positionX) {
		this.positionX = positionX;
	}

	public double getPositionY() {
		return positionY;
	}

	public void setPositionY(double positionY) {
		this.positionY = positionY;
	}

	public float getHeight() {
		return height;
	}

	public float getWeight() {
		return weight;
	}

	public int getAge() {
		return age;
	}

	public boolean isGender() {
		return gender;
	}

	public boolean isAlive() {
		return alive;
	}
	
}
