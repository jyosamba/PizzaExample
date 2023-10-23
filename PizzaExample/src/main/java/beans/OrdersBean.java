package beans;

import Entities.BooksEntity;
import Entities.CustomersEntity;
import Entities.PaymentsEntity;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;

public class OrdersBean {

    private int orderID;

    private CustomersEntity customerID;

    private int orderDate;

    private BooksEntity bookID;

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
