package polymorphism;

public class Wolf extends Mammal{
	
	private double speed;
	
	public Wolf(float height, float weight, int age, boolean gender, String furColor, double speed) {
		super(height, weight, age, gender, furColor);
		this.speed = speed;
	}

	@Override
	public void toEmitSound(){ //false = x and true = y
		// TODO Auto-generated method stub
		System.out.println("Auuuuuuuuuuuuuuuuuuuuu");
	}
	
	@Override
	public void toMove(boolean xOrY, double time) { //false = x and true = y
		super.toMove(xOrY, time);
		if(xOrY == false)
			super.setPositionX(time*speed);
		else
			super.setPositionY(time*speed);
	}
	
	public void distance() {
		System.out.println("Travelled distance: " + Math.sqrt((Math.pow(super.getPositionX(), 2) + Math.pow(super.getPositionY(), 2))));
	}
}
