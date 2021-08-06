package usingInterface;

public class Book implements Publication{
	
	private String title;
	private String author;
	private int totalPage;
	private int currentPage;
	private boolean open;
	private Person reader;
	
	
	
	public Book(String title, String author, int totalPage, boolean open, Person reader) {
		this.title = title;
		this.author = author;
		this.totalPage = totalPage;
		this.currentPage = 0;
		this.open = open;
		this.reader = reader;
	}

	public void detail() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		if(reader.isGender())
			return "The book " + getTitle() + " was written by " + getAuthor() +". " + getReader() + " is reading this book. She is on page " + getCurrentPage() + ".";
		else
			return "The book " + getTitle() + " was written by " + getAuthor() +". " + getReader() + " is reading this book. He is on page " + getCurrentPage() + ".";
	}
	
	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		if(currentPage <= getTotalPage())
			this.currentPage = currentPage;
		else
			this.currentPage = getTotalPage();
	}

	public boolean isOpen() {
		return open;
	}

	public void setOpen(boolean open) {
		this.open = open;
	}

	public String getReader() {
		return reader.getName();
	}

	public void setReader(Person reader) {
		this.reader = reader;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getTotalPage() {
		return totalPage;
	}

	@Override
	public void toOpen() {
		// TODO Auto-generated method stub
		this.open = true;
	}

	@Override
	public void toClose() {
		// TODO Auto-generated method stub
		this.open = false;
		setCurrentPage(0);
	}

	@Override
	public void browseThrough(int page) {
		// TODO Auto-generated method stub
		setCurrentPage(page);
	}

	@Override
	public void goToTheNextPage() {
		// TODO Auto-generated method stub
		setCurrentPage(getCurrentPage() + 1);
	}

	@Override
	public void goToThePreviousPage() {
		// TODO Auto-generated method stub
		setCurrentPage(getCurrentPage() - 1);
	}
	
}
