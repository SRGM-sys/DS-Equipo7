package SeccionA.OCP;

// LA INTERFAZ (El contrato que permite la extensión)
// Cualquier bebida nueva que inventemos en el futuro DEBE implementar esta interfaz.
public interface Bebida {
    String getNombre();
    double calcularPrecio();
}
