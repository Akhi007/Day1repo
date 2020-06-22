class Book{
	 private String title;
	private String author;
	
	public Book() {
		title="a";
		author="b";
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


	//void setBookDetails(String t, String a) {
	//title=t;
	//author=a;
	//void showBookDetails() {
	//System.out.println(title +" "+ author);
	
	
		
	}
	

public class classDemo {

	public static void main(String[] args) {
		
	Book book=new Book();
	System.out.println(book.getTitle());
	//book.showBookDetails();
     
	//System.out.println(title  +"  "+ author);
	}
}
