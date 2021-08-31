package polymorphism;

public class Dog extends Wolf{

	
	public Dog(float height, float weight, int age, boolean gender, String furColor, double speed) {
		super(height, weight, age, gender, furColor, speed);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void toEmitSound(){ //false = x and true = y
		// TODO Auto-generated method stub
		System.out.println("Woof Woof!");
	}
	
	public void reaction(String sentence) {
		if(sentence == "Hello!" || sentence == "Let's play!")
			System.out.println("To be happy!");
		else
			System.out.println("To growl and to bark!");
	}
	
	public void reaction(int hour) {
		if(hour <= 5)
			System.out.println("To ignore!");
		else if(hour <= 20)
			System.out.println("To play");
		else
			System.out.println("To ignore");
	}
	
	public void reaction(boolean owner) {
		if(owner) {
			System.out.println("To be happy!");
		}
		else
			System.out.println("to growl and to bark!");
	}
	
}
