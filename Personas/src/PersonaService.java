import java.util.Scanner;

public class PersonaService {

    private InputValidator validator = new InputValidator();

    public void alta(Persona[] personas, Scanner leer) {

        int id = validator.getInt(leer, "Ingresa el ID (>0): ");

        if (id <= 0) {
            System.out.println("ERROR: El ID debe ser mayor a 0.");
            return;
        }

        if (idExiste(personas, id)) {
            System.out.println("ERROR: Ya existe una persona con ese ID.");
            return;
        }

        leer.nextLine(); // limpiar buffer
        String nombre = validator.getNombre(leer, "Ingresa el nombre: ");

        for (int i = 0; i < personas.length; i++) {
            if (personas[i] == null) {
                personas[i] = new Persona(id, nombre);
                System.out.println("Persona registrada correctamente.");
                return;
            }
        }

        System.out.println("ERROR: No hay espacios disponibles en el arreglo.");
    }

    public void buscarPorId(Persona[] personas, Scanner leer) {

        int id = validator.getInt(leer, "Ingresa el ID a buscar: ");

        for (int i = 0; i < personas.length; i++) {
            if (personas[i] != null && personas[i].getId() == id && personas[i].isActiva()) {
                System.out.println("Persona encontrada:");
                System.out.println("ID: " + personas[i].getId());
                System.out.println("Nombre: " + personas[i].getNombre());
                return;
            }
        }

        System.out.println("No encontrada o inactiva.");
    }

    public void bajaLogica(Persona[] personas, Scanner leer) {

        int id = validator.getInt(leer, "Ingresa el ID a dar de baja: ");

        for (int i = 0; i < personas.length; i++) {
            if (personas[i] != null && personas[i].getId() == id && personas[i].isActiva()) {
                personas[i].setActiva(false);
                System.out.println("Persona dada de baja correctamente.");
                return;
            }
        }

        System.out.println("No encontrada o ya estaba inactiva.");
    }

    public void listarActivas(Persona[] personas) {

        boolean hayActivas = false;

        System.out.println("---- LISTA DE PERSONAS ACTIVAS ----");

        for (int i = 0; i < personas.length; i++) {
            if (personas[i] != null && personas[i].isActiva()) {
                System.out.println("ID: " + personas[i].getId() + " , Nombre: " + personas[i].getNombre());
                hayActivas = true;
            }
        }

        if (!hayActivas) {
            System.out.println("No hay personas activas registradas.");
        }
    }

    public void actualizarNombre(Persona[] personas, Scanner leer) {

        int id = validator.getInt(leer, "Ingresa el ID a actualizar: ");

        for (int i = 0; i < personas.length; i++) {
            if (personas[i] != null && personas[i].getId() == id && personas[i].isActiva()) {

                leer.nextLine(); // limpiar buffer
                String nuevoNombre = validator.getNombre(leer, "Ingresa el nuevo nombre: ");

                personas[i].setNombre(nuevoNombre);
                System.out.println("Nombre actualizado correctamente.");
                return;
            }
        }

        System.out.println("No encontrada o inactiva.");
    }

    private boolean idExiste(Persona[] personas, int id) {
        for (int i = 0; i < personas.length; i++) {
            if (personas[i] != null && personas[i].getId() == id) {
                return true;
            }
        }
        return false;
    }
}
