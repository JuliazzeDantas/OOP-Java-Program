package firstProgram;

public class PenManager {
	public static void main(String[] args) {
		
		Pen pen1 = new Pen("X-model", "black", 0.3f, 100.0f, true);
		Pen pen2 = new Pen("Y-model", "white", 0.7f, 100.0f, false);
		
		System.out.println(pen1.toString());
		System.out.println(pen2.toString());
		
		pen1.toWrite();
		pen1.uncapThePen();
		
		System.out.println(pen1.toString());
		
		pen1.toWrite();
	}
}
