package OnlineShoppingAPP;

import java.util.Scanner;

public class ShoppingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductService productService = new ProductService();
        Customer customer = new Customer(1001, "Aniket", "aniket@gmail.com", "Nashik");

        while (true) {
            System.out.println("\n1. Admin Menu\n2. Customer Menu\n3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: //Admin
                    System.out.println("1. Add Product\n2. View Products\n3. Exit Admin");
                    int adminChoice = scanner.nextInt();
                    if (adminChoice == 1) {
                        System.out.print("Enter Product ID: ");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter Product Name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter Price: ");
                        double price = scanner.nextDouble();
                        System.out.print("Enter Stock: ");
                        int stock = scanner.nextInt();
                        productService.addProduct(new Product(id, name, price, stock));
                    } else if (adminChoice == 2) {
                        System.out.println(productService.getProducts());
                    }
                    break;

                case 2: // Customer
                    System.out.println("1. View Products\n2. Place Order\n3. Exit Customer");
                    int customerChoice = scanner.nextInt();
                    if (customerChoice == 1) {
                        System.out.println(productService.getProducts());
                    } else if (customerChoice == 2) {
                        customer.placeOrder();
                    }
                    break;

                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
            }
        }
    }
}