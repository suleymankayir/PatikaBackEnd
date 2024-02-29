public class Book implements Comparable {

    private String bookName;
    private int bookPageNumber;
    private String writerName;
    private String publishDate;

    public Book(String bookName, int bookPageNumber, String writerName, String publishDate) {
        this.bookName = bookName;
        this.bookPageNumber = bookPageNumber;
        this.writerName = writerName;
        this.publishDate = publishDate;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookPageNumber() {
        return bookPageNumber;
    }

    public void setBookPageNumber(int bookPageNumber) {
        this.bookPageNumber = bookPageNumber;
    }

    public String getWriterName() {
        return writerName;
    }

    public void setWriterName(String writerName) {
        this.writerName = writerName;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
