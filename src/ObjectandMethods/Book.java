package ObjectandMethods;

public class Book {
    private final String nameBook;
    private final Authors authors;
    private  int yearPublisher;

    public Book(String nameBook, Authors authors, int yearPublisher) {
        this.nameBook = nameBook;
        this.authors = authors;
        this.yearPublisher = yearPublisher;
    }

    public String getNameBook() {
        return nameBook;
    }

    public Authors getAuthors() {
        return authors;
    }

    public int getYearPublisher() {
        return yearPublisher;
    }

    public void setYearPublisher(int yearPublisher) {
        this.yearPublisher = yearPublisher;
    }
}
