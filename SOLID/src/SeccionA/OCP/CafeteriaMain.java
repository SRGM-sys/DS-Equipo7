package SeccionA.OCP;

// CLASE MAIN (Para probar el flujo)
public class CafeteriaMain {
    public static void main(String[] args) {
        CajaRegistradora caja = new CajaRegistradora();

        // Agregamos bebidas tradicionales (las que existían desde el día 1)
        System.out.println("--- Iniciando Pedido ---");
        caja.agregarBebida(new CafeNegro());
        caja.agregarBebida(new Cappuccino(true));
       
        System.out.println("------------------------");
        System.out.println("Total a pagar: $" + String.format("%.2f", caja.calcularTotal()));
    }
}
