
package SeccionA.LSP;

// LA CLASE PRINCIPAL DEL SISTEMA (La que usa el principio de Liskov)
public class SistemaDeDespacho {

    // Recibe un transporte cualquiera. Al sistema NO le importa si es moto o bici.
    // Confía ciegamente en que el transporte sabe cómo entregar el pedido sin romperse.
    public void procesarEntrega(TransporteDePizzeria transporte, String direccion) {
        System.out.println("Asignando un nuevo pedido...");
        
        // Aquí ocurre la "Sustitución". Podemos poner cualquier clase hija aquí
        // y el código funcionará perfectamente, sin "ifs" preguntando qué tipo de vehículo es.
        transporte.entregarPedido(direccion);
    }
}
