package compound_Objects;

public class Fighter {
	
	private String name;
	private float weight;
	private float height;  
	private boolean champion_Belt;
	private short fight_Numbers;
	private short loosing_Number;
	private short victory_Numbers;
	private short draw_Numbers;
	private String path;
	
	public Fighter(String name, float weight, float height, boolean champion_Belt) {
		this.name = name;
		this.weight = weight;
		this.height = height;
		this.champion_Belt = champion_Belt;
		this.fight_Numbers = 0;
		this.loosing_Number = 0;
		this.victory_Numbers = 0;
		this.draw_Numbers = 0;
		this.path = "Emoji\\"+ getName() +".jpg";
	}

	public boolean isChampion_Belt() {
		return champion_Belt;
	}

	public void setChampion_Belt() {
		this.champion_Belt = !this.champion_Belt;
	}

	public short getFight_Numbers() {
		return fight_Numbers;
	}

	public void setFight_Numbers() {
		this.fight_Numbers++;
	}

	public short getLoosing_Number() {
		return loosing_Number;
	}

	public void setLoosing_Number() {
		this.loosing_Number++;
	}

	public short getVictory_Numbers() {
		return victory_Numbers;
	}

	public void setVictory_Numbers() {
		this.victory_Numbers++;
	}

	public short getDraw_Numbers() {
		return draw_Numbers;
	}

	public void setDraw_Numbers() {
		this.draw_Numbers++;
	}

	public String getName() {
		return name;
	}

	public float getWeight() {
		return weight;
	}

	public float getHeight() {
		return height;
	}
	
	public int  makeWeightClass() {
		if(this.weight <= 61.5)
			return 0;
		else if(this.weight <= 77.2)
			return 1;
		else if(this.weight <= 93)
			return 2;
		else
			return 3;
	}
	
	@Override
	public String toString() {
		if(isChampion_Belt())
			return getName() + " fought " + getFight_Numbers() + " times! His score is ===========> Wins: " + getVictory_Numbers() + ", Looses: " + getLoosing_Number() + ", Draws: " + getDraw_Numbers() + ". He is the current CHAMPION!\n";
		else
			return getName() + " fought " + getFight_Numbers() + " times! His score is ===========> Wins: " + getVictory_Numbers() + ", Looses: " + getLoosing_Number() + ", Draws: " + getDraw_Numbers() + ".\n";
	}
}
