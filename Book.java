public class Book {
    private String id, title, author, publisher, year, isbn, copies;

    public Book(String id, String title, String author, String publisher, String year, String isbn, String copies) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.isbn = isbn;
        this.copies = copies;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public String getPublisher() { return publisher; }
    public void setPublisher(String publisher) { this.publisher = publisher; }

    public String getYear() { return year; }
    public void setYear(String year) { this.year = year; }

    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }

    public String getCopies() { return copies; }
    public void setCopies(String copies) { this.copies = copies; }
}

