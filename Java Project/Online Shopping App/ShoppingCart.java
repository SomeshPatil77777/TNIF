package OnlineShoppingAPP;

import java.util.HashMap;
import java.util.Map;

class ShoppingCart {
    private Map<Product, Integer> items = new HashMap<>();

    public void addProduct(Product product, int quantity) {
        items.put(product, items.getOrDefault(product, 0) + quantity);
        System.out.println(quantity + " " + product.getName() + "(s) added to cart.");
    }

    public Map<Product, Integer> getItems() { return items; }
    public boolean isEmpty() { return items.isEmpty(); }
    public void clearCart() { items.clear(); }
}