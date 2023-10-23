package Entities;
import javax.persistence.*;

@Entity
@Table(name="Genres")
public class GenresEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="genreID")
    private int genreID;

    @Column(name="name")
    private String name;
    @Column(name="fiction")
    private boolean fiction;
    public int getGenreID() {
        return genreID;
    }

    public void setGenreID(int genreID) {
        this.genreID = genreID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFiction() {
        return fiction;
    }

    public void setFiction(boolean fiction) {
        this.fiction = fiction;
    }

}
