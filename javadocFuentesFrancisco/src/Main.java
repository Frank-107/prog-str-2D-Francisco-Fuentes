import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Calcular IMC");
            System.out.println("2. Calcular area de un rectuangulo");
            System.out.println("3. Convertir °C a °F");
            System.out.println("4. Calcular area de un circulo");
            System.out.println("5. Salir");

            choice = leer.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Seleccionaste Calcular el IMC");
                    System.out.println(imc(leer));

                    break;
                case 2:
                    System.out.println("Seleccionaste Calcular el area de un rectangulo");
                    break;
                case 3:
                    System.out.println("Seleccionaste Convertir C a F");
                    break;
                case 4:
                    System.out.println("Seleccionaste Calcular area del circulo");
                    break;
                case 5:
                    System.out.println("Seleccionaste Salir");
                    break;
                default:
                    System.out.println("Eleccion invalida, por favor elija de nuevo");
            }
            System.out.println();

        } while (choice != 5);

        leer.close();
    }
    public static Double imc(Scanner leer) {
        System.out.println("Cual es tu peso ?");
        double peso = leer.nextDouble();
        System.out.println("Cual es tu altura ?");
        double altura = leer.nextDouble();
        return peso/(altura*altura);


    }
}
