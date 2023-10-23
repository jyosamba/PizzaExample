package beans;


import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Size;

public class AuthorBean {


    private String name;

    private int authorID;

    public boolean dead;

    private String alias;
    public String geName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAuthorID() {
        return authorID;
    }

    public void setAuthorID(int authorID) {
        this.authorID = authorID;
    }

    public boolean getDead() {
        return dead;
    }

    public void setDead(boolean dead) {
        this.dead = dead;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

}

