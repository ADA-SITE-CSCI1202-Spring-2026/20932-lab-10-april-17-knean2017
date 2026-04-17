public class Product {
    public String name;
    public double price;
    public boolean inStock;

    public Product(String name, double price, boolean inStock) {
        this.name = name;
        this.price = price;
        this.inStock = inStock;
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + ", inStock=" + inStock + '}';
    }
}
