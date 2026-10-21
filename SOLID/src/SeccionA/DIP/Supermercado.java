package SeccionA.DIP;

// 3. EL MÓDULO DE ALTO NIVEL (La clase principal)
public class Supermercado {
    private MetodoDePago metodoDePago;

    public Supermercado(MetodoDePago metodoDePago) {
        this.metodoDePago = metodoDePago;
    }

    public void cobrarCliente(double cantidad) {
        System.out.println("Iniciando transaccion en caja...");
        // Al supermercado no le importa cómo se paga, solo delega la acción.
        metodoDePago.procesarPago(cantidad);
        System.out.println("Transaccion finalizada con exito.\n");
    }
}
