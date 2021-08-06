package inheritance;

public class Manager {
	public static void main(String[] args) {
		
		Person p1 = new Person("Mary", 35, true);
		Student s1 = new Student("John", 20, false, "111920", "Nutrition");
		Teacher t1 = new Teacher("Silvy", 40, true, "Math", 3000);
		Functionary f1 = new Functionary("Willian", 60, true, "T.I.");
		
		System.out.println(p1.toString());
		System.out.println(s1.toString());
		System.out.println(t1.toString());
		System.out.println(f1.toString());
	}	
}
