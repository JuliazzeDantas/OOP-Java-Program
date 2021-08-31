package inheritance;

public class Functionary extends Person{
	
	private String sector;
	private boolean working;
	
	public Functionary(String name, int age, boolean gender, String sector) {
		super(name, age, gender);
		this.sector = sector;
		this.working = false;
	}

	public boolean isWorking() {
		return working;
	}

	public String getSector() {
		return sector;
	}

	public void toWork() {
		this.working = !this.working;
	}
	
	@Override
	public String action() {
		return "Functionary - To work!";
	}
	
	@Override
	public String toString() {
		return super.toString() + " This functionary is in the sector " + getSector() + ".";
	}
}
