
package SeccionA.SRP;

import java.util.List;

// CLASE DE LÓGICA DE NEGOCIO (Responsabilidad: Cálculos matemáticos)
// Razón para cambiar: Solo si el Ministerio de Educación cambia la fórmula 
// para calcular los promedios (ej. agregar pesos o porcentajes a las notas).
public class CalculadoraAcademica {
    
    public double calcularPromedio(Estudiante estudiante){
        List<Double> notas = estudiante.getCalificaciones();
        if (notas.isEmpty()) return 0.0;

        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.size();
    }
    
}
