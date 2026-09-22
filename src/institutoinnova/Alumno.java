/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package institutoinnova;

/**
 *
 * @author herre
 */
public class Alumno {
    
    private String nombre;
    private String tipoDocumento;
    private String numeroDocumento;
    private String nivelSocioeconomico;
    private String tipoBeca;

    public Alumno() {
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        
        if (tipoDocumento.equalsIgnoreCase("DNI") ||
            tipoDocumento.equalsIgnoreCase("Residencia Temporal")) {
            
            this.tipoDocumento = tipoDocumento;
            
        } else {
            System.out.println("Tipo de documento no valido");
        }
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        
        if (tipoDocumento != null) {
            
            if (tipoDocumento.equalsIgnoreCase("DNI")) {
                
                if (numeroDocumento.matches("[0-9]{8}")) {
                    this.numeroDocumento = numeroDocumento;
                } else {
                    System.out.println("El DNI debe tener 8 digitos");
                }
                
            } else if (tipoDocumento.equalsIgnoreCase("Residencia Temporal")) {
                
                if (numeroDocumento.matches("[0-9]{11}")) {
                    this.numeroDocumento = numeroDocumento;
                } else {
                    System.out.println("La Residencia Temporal debe tener 11 digitos");
                }
            }
            
        } else {
            System.out.println("Primero debe ingresar un tipo de documento valido");
        }
    }

    public String getNivelSocioeconomico() {
        return nivelSocioeconomico;
    }

    public void setNivelSocioeconomico(String nivelSocioeconomico) {
        
        if (nivelSocioeconomico.equalsIgnoreCase("A") ||
            nivelSocioeconomico.equalsIgnoreCase("B") ||
            nivelSocioeconomico.equalsIgnoreCase("C")) {
            
            this.nivelSocioeconomico = nivelSocioeconomico.toUpperCase();
            
        } else {
            System.out.println("Nivel socioeconomico no valido");
        }
    }

    public String getTipoBeca() {
        return tipoBeca;
    }

    public void setTipoBeca(String tipoBeca) {
        
        if (tipoBeca.equalsIgnoreCase("Ninguna") ||
            tipoBeca.equalsIgnoreCase("Parcial") ||
            tipoBeca.equalsIgnoreCase("Total")) {
            
            this.tipoBeca = tipoBeca;
            
        } else {
            System.out.println("Tipo de beca no valido");
        }
    }
    
}