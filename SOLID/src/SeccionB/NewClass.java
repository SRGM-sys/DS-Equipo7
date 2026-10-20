package SeccionB;

import java.util.ArrayList;
import java.util.List;

// ================== PRODUCTOS ==================

// LSP + OCP: clase base abstracta, sin peso ni "type"
abstract class Product {
    protected String name;
    protected double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName()  { return name; }
    public double getPrice() { return price; }

    public abstract double getIvaRate();   // OCP: cada tipo define su IVA
}

// ISP + LSP: solo los productos físicos tienen peso
interface Shippable {
    double getWeight();
}

class Book extends Product implements Shippable {
    private double weight;

    public Book(String name, double price, double weight) {
        super(name, price);
        this.weight = weight;
    }

    @Override
    public double getWeight()  { return weight; }

    @Override
    public double getIvaRate() { return 0.0; }
}

class Clothing extends Product implements Shippable {
    private double weight;

    public Clothing(String name, double price, double weight) {
        super(name, price);
        this.weight = weight;
    }

    @Override
    public double getWeight()  { return weight; }

    @Override
    public double getIvaRate() { return 0.12; }
}

class Technology extends Product implements Shippable {
    private double weight;

    public Technology(String name, double price, double weight) {
        super(name, price);
        this.weight = weight;
    }

    @Override
    public double getWeight()  { return weight; }

    @Override
    public double getIvaRate() { return 0.15; }
}

// LSP: ya no lanza excepción, porque no está obligado a tener peso
class DigitalProduct extends Product {

    public DigitalProduct(String name, double price) {
        super(name, price);
    }

    @Override
    public double getIvaRate() { return 0.15; }
}

// ================== CÁLCULOS ==================

// OCP: sin switch, nunca cambia al agregar categorías
class IvaCalculator {
    public double calculateIVA(Product p) {
        return p.getPrice() * p.getIvaRate();
    }
}

// SRP: el cálculo del total sale del carrito
class PriceCalculator {
    private IvaCalculator ivaCalculator;

    public PriceCalculator(IvaCalculator ivaCalculator) {
        this.ivaCalculator = ivaCalculator;
    }

    public double calculateTotalPrice(ShoppingCart cart) {
        double total = 0;
        for (Product p : cart.getProducts()) {
            total += p.getPrice() + ivaCalculator.calculateIVA(p);
        }
        return total;
    }
}

// ================== CARRITO ==================

// SRP: solo gestiona los productos
class ShoppingCart {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product)    { products.add(product); }
    public void removeProduct(Product product) { products.remove(product); }
    public List<Product> getProducts()         { return products; }
}

// ================== RECIBO ==================

// DIP: abstracción para enviar recibos
interface ReceiptSender {
    void sendReceipt(ShoppingCart cart, double total);
}

class EmailReceiptSender implements ReceiptSender {
    @Override
    public void sendReceipt(ShoppingCart cart, double total) {
        System.out.printf("Sending receipt by email... Total: $%.2f%n", total);
    }
}

// ================== PRUEBA ==================

public class NewClass {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(new Book("Clean Code", 30.0, 0.8));
        cart.addProduct(new Clothing("Camiseta", 15.0, 0.3));
        cart.addProduct(new DigitalProduct("Ebook UML", 10.0));

        PriceCalculator calculator = new PriceCalculator(new IvaCalculator());
        double total = calculator.calculateTotalPrice(cart);

        ReceiptSender sender = new EmailReceiptSender();
        sender.sendReceipt(cart, total);
    }
}