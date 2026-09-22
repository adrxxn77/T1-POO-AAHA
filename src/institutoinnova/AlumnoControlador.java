/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package institutoinnova;

import java.util.ArrayList;

/**
 *
 * @author herre
 */
public class AlumnoControlador {
    
    private ArrayList<Alumno> listaAlumnos = new ArrayList<>();
    
    public void agregarAlumno(Alumno alumno) {
        listaAlumnos.add(alumno);
    }
    
    public void listarAlumnos() {
        
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