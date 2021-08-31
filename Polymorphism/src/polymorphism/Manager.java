package polymorphism;

public class Manager {
	
	public static  void main( String [] args) {
		
		Mammal m1 = new Mammal(1.5F, 70F, 30, true, "blue");
		Reptile r1 = new Reptile(0.2F, 3F, 4, false, "green");
		Fish f1 = new Fish(0.09F, 0.5F, 2, true, "red");
		Wolf w1 = new Wolf(0.9F, 20F, 10, false, "gray", 35);
		Dog d1 = new Dog(0.6F, 10F, 8, true, "black", 20);
		
		System.out.println("Mammal!");
		m1.toEat();
		m1.toMove(false, 100);
		m1.toEmitSound();
		m1.giveBirth();
		
		System.out.println("\nReptile!");
		r1.toEat();
		r1.toMove(true, 55);
		r1.toEmitSound();
		
		System.out.println("\nFish!");
		f1.toEat();
		f1.toMove(false, 4444);
		f1.toEmitSound();
		
		System.out.println("\nWolf!");
		w1.toEat();
		w1.toMove(false, 100);
		w1.toMove(false, 100);
		w1.toMove(true, 100);
		w1.toMove(true, 100);
		w1.toMove(false, 100);
		w1.distance();
		w1.toEmitSound();
		w1.giveBirth();
		
		System.out.println("\nDog!");
		d1.toEat();
		d1.toMove(false, 500);
		d1.toMove(true, 100);
		d1.toMove(true, 100);
		d1.toMove(true, 300);
		d1.toMove(false, 100);
		d1.distance();
		d1.toEmitSound();
		d1.giveBirth();
		d1.reaction("Hello!");
		d1.reaction(15);
		d1.reaction(23);
		d1.reaction(false);
	}

}
