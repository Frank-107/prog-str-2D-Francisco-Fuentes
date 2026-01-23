import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);


        int a = pedir_entero(leer,"hola, dame el numero 1");
        int b = pedir_entero(leer,"dame el numero 2");
        int c = pedir_entero(leer, "dame el numero 3");

        int suma = a + b + c;
        System.out.println("suma=" + suma);
        System.out.println("prom=" + (suma / 3.0));
    }
    public static int pedir_entero (Scanner leer, String mensaje){
        System.out.println(mensaje);
        return leer.nextInt();
    }

}