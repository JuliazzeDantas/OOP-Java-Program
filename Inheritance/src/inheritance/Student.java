package inheritance;

public class Student extends Person{

	private String enrollment;
	private String major;
	
	public Student(String name, int age, boolean gender, String registration, String major) {
		super(name, age, gender);
		this.enrollment = registration;
		this.major = major;
	}
	
	public String getEnrollment() {
		return enrollment;
	}

	public String getMajor() {
		return major;
	}

	public void cancelEnrollment() {
		this.enrollment = null;
	}
	
	@Override
	public String toString() {
		return super.toString() + " This student has the enrollment " + getEnrollment() + " and major " + getMajor() + ".";
	}
	
}
