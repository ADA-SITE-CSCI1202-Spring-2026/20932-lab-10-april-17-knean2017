import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 999.99, true));
        products.add(new Product("Headphones", 49.99, true));
        products.add(new Product("Mouse", 19.99, false));
        products.add(new Product("Keyboard", 29.99, true));
        products.add(new Product("Monitor", 199.99, false));

        Predicate<Product> isAffordable = product -> product.price < 50 && product.inStock;

        products.removeIf(isAffordable.negate());

        System.out.println("Affordable and in-stock products:");
        for (Product product : products) {
            System.out.println(product);
        }
    }    
}
