import Interfaces.Pago;

public class PagoPayPal implements Pago{
    private boolean loggedIn;

    @Override
    public void realizarCobro(double monto) {
        if (!loggedIn) return;
    }
}
