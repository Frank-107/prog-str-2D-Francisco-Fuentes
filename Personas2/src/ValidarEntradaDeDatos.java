import java.util.*;

public class ValidarEntradaDeDatos {

    public int getvalidint(Scanner leer){
        while (true){
            System.out.println("Introduce el ID");
            try {
                int valor = leer.nextInt();
                leer.nextLine();
                return valor;
            }catch (Exception e){
                System.out.println("El valor no es un entero");
                leer.next();
            }
        }
    }

    public String getValidNombre(Scanner leer){
        while(true) {
            System.out.println("Cual es el nombre?");

                String nombre = leer.nextLine().trim();
                if (nombre.isEmpty()){
                    System.out.println("nombre no valido");
                }else{
                    return nombre;
                }


        }
    }






}
