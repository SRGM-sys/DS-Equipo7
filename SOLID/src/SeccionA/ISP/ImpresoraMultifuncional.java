package SeccionA.ISP;

public class ImpresoraMultifuncional implements Imprimible, Escaneable, EnviablePorFax {
    
    @Override
    public void imprimir(String documento) {
        System.out.println("Imprimiendo a color y alta calidad: " + documento);
    }

    @Override
    public void escanear(String documento) {
        System.out.println("Escaneando documento para guardarlo en PDF: " + documento);
    }

    @Override
    public void enviarFax(String documento) {
        System.out.println("Marcando numero y enviando fax: " + documento);
    }
    
}
