package firstExercise;

import java.util.HashMap;

public class Service {
	HashMap<Integer, Book> bookStore = new HashMap<Integer, Book>();
	
	public void addBook(String title, String author, String genre, int pageCount){
		Book book = new Book(title, author, genre, pageCount);
		bookStore.put(book.getId(), book);
	}
	
	public Book getBook(int id){
		return bookStore.get(id);
	}
	
	public void deleteBook(int id){
		bookStore.remove(id);
	}
	
}
