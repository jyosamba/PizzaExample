package beans;


import javax.validation.constraints.NotNull;

public class OrderDetailsBean {

    private OrdersBean orderID;

    private BooksBean bookID; //Change FK in table

    @NotNull
    private int quantity;
    //price per book

    private float ppb;

    public OrdersBean getOrderID() {
        return orderID;
    }

    public void setOrderID(OrdersBean orderID) {
        this.orderID = orderID;
    }

    public BooksBean getBookID() {
        return bookID;
    }

    public void setBookID(BooksBean bookID) {
        this.bookID = bookID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPpb() {
        return ppb;
    }

    public void setPpb(float ppb) {
        this.ppb = ppb;
    }

}
