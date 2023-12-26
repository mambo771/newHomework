package ObjectandMethods;

public class Book {
    private final String titleBook;
    private final Authors authors;
    private  int yearPublisher;

    public Book(String titleBook, Authors authors, int yearPublisher) {
        this.titleBook = titleBook;
        this.authors = authors;
        this.yearPublisher = yearPublisher;
    }

    public String getTitleBook() {
        return titleBook;
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
