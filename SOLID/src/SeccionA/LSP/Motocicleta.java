package SeccionA.LSP;

// La Motocicleta es un VehiculoMotorizado. 
// Por lo tanto, ESTÁ OBLIGADA a cumplir dos promesas: 
// entregar el pedido y cargar gasolina.
public class Motocicleta implements VehiculoMotorizado{
    @Override
    public void entregarPedido(String direccion) {
        System.out.println("Moto: Arrancando el motor y yendo rapido a " + direccion);
    }

    @Override
    public void cargarGasolina() {
        System.out.println("Moto: Llenando el tanque con 2 galones de gasolina.");
    }
}
