package objects;

public class TextbookChecker extends observer {

  private Textbook textbook;

  public TextbookChecker(Textbook textbook) {
    this.textbook = textbook;
    this.textbook.attachObserver(this);
  }

  public void update() {
    System.out.println("There is a new edition for this book");
  }
}
