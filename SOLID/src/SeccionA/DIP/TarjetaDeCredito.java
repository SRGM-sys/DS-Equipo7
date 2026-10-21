
package SeccionA.DIP;

// MÓDULO DE BAJO NIVEL (Los detalles o herramientas concretas)
public class TarjetaDeCredito implements MetodoDePago{
    @Override
    public void procesarPago(double cantidad) {
        System.out.println("Procesando pago de $" + cantidad + " usando la red de Tarjeta de Credito.");
    }
}
