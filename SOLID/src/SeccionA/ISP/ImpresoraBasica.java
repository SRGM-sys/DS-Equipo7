package SeccionA.ISP;

// La impresora básica solo imprime.
// Al usar ISP, no la obligamos a implementar métodos de escáner o fax.
public class ImpresoraBasica implements Imprimible {
    
    @Override
    public void imprimir(String documento) {
        System.out.println("Imprimiendo en blanco y negro: " + documento);
    }
    
}
