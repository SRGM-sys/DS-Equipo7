import java.util.List;

import Interfaces.Pago;

public class Compra {
    private Pago pago;
    private List<Articulo> articulos;

    public Compra(Pago pago) {
        this.pago = pago;
    }

    public void agregarArticulo(Articulo articulo) {
        articulos.add(articulo);
    }

    public void removerArticulo(Articulo articulo) {
        articulos.remove(articulo);
    }

    public void procesarPago(double monto) {
        pago.realizarCobro(monto);
    }
}
