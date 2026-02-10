import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        Persona[] personas = new Persona[20];
        PersonaService service = new PersonaService();

        int opcion;

        do {
            System.out.println("----- MENU -----");
            System.out.println("1) Alta");
            System.out.println("2) Buscar por ID (solo activas)");
            System.out.println("3) Baja lógica por ID");
            System.out.println("4) Listar activas");
            System.out.println("5) Actualizar nombre por ID (solo activas)");
            System.out.println("0) Salir");
            System.out.print("Selecciona una opcion: ");

            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    service.alta(personas, leer);
                    break;

                case 2:
                    service.buscarPorId(personas, leer);
                    break;

                case 3:
                    service.bajaLogica(personas, leer);
                    break;

                case 4:
                    service.listarActivas(personas);
                    break;

                case 5:
                    service.actualizarNombre(personas, leer);
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opcion invalida, intenta otra vez.");
            }

        } while (opcion != 0);

    }
}
