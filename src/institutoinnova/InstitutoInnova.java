/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package institutoinnova;

/**
 *
 * @author herre
 */
public class InstitutoInnova {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Alumno alumno1 = new Alumno();
        
        alumno1.setNombre("Juan Perez");
        alumno1.setTipoDocumento("DNI");
        alumno1.setNumeroDocumento("12345678");
        alumno1.setNivelSocioeconomico("A");
        alumno1.setTipoBeca("Parcial");
        
        System.out.println("Nombre: " + alumno1.getNombre());
        System.out.println("Tipo de documento: " + alumno1.getTipoDocumento());
        System.out.println("Numero de documento: " + alumno1.getNumeroDocumento());
        System.out.println("Nivel socioeconomico: " + alumno1.getNivelSocioeconomico());
        System.out.println("Tipo de beca: " + alumno1.getTipoBeca());
    }
    
}