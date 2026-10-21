package SeccionA.ISP;

public class OficinaMain {
    public static void main(String[] args) {
        
        ImpresoraBasica impresoraBarata = new ImpresoraBasica();
        ImpresoraMultifuncional maquinaCompleta = new ImpresoraMultifuncional();

        System.out.println("--- Usando la Impresora Basica ---");
        impresoraBarata.imprimir("Texto_Simple.txt");
        // impresoraBarata.escanear() -> Ni siquiera existe, lo cual es correcto y seguro.

        System.out.println("\n--- Usando la Impresora Multifuncional ---");
        maquinaCompleta.imprimir("Folleto_Publicitario.pdf");
        maquinaCompleta.escanear("Cedula_Identidad.jpg");
        maquinaCompleta.enviarFax("Contrato_Firmado.docx");
    }
}
