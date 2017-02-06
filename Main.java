package firstExercise;

public class Main {
	public static void main(String [] args){
		Service service = new Service();
		
		service.addBook("Lord of the Rings", "J.R.R Tolkien", "Fantasy", 1000);
		service.addBook("The Hobbit", "J.R.R. Tolkien", "Fantasy", 250);
		
		System.out.println(service.getBook(1).getTitle());
		
		service.deleteBook(1);
		
		System.out.println(service.getBook(1).getTitle());
		
	}
}
