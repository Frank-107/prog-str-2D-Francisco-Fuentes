import java.util.*;
public class Main {
    public static int c1, c2, c3, c4 = 0;
    public static void main(String[] args){
        int opcion = 0;
        boolean condicion = false;
        Scanner leer = new Scanner(System.in);
        while (true){
        do {
            System.out.println("¿Que conversion desea hacer?");
            System.out.println(" 1) C a F\n 2) F a C\n 3) Km a Millas\n 4) Millas a Km \n 5) salir");
            opcion = leer.nextInt();
            if (opcion > 5 || opcion <= 0){
                System.out.println("Opcion no valida");
                condicion = false;
            }
            else {
                condicion = true;
            }
        } while (!condicion);
        switch (opcion) {
            case 1:
                System.out.println("la conversion es: "+ caf(leer)+ " F");
                break;
            case 2:
                System.out.println("la conversion es: "+ fac(leer)+" C");
                break;
            case 3:
                System.out.println("la conversion es: "+ kam(leer)+ " Millas");
                break;
            case 4:
                System.out.println("la conversion es: "+ mak(leer)+ " Km");
                break;
            case 5 :
                System.out.println("Selecionaste salir");
                System.out.println("Usted realizo este numero de converisones:");
                System.out.println("C a F: "+c1+"\nF a C: "+c2+"\nKm a Millas: "+c3+"\nMillas a Km: "+c4);

                return;
        }}


    }
    public static double caf(Scanner leer){
        double variable = 0;
        boolean numerico = false;
        System.out.println("Opcion elegida: C a F");
        System.out.println("¿Cual es el valor?");
       while(!leer.hasNextDouble()){
           System.out.println("No es un valor numerico");
           System.out.println("¿Cual es el valor?");
           leer.next();
       }
       variable = leer.nextDouble();
       c1++;

        return (variable * 9.0 / 5.0) + 32;
    }
    public static double fac(Scanner leer){
        double variable = 0;
        System.out.println("Opcion elegida: F a C");
        System.out.println("¿Cual es el valor?");
        while(!leer.hasNextDouble()){
            System.out.println("No es un valor numerico");
            System.out.println("¿Cual es el valor?");
            leer.next();
        }
        variable = leer.nextDouble();
        c2++;
        return (variable - 32) * (5.0 / 9.0);
    }
    public static double kam(Scanner leer){
        double variable = 0;
        System.out.println("Opcion elegida: Km a Millas");
        System.out.println("¿Cual es el valor?");
        while(!leer.hasNextDouble()){
            System.out.println("No es un valor numerico");
            System.out.println("¿Cual es el valor?");
            leer.next();
        }
        c3++;
        variable = leer.nextDouble();
        return (variable*0.621371);
    }
    public static double mak(Scanner leer){
        double variable = 0;
        System.out.println("Opcion elegida: Millas a Km");
        System.out.println("¿Cual es el valor?");
        while(!leer.hasNextDouble()){
            System.out.println("No es un valor numerico");
            System.out.println("¿Cual es el valor?");
            leer.next();
        }
        c4++;
        variable = leer.nextDouble();
        return (variable*1.60934);
    }
}
