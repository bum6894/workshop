package icehs.science.workshop3.book;

public class Book {
	private String isbn;
	private String title;
	private String author;
	private int price;
	private String issueData;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public Book(String isbn, String title, String author, int price) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public Book(String isbn, String title, String author, int price, String issueData) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.price = price;
		this.issueData = issueData;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIssueData() {
		return issueData;
	}

	public void setIssueData(String issueData) {
		this.issueData = issueData;
	}

	public String getIsbn() {
		return isbn;
	}

	public int getPrice() {
		return price;
	}
	
	public void printBookInfo() {
		System.out.println("[力格]" + title + "[历磊]" + author);
	}
	private void printDate(String date) {
		printBookInfo(); System.out.println("[惯青老]" + date);
	}
	
}
