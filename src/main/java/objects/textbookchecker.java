package objects;

public class textbookchecker extends observer{
    public textbookchecker(Textbook textbook){
        this.textbook = textbook;
        this.textbook.attachObserver(this);
    }
    public void update(){
        System.out.println("There is a new edition for this book");
    }
}