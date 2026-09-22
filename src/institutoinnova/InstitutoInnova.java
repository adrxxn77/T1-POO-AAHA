/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package institutoinnova;

import java.util.Scanner;

/**
 *
 * @author herre
 */
public class InstitutoInnova {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        Alumno alumno1 = new Alumno();
        
        System.out.print("Ingrese el nombre: ");
        alumno1.setNombre(teclado.nextLine());
        
        System.out.print("Ingrese el tipo de documento: ");
        alumno1.setTipoDocumento(teclado.nextLine());
        
        System.out.print("Ingrese el numero de documento: ");
        alumno1.setNumeroDocumento(teclado.nextLine());
        
        System.out.print("Ingrese el nivel socioeconomico: ");
        alumno1.setNivelSocioeconomico(teclado.nextLine());
        
        System.out.print("Ingrese el tipo de beca: ");
        alumno1.setTipoBeca(teclado.nextLine());
        
        System.out.println("\n--- DATOS DEL ALUMNO ---");
        System.out.println("Nombre: " + alumno1.getNombre());
        System.out.println("Tipo de documento: " + alumno1.getTipoDocumento());
        System.out.println("Numero de documento: " + alumno1.getNumeroDocumento());
        System.out.println("Nivel socioeconomico: " + alumno1.getNivelSocioeconomico());
        System.out.println("Tipo de beca: " + alumno1.getTipoBeca());
    }
    
}