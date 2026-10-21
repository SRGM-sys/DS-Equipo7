package SeccionA.LSP;

// La Bicicleta solo es un TransporteDePizzeria.
// No la obligamos a cargar gasolina. Solo hace lo que una bicicleta realmente puede hacer.
public class Bicicleta implements TransporteDePizzeria{
    @Override
    public void entregarPedido(String direccion) {
        System.out.println("Bicicleta: Pedaleando con cuidado por la ciclovia hacia " + direccion);
    }
}
