package OnlineShoppingAPP;

import java.util.Map;

class Order {
    private static int orderCounter = 1;
    private int orderId;
    private Customer customer;
    private Map<Product, Integer> products;
    private String status;

    public Order(Customer customer, Map<Product, Integer> products) {
        this.orderId = orderCounter++;
        this.customer = customer;
        this.products = products;
        this.status = "Pending";
    }

    public int getOrderId() { return orderId; }
    public void setStatus(String status) { this.status = status; }
    public String getStatus() { return status; }

    @Override
    public String toString() {
        return "Order ID: " + orderId + ", Status: " + status + ", Products: " + products;
    }
}