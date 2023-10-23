package Entities;


import javax.persistence.*;

@Entity
@Table(name="Publishers")
public class PublishersEntity {


    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="publisherID")
    private int publisherId;
    @Column(name="company_name")
    private String companyName;
    @Column(name="copyright")
    private Boolean copyright;

    public int getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(int publisherId) {
        this.publisherId = publisherId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Boolean getCopyright() {
        return copyright;
    }

    public void setCopyright(Boolean copyright) {
        this.copyright = copyright;
    }

}
