package inheritance;

public class ScholarShipStudent extends Student{
	
	private boolean scholarship;

	public ScholarShipStudent(String name, int age, boolean gender, String registration, String major,
			boolean scholarship) {
		super(name, age, gender, registration, major);
		this.scholarship = scholarship;
	}
	
	public boolean isScholarship() {
		return this.scholarship;
	}
	
	@Override
	public String toString() {
		return super.toString() + " This student has the enrollment " + getEnrollment() + " and major " + getMajor() + ". This student has a scholarship!";
	}
}
