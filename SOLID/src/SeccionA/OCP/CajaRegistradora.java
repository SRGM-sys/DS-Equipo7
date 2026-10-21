package SeccionA.OCP;

// LA CLASE PRINCIPAL DE NEGOCIO (Cerrada a modificación)

import java.util.ArrayList;
import java.util.List;

// Esta clase hace los cálculos. Funciona con la abstracción (Bebida).
public class CajaRegistradora {
    private List<Bebida> pedidoActual;

    public CajaRegistradora() {
        // Usamos ArrayList para gestionar la lista de bebidas dinámicamente
        this.pedidoActual = new ArrayList<>();
    }

    public void agregarBebida(Bebida bebida) {
        pedidoActual.add(bebida);
        System.out.println("Agregado: " + bebida.getNombre() + " - $" + bebida.calcularPrecio());
    }

    // ESTE ES EL CORAZÓN DEL OCP:
    // Este método procesará 10, 100 o 1000 tipos de bebidas diferentes en el futuro
    // y NUNCA tendremos que modificar este bloque de código.
    public double calcularTotal() {
        double total = 0;
        for (Bebida bebida : pedidoActual) {
            // El polimorfismo hace la magia aquí. Llama al método correcto de cada clase.
            total += bebida.calcularPrecio();
        }
        return total;
    }
}
