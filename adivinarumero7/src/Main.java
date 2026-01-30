import java.util.*;
public class Main {
    static int cuantorango = 0;
    static int cuantonum = 0;

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random ran = new Random();
        int max = 100;
        int min = 1;
        int secreto = ran.nextInt(100)+1;
        int intentos = 0;
        int lim = 7;
        boolean gano = false;
        System.out.println("Adivina el numero secreto");
        while (intentos<lim){
            int numero = obtener(leer, "intento= "+(intentos+1),min,max);
            intentos++;
            if (numero == secreto){
                System.out.println("has ganado en el intento " + intentos);
                System.out.println("te pasaste del rango: "+cuantorango+ " veces");
                System.out.println("Introduciste valores no numericos : "+cuantonum+ " veces");
                gano = true;
                return;
            }else if (numero>secreto){
                System.out.println("El numero que estas buscando es menor ");
            }
            else {
                System.out.println("El numero que esta buscando es mayor");
            }


        }
        if (!gano){
            System.out.println("Perdiste, el numero secreto era: "+secreto);
            System.out.println("te pasaste del rango: "+cuantorango+ " veces");
            System.out.println("Introduciste valores no numericos : "+cuantonum+ " veces");


        }
    }


    public static int obtener(Scanner leer, String mensaje, int min, int max){
        int valor;
        while (true){
            System.out.println(mensaje);
            if (leer.hasNextInt()){
                valor=leer.nextInt();
                if (valor>=min && valor<=max){
                    return valor;
                }
                else {
                    System.out.println("Rango equivocado (1 - 100)");
                    cuantorango++;
                }
            }
            else{
                System.out.println("El dato debe de ser numerico");
                leer.next();
                cuantonum++;
            }
        }
    }


}
