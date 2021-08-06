package usingInterface;

public class Manager {
	public static void main(String[] args) {
		
		Person p1 = new Person("John", 39, false);
		Person p2 = new Person("Anne", 40, true);
		
		Book b1 = new Book("The Ocean", "P. S. Will", 654, false, p1);
		
		b1.detail();
		
		b1.toOpen();
		b1.browseThrough(300);
		b1.goToTheNextPage();
		b1.goToTheNextPage();
		b1.goToTheNextPage();
		b1.goToTheNextPage();
		
		b1.detail();
		
		b1.setReader(p2);
		
		b1.goToThePreviousPage();
		b1.goToThePreviousPage();
		b1.goToThePreviousPage();
		b1.goToThePreviousPage();
		b1.goToThePreviousPage();
		b1.goToThePreviousPage();
		b1.goToThePreviousPage();
		
		b1.detail();
		
		b1.toClose();
		
		b1.detail();
		
		
	}
	
}
