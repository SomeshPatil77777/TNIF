package OnlineShoppingAPP;

import java.util.ArrayList;
import java.util.List;

class Customer extends User {
    private String address;
    private ShoppingCart shoppingCart;
    private List<Order> orders;

    public Customer(int userId, String username, String email, String address) {
        super(userId, username, email);
        this.address = address;
        this.shoppingCart = new ShoppingCart();
        this.orders = new ArrayList<>();
    }

    public ShoppingCart getShoppingCart() { return shoppingCart; }
    public List<Order> getOrders() { return orders; }

    public void placeOrder() {
        if (shoppingCart.isEmpty()) {
            System.out.println("Cart is empty. Cannot place an order.");
            return;
        }
        Order order = new Order(this, shoppingCart.getItems());
        orders.add(order);
        shoppingCart.clearCart();
        System.out.println("Order placed successfully! Order ID: " + order.getOrderId());
    }
}
