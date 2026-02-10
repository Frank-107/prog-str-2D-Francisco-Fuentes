import java.util.Scanner;
public class InputValidator {
    public int getInt(Scanner leer, String msg) {
        int valor;
        while (true) {
            System.out.print(msg);
            try {
                valor = leer.nextInt();
                return valor;
            } catch (Exception e) {
                System.out.println("Entrada invalida, debes escribir un numero.");
                leer.next();
            }
        }
    }
    public String getNombre(Scanner leer, String msg) {
        String nombre;

        while (true) {
            System.out.print(msg);
            nombre = leer.nextLine();

            if (!nombre.trim().isEmpty()) {
                return nombre;
            }
            System.out.println("El nombre no puede estar vacio.");
        }
    }
}
