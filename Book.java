package firstExercise;

public class Book {
	private String title;
	private String author;
	private String genre;
	private int pageCount;
	
	public Book(String title, String author, String genre, int pageCount) {
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.pageCount = pageCount;
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
