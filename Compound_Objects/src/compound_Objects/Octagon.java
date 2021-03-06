package compound_Objects;

import java.util.Random;

public class Octagon {
	
	public Match[] match = new Match[2000];
	
	public Octagon() {
		
	}
	
	public int getRandomNumberUsingInts(int min, int max) {
	    Random random = new Random();
	    return random.ints(min, max)
	      .findFirst()
	      .getAsInt();
	}
	
	public void createFight() {
		Match aux;
		for(int counter = 0; counter < 2000; counter++) {
			aux  = new Match();
			
			int n1, n2;
			n1 = (int) getRandomNumberUsingInts(0, 23);
			n2 = (int) getRandomNumberUsingInts(0, 23);
			
			if(n1 == n2) {
				if(n2 == 23)
					n2 = 0;
				else
				n2++;
			}
			
			aux.setF1(n1);
			aux.setF2(n2);
			match[counter] = aux;
		}
	}
	public void announcementOfTheNewChampion(Fighter f1, Fighter f2) {
		int weightClass = f1.makeWeightClass();
		if(weightClass == 0)
			System.out.println(f1.getName() + " is the new Lightweight champion!");
		else if(weightClass == 1)
			System.out.println(f1.getName() + " is the new Middletweight champion!");
		else if(weightClass ==2)
			System.out.println(f1.getName() + " is the new Heavyweight champion!");
		else	
			System.out.println(f1.getName() + " is the new Ultraheavyweight champion!");
	}
	
	public void victory(Fighter f1, Fighter f2) {
		f1.setVictory_Numbers();
		f2.setLoosing_Number();
		System.out.println(f1.getName() + " won!");
		if(f2.isChampion_Belt()) {
			f2.setChampion_Belt();
			f1.setChampion_Belt();
			announcementOfTheNewChampion(f1, f2);
		}
	}
	
	public boolean  comparationWeight(Fighter f1, Fighter f2) {
		if(f1.makeWeightClass() == f2.makeWeightClass()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void draw(Fighter f1, Fighter f2) {
		f1.setDraw_Numbers();
		f2.setDraw_Numbers();
	}
	
	public int fight(Fighter f1, Fighter f2) {
		
		if(comparationWeight(f1, f2)) {
			Random r = new Random();
			
			f1.setFight_Numbers();
			f2.setFight_Numbers();
			
			int test = r.nextInt((3-1)+1)+1;
			
			if(test == 3) {
				victory(f1, f2);
				return 1;
			}
			else if(test == 2) {
				victory(f2, f1);
				return 2;
			}
			else {  //test == 3
				draw(f1,f2);
				return 0;
			}
		}
		else {
			System.out.println("The fight is not going to happen due to the weight difference!");
			return 3;
		}
		
	}	
}
