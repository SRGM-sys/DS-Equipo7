package SeccionB;
import java.util.List;

public class Original {
   

public class ShoppingCart {
    private List<Product> products;

    public void addProduct(Product product) {
        products.add(product);
    }
    public void removeProduct(Product product) {
        products.remove(product);
    }
    public double calculateTotalPrice() {
        double total = 0;
        // Lógica para calcular el precio total
        return total;
    }
    public void sendReceipt() {
        System.out.println("Sending receipt by email...");
        // Lógica para enviar el recibo
    }
}

public class Product {
    private String name;
    private double price;
    private double weight;
    private String type;

    public Product(String name, double price, double weight, String type){}
    public String getName()   { return name; }
    public double getPrice()  { return price; }
    public double getWeight() { return weight; }
    public String getType()   { return type; }
}

public class DigitalProduct extends Product {
    public DigitalProduct(String name, double price) {
        super(name, price, 0, "digital");
    }
    @Override
    public double getWeight() {
        throw new UnsupportedOperationException("Digital products have no weight.");
    }
}

public class IvaCalculator {
    public double calculateIVA(Product p) {
        double iva = 0;
        switch (p.getType()) {
            case "book":       iva = 0;              break;
            case "clothing":   iva = p.getPrice() * 0.12;   break;
            case "technology": iva = p.getPrice() * 0.15;   break;
        }
        return iva;
    }
}
 
}
