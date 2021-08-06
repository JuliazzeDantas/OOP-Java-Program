package firstProgram;

public class Pen {

	private String model;
	private String color;
	private float tipThickness;
	private float amountOfInk;
	private boolean capped;
	
	public Pen(String model, String color, float tipThickness, float amountOfInk, boolean capped) {
		this.model = model;
		this.color = color;
		this.tipThickness = tipThickness;
		this.amountOfInk = amountOfInk;
		this.capped = capped;
	}
	
	public float getAmountOfInk() {
		return amountOfInk;
	}

	public void setAmountOfInk(float amountOfInk) {
		this.amountOfInk = amountOfInk;
	}

	public boolean isCapped() {
		return capped;
	}

	public String getModel() {
		return model;
	}

	public String getColor() {
		return color;
	}

	public float getTipThickness() {
		return tipThickness;
	}

	public void toWrite() {
		if(!isCapped()) {
			System.out.println("You Wrote!");
		}
		else {
			System.out.println("Error! Your pen is capped.");
		}
	}
	
	public void capThePen() {
		capped = true;
	}
	
	public void uncapThePen() {
		capped = false;
	}
	
	@Override
	public String toString() {
		return "model: " + model + ", color: " + color + ", tip thickness" + tipThickness + ", percent of ink: " + amountOfInk + ", it is capped: " + capped;
	}

}
