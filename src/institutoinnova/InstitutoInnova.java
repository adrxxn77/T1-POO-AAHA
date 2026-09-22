package institutoinnova;

import java.util.Scanner;

public class InstitutoInnova {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        AlumnoControlador controlador = new AlumnoControlador();

        int opcion = 0;

        while (opcion != 3) {

            System.out.println("\n===== INSTITUTO INNOVA =====");
            System.out.println("1. Registrar alumno");
            System.out.println("2. Listar alumnos");
            System.out.println("3. Salir");
            System.out.print("Ingrese una opcion: ");

            try {

                opcion = Integer.parseInt(teclado.nextLine());

                switch (opcion) {

                    case 1:

                        Alumno alumno = new Alumno();

                        System.out.println("\n--- REGISTRO DE ALUMNO ---");

                        System.out.print("Ingrese el nombre: ");
                        alumno.setNombre(teclado.nextLine());


                        boolean tipoCorrecto = false;

                        while (tipoCorrecto == false) {

                            System.out.print("Ingrese el tipo de documento (DNI / Residencia Temporal): ");
                            String tipoDocumento = teclado.nextLine();

                            tipoCorrecto = alumno.setTipoDocumento(tipoDocumento);
                        }


                        boolean documentoCorrecto = false;

                        while (documentoCorrecto == false) {

                            System.out.print("Ingrese el numero de documento: ");
                            String numeroDocumento = teclado.nextLine();

                            if (controlador.existeDocumento(numeroDocumento)) {

                                System.out.println("Este numero de documento ya esta registrado");

                            } else {

                                documentoCorrecto = alumno.setNumeroDocumento(numeroDocumento);
                            }
                        }


                        boolean nivelCorrecto = false;

                        while (nivelCorrecto == false) {

                            System.out.print("Ingrese el nivel socioeconomico (A / B / C): ");
                            String nivel = teclado.nextLine();

                            nivelCorrecto = alumno.setNivelSocioeconomico(nivel);
                        }


                        boolean becaCorrecta = false;

                        while (becaCorrecta == false) {

                            System.out.print("Ingrese el tipo de beca (Ninguna / Parcial / Total): ");
                            String beca = teclado.nextLine();

                            becaCorrecta = alumno.setTipoBeca(beca);
                        }


                        controlador.agregarAlumno(alumno);

                        System.out.println("\nAlumno registrado correctamente.");

                        break;


                    case 2:

                        System.out.println("\n--- LISTA DE ALUMNOS ---");

                        controlador.listarAlumnos();

                        break;


                    case 3:

                        System.out.println("\nPrograma finalizado.");

                        break;


                    default:

                        System.out.println("\nOpcion no valida.");

                        break;
                }

            } catch (Exception e) {

                System.out.println("\nError: debe ingresar una opcion valida.");
            }
        }

        teclado.close();
    }
}
