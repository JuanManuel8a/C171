package B4;


import com.sun.tools.javac.Main;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class TrabajoBloque4 {

    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean registrationComplete;
        do {
            System.out.println("Formulario de Registro de Estudiante");
            System.out.print("Nombre: ");
            String nom = scanner.nextLine();

            System.out.print("Apellido: ");
            String ape = scanner.nextLine();

            System.out.print("Teléfono: ");
            String tel = scanner.nextLine();

            System.out.print("Cédula: ");
            String ced = scanner.nextLine();

            System.out.print("Promedio de Notas Escolares: ");
            double prom = Double.parseDouble(scanner.nextLine());

            System.out.print("Carrera a Cursar: ");
            String carr = scanner.nextLine();
            registrationComplete = false;
            {
                try {

                    if (nom == null || nom.equals(" ")) {
                        throw new Exception("Debe poner el nombre");
                    }
                    if (ape == null || ape.isEmpty()) {
                        throw new Exception("Debe poner el apellido");
                    }
                    if (tel == null || tel.isEmpty()) {
                        throw new Exception("Debe poner el telefono");
                    }
                    if (ced == null || ced.isEmpty()) {
                        throw new Exception("Debe poner la cedula");
                    }
                    if (prom == Double.parseDouble((""))) {
                        throw new Exception("Debe poner su porcentaje");
                    }
                    if (carr == null || carr.isEmpty()) {
                        throw new Exception("Debe poner la carrera a cursar");
                    }
                } catch (Exception e) {
                    logger.atError().log(e);
                } finally {
                    logger.atInfo().log();
                }
            }

            if (prom >= 3.0) {
                System.out.println("Felicidades " + nom + ", quedas aprobado.");
            } else {
                System.out.println("Malas noticias" + nom + ", desaprobaste en la universidad.");
            }

        } while (!registrationComplete);
    }
}



