package SeccionA.DIP;

public class SistemaDePagosMain {
    public static void main(String[] args) {
        // El cliente 1 llega y decide pagar con tarjeta
        MetodoDePago pagoConTarjeta = new TarjetaDeCredito();
        Supermercado caja1 = new Supermercado(pagoConTarjeta);
        caja1.cobrarCliente(45.50);

        // El cliente 2 llega y decide pagar con su celular
        MetodoDePago pagoConApp = new AplicacionMovil();
        Supermercado caja2 = new Supermercado(pagoConApp);
        caja2.cobrarCliente(12.00);
    }
}
