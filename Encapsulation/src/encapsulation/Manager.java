package encapsulation;

public class Manager {

	public static void main(String[] args) {
		
		TVRemoteControl c1 = new TVRemoteControl();
		TVRemoteControl c2 = new TVRemoteControl();
		
		
		System.out.println("Controle 1: " + c1.toString());
		System.out.println("Controle 2: " + c2.toString());
		System.out.println();
		
		
		c2.turnDownSound();
		c2.mute();
		
		//System.out.println("Sound: " + c2.sound);  ==> It doesn't work because sound is private
		
		c1.turnOnOff();
		c1.turnUpSound();
		c1.turnUpSound();
		c1.turnUpSound();
		c1.turnUpSound();
		c1.turnUpSound();
		c1.mute();
		c1.turnUpSound();
		c1.turnUpSound();
		c1.channel((short)37);
		
		System.out.println("Controle 1: " + c1.toString());
		System.out.println("Controle 2: " + c2.toString()); //It doesn't change, because turnOnOff() wasn't activated
		
	}

}
