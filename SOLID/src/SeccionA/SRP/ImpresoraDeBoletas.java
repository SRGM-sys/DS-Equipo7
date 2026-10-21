package SeccionA.SRP;

// CLASE DE PRESENTACIÓN (Responsabilidad: Mostrar la información al usuario)
// Razón para cambiar: Solo si queremos cambiar el diseño visual del boletín 
// (ej. exportar a PDF, mostrar en HTML, o cambiar el texto de la consola).
public class ImpresoraDeBoletas {
    
    public void imprimirBoletin(Estudiante estudiante, CalculadoraAcademica calculadora) {
        System.out.println("-------------------------------------------------");
        System.out.println("BOLETIN DE CALIFICACIONES - ESCUELA CENTRAL");
        System.out.println("-------------------------------------------------");
        System.out.println("Alumno: " + estudiante.getNombre());
        System.out.println("Notas registradas: " + estudiante.getCalificaciones());
        
        double promedio = calculadora.calcularPromedio(estudiante);
        System.out.println("Promedio Final: " + String.format("%.2f", promedio));
        
        if (promedio >= 7.0) {
            System.out.println("Estado: APROBADO");
        } else {
            System.out.println("Estado: REPROBADO");
        }
        System.out.println("-------------------------------------------------\n");
    }
    
}
