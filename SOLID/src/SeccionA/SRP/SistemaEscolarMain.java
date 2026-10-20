
package SeccionA.SRP;

// CLASE PRINCIPAL (Responsable de orquestar el flujo)
public class SistemaEscolarMain {
    
    public static void main(String[] args) {
        // 1. Instanciamos a nuestros "empleados" especializados
        RegistroEstudiantil registro = new RegistroEstudiantil();
        CalculadoraAcademica calculadora = new CalculadoraAcademica();
        ImpresoraDeBoletas impresora = new ImpresoraDeBoletas();

        // 2. Creamos los datos
        Estudiante alumno1 = new Estudiante("Ana Rivera");
        alumno1.agregarCalificacion(8.5);
        alumno1.agregarCalificacion(9.0);
        alumno1.agregarCalificacion(7.5);

        Estudiante alumno2 = new Estudiante("Luis Pacheco");
        alumno2.agregarCalificacion(5.0);
        alumno2.agregarCalificacion(6.5);

        // 3. Usamos la clase encargada de matricular (Registro)
        registro.matricularEstudiante(alumno1);
        registro.matricularEstudiante(alumno2);
        System.out.println();

        // 4. Usamos la clase encargada de imprimir (Presentación)
        // La impresora internamente usará la calculadora (Lógica matemática)
        for (Estudiante est : registro.obtenerTodosLosEstudiantes()) {
            impresora.imprimirBoletin(est, calculadora);
        }
    }
}
