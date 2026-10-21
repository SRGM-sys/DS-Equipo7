package SeccionA.LSP;

// CLASE MAIN (Para probar el flujo)
public class PizzeriaMain {
    public static void main(String[] args) {
        
        Motocicleta moto = new Motocicleta();
        Bicicleta bici = new Bicicleta();
        
        SistemaDeDespacho despachador = new SistemaDeDespacho();

        System.out.println("--- Pedido 1 ---");
        despachador.procesarEntrega(moto, "Calle Principal 123");

        System.out.println();

        System.out.println("--- Pedido 2 ---");
        despachador.procesarEntrega(bici, "Avenida Universitaria 45");
        
        System.out.println();
        
        System.out.println("--- Final del turno ---");
        moto.cargarGasolina();
    }
}
