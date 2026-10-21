package SeccionA.DIP;

// Ni el supermercado ni los métodos de pago saben cómo es el otro,
// solo se comunican a través de este contrato.
public interface MetodoDePago {
    void procesarPago(double cantidad);
}
