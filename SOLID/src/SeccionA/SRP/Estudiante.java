package SeccionA.SRP;

import java.util.ArrayList;
import java.util.List;

// CLASE DE ENTIDAD (Solo contiene datos)
// Razón para cambiar: Solo si cambian los atributos de un estudiante (ej. agregar "edad").
public class Estudiante {
    private String nombre;
    private List<Double> calificaciones;

    public Estudiante(String nombre) {
        this.nombre = nombre;
        this.calificaciones = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<Double> getCalificaciones() {
        return calificaciones;
    }
    
    public void agregarCalificacion(double nota){
        this.calificaciones.add(nota);
    }
    
}
