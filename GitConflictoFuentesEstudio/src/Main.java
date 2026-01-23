import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double iva = 0.16;

        double subtotal = pedirDouble(scanner, "Subtotal: ");
        double descuento = subtotal*.10;
        double total = subtotal*iva-descuento;


        System.out.printf("Total a pagar: %.2f%n", total);
    }

    public static double pedirDouble(Scanner scanner, String mensaje) {
        System.out.print(mensaje);
        return scanner.nextDouble();
    }
}