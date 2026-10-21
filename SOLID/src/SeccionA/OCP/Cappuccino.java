
package SeccionA.OCP;

// IMPLEMENTACIÓN DEL CONTRATO (El código abierto a extensión)
// Cada bebida es su propia clase. Tienen su propia lógica de precios.
public class Cappuccino implements Bebida{
    private boolean conCremaExtra;

    public Cappuccino(boolean conCremaExtra) {
        this.conCremaExtra = conCremaExtra;
    }

    @Override
    public String getNombre() {
        if (conCremaExtra) return "Cappuccino con crema extra";
        return "Cappuccino regular";    
    }

    @Override
    public double calcularPrecio() {
        double precioBase = 2.50;
        if (conCremaExtra) return precioBase + 0.75;
        return precioBase;
    }
}
