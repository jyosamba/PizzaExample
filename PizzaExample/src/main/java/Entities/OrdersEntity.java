package Entities;
import javax.persistence.*;

@Entity
@Table(name="Orders")
public class OrdersEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="orderID")
    private int orderID;
    @ManyToOne
    @JoinColumn(name="customerID")
    private CustomersEntity customerID;
    @Column(name="order_date")
    private int orderDate;
    @ManyToOne
    @JoinColumn(name="bookID")
    private BooksEntity bookID;
    @ManyToOne
    @JoinColumn(name="paymentID")
    private PaymentsEntity paymentID;
    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public CustomersEntity getCustomerID() {
        return customerID;
    }

    public void setCustomerID(CustomersEntity customerID) {
        this.customerID = customerID;
    }

    public int getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(int orderDate) {
        this.orderDate = orderDate;
    }

    public BooksEntity getBookID() {
        return bookID;
    }

    public void setBookID(BooksEntity bookID) {
        this.bookID = bookID;
    }

    public PaymentsEntity getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(PaymentsEntity paymentID) {
        this.paymentID = paymentID;
    }



}
