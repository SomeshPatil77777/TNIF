package OnlineShoppingAPP;

import java.util.ArrayList;
import java.util.List;

class ProductService {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Product added: " + product);
    }

    public List<Product> getProducts() { return products; }
}