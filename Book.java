package firstExercise;

public class Book {
	private static int counter = 0;
	private int id;
	private String title;
	private String author;
	private String genre;
	private int pageCount;
	
	public Book(String title, String author, String genre, int pageCount) {
		this.id = counter++;
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.pageCount = pageCount;
	}
	
	public int getId() {
		return id;
	}
	
	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getGenre() {
		return genre;
	}

	public int getPageCount() {
		return pageCount;
	}
}
