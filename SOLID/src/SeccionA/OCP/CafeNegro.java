package SeccionA.OCP;

// IMPLEMENTACIÓN DEL CONTRATO (El código abierto a extensión)
// Cada bebida es su propia clase. Tienen su propia lógica de precios.
public class CafeNegro implements Bebida{
    @Override
    public String getNombre() {
        return "Cafe Negro Clasico";
    }

    @Override
    public double calcularPrecio() {
        return 1.50; // Precio fijo
    }
}
