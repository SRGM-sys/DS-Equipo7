
package SeccionA.SRP;

import java.util.ArrayList;
import java.util.List;

// CLASE DE GESTIÓN DE DATOS (Responsabilidad: Manejar la lista de alumnos)
// Razón para cambiar: Solo si cambiamos la forma en que almacenamos a los alumnos 
// (ej. pasar de un ArrayList a una base de datos real).
public class RegistroEstudiantil {
    private List<Estudiante> baseDeDatos;

    public RegistroEstudiantil() {
        this.baseDeDatos = new ArrayList<>();
    }

    public void matricularEstudiante(Estudiante estudiante) {
        baseDeDatos.add(estudiante);
        System.out.println("Matriculado: " + estudiante.getNombre());
    }

    public List<Estudiante> obtenerTodosLosEstudiantes() {
        return baseDeDatos;
    }
    
}
