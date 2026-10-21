package SeccionA.LSP;

// UNA INTERFAZ MÁS ESPECÍFICA
// Como no todos usan gasolina, creamos un contrato aparte solo para los que sí tienen motor.
// Esta interfaz hereda de la base, pero añade su propia obligación.
public interface VehiculoMotorizado extends TransporteDePizzeria{
    void cargarGasolina();
}
