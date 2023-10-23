package Entities;
import javax.persistence.*;

@Entity
@Table(name="Books")
public class BooksEntity {
    @Column(name="hardcover")
    private boolean hardcover;
    @Column(name="title")
    private String title;
    @Column(name="issue")
    private int issue;
    @Column(name="isbn")
    private int isbn;
    @Id
    @Column(name="bookID")
    private int bookID;

    @ManyToOne
    @JoinColumn(name="authorID")
    private AuthorEntity authorID;

    @ManyToOne
    @JoinColumn(name="publisherID")
    private PublishersEntity publisherID;
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

    public AuthorEntity getAuthorID() {
        return authorID;
    }

    public void setAuthorID(AuthorEntity authorID) {
        this.authorID = authorID;
    }

    public PublishersEntity getPublisherID() {
        return publisherID;
    }

    public void setPublisherID(PublishersEntity publisherID) {
        this.publisherID = publisherID;
    }



}
