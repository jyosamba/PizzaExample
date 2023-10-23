package beans;


public class BooksBean {

    private boolean hardcover;

    private String title;

    private int issue;

    private int isbn;

    private int bookID;


    private AuthorBean authorID;


    private PublishersBean publisherID;
    public boolean isHardcover() {
        return hardcover;
    }

    public void setHardcover(boolean hardcover) {
        this.hardcover = hardcover;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getIssue() {
        return issue;
    }

    public void setIssue(int issue) {
        this.issue = issue;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public AuthorBean getAuthorID() {
        return authorID;
    }

    public void setAuthorID(AuthorBean authorID) {
        this.authorID = authorID;
    }

    public PublishersBean getPublisherID() {
        return publisherID;
    }

    public void setPublisherID(PublishersBean publisherID) {
        this.publisherID = publisherID;
    }



}

