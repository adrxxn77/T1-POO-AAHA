package institutoinnova;

import java.util.ArrayList;

public class AlumnoControlador {
    
    private ArrayList<Alumno> listaAlumnos = new ArrayList<>();
    
    public void agregarAlumno(Alumno alumno) {
        listaAlumnos.add(alumno);
    }
    
    public boolean existeDocumento(String numeroDocumento) {
        
        for (int i = 0; i < listaAlumnos.size(); i++) {
            
            if (listaAlumnos.get(i).getNumeroDocumento().equals(numeroDocumento)) {
                return true;
            }
        }
        
        return false;
    }
    
    public void listarAlumnos() {
        
        if (listaAlumnos.isEmpty()) {
            
            System.out.println("No hay alumnos registrados");
            
        } else {
            
            for (int i = 0; i < listaAlumnos.size(); i++) {
                
                System.out.println("Nombre: " + listaAlumnos.get(i).getNombre());
                System.out.println("Tipo de documento: " + listaAlumnos.get(i).getTipoDocumento());
                System.out.println("Numero de documento: " + listaAlumnos.get(i).getNumeroDocumento());
                System.out.println("Nivel socioeconomico: " + listaAlumnos.get(i).getNivelSocioeconomico());
                System.out.println("Tipo de beca: " + listaAlumnos.get(i).getTipoBeca());
                System.out.println("-----------------------------");
            }
        }
    }
}