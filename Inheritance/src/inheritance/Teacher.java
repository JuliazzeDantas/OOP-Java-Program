package inheritance;

public class Teacher extends Person{
	
	private String degree;
	private double salary;
	
	public Teacher(String name, int age, boolean gender, String degree, double salary) {
		super(name, age, gender);
		this.degree = degree;
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDegree() {
		return degree;
	}
	
	public void increaseSalary(double salary){
		setSalary(salary);
	}
	
	@Override 
	public String action() {
		return "Teacher - To learn!";
	}
	
	@Override
	public String toString() {
		return super.toString() + " This teacher has the degree " + getDegree() + " and salary " + getSalary() + ".";
	}
}
