package objects;

public class Request {
	Book book;
	User user;
	boolean teaching;
	int priority;

	public Request(Book book, User user, boolean teaching) {
		this.book = book;
		this.user = user;
		this.teaching = teaching;
	}

	public Book getBook() {
		return this.book;
	}

	public boolean isTeaching() {
		return teaching;
	}

	public void setPriority(int n) {
		this.priority = n;
	}

	public int getPriority() {
		return this.priority;
	}

}