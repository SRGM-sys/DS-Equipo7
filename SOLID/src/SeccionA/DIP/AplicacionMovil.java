package SeccionA.DIP;

// MÓDULO DE BAJO NIVEL (Los detalles o herramientas concretas)
public class AplicacionMovil implements MetodoDePago {
    @Override
    public void procesarPago(double cantidad) {
        System.out.println("Procesando pago de $" + cantidad + " escaneando el codigo QR del celular.");
    }
    
}
