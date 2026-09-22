package institutoinnova;

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

    public boolean setTipoDocumento(String tipoDocumento) {
        
        if (tipoDocumento.equalsIgnoreCase("DNI") ||
            tipoDocumento.equalsIgnoreCase("Residencia Temporal")) {
            
            this.tipoDocumento = tipoDocumento;
            return true;
            
        } else {
            System.out.println("Tipo de documento no valido");
            return false;
        }
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public boolean setNumeroDocumento(String numeroDocumento) {
        
        if (tipoDocumento != null) {
            
            if (tipoDocumento.equalsIgnoreCase("DNI")) {
                
                if (numeroDocumento.matches("[0-9]{8}")) {
                    this.numeroDocumento = numeroDocumento;
                    return true;
                } else {
                    System.out.println("El DNI debe tener 8 digitos");
                    return false;
                }
                
            } else if (tipoDocumento.equalsIgnoreCase("Residencia Temporal")) {
                
                if (numeroDocumento.matches("[0-9]{11}")) {
                    this.numeroDocumento = numeroDocumento;
                    return true;
                } else {
                    System.out.println("La Residencia Temporal debe tener 11 digitos");
                    return false;
                }
            }
        }
        
        System.out.println("Primero debe ingresar un tipo de documento valido");
        return false;
    }

    public String getNivelSocioeconomico() {
        return nivelSocioeconomico;
    }

    public boolean setNivelSocioeconomico(String nivelSocioeconomico) {
        
        if (nivelSocioeconomico.equalsIgnoreCase("A") ||
            nivelSocioeconomico.equalsIgnoreCase("B") ||
            nivelSocioeconomico.equalsIgnoreCase("C")) {
            
            this.nivelSocioeconomico = nivelSocioeconomico.toUpperCase();
            return true;
            
        } else {
            System.out.println("Nivel socioeconomico no valido");
            return false;
        }
    }

    public String getTipoBeca() {
        return tipoBeca;
    }

    public boolean setTipoBeca(String tipoBeca) {
        
        if (tipoBeca.equalsIgnoreCase("Ninguna") ||
            tipoBeca.equalsIgnoreCase("Parcial") ||
            tipoBeca.equalsIgnoreCase("Total")) {
            
            this.tipoBeca = tipoBeca;
            return true;
            
        } else {
            System.out.println("Tipo de beca no valido");
            return false;
        }
    }

    public double calcularPension(double pensionBase) {
        
        if (tipoBeca.equalsIgnoreCase("Parcial")) {
            return pensionBase * 0.50;
            
        } else if (tipoBeca.equalsIgnoreCase("Total")) {
            return 0;
            
        } else {
            return pensionBase;
        }
    }
}