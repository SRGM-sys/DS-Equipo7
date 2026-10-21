package SeccionA.LSP;

// LA INTERFAZ BASE (El contrato general seguro)
// Aquí solo ponemos lo que ABSOLUTAMENTE TODOS los vehículos de la pizzería pueden hacer.
// La única promesa que todo transporte debe cumplir es "poder entregar un pedido".
public interface TransporteDePizzeria {
    void entregarPedido(String direccion);
}
