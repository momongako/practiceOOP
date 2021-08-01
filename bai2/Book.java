package bai2;

public class Book extends Library{
private String nameBook;
private int numberBook;
    public Book(String numberDocument, String aouthor, String releaseNumber, String nameBook, int numberBook) {
        super(numberDocument, aouthor, releaseNumber);
        //TODO Auto-generated constructor stub
        this.nameBook = nameBook;
        this.numberBook = numberBook;
    }
    public String getNameBook() {
        return nameBook;
    }
    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }
    public int getNumberBook() {
        return numberBook;
    }
    public void setNumberBook(int numberBook) {
        this.numberBook = numberBook;
    }
    @Override
    public String toString() {
        return "Book [nameBook=" + nameBook + ", numberBook=" + numberBook +
        "aouthor=" + aouthor + ", numberDocument=" + numberDocument + ", releaseNumber=" + releaseNumber
        + "]";
    }
    
}
