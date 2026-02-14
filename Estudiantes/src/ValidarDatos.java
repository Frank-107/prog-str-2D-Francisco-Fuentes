import java.util.Scanner;
public class ValidarDatos {
    public int validarid(Scanner leer){
        while (true){
            System.out.println("Introduce el id");
            try {
                int id = leer.nextInt();
                leer.nextLine();
                if (id<0) {
                    System.out.println("no se puede una id menor a 0");
                }else{
                    return id;
                }
            }
            catch (Exception e){
                System.out.println("El valor no es un entero");
                leer.next();
            }
        }
    }
    public double validarPromedio(Scanner leer){
        while (true){
            System.out.println("Introduce el promedio");
            try {
                double promedio = leer.nextDouble();
                if (promedio<=10 && promedio>=0){
                    return promedio;
                }else{
                    System.out.println("El promedio no es valido");
                }
            }
            catch (Exception e){
                System.out.println("El valor no un numero decimal");
                leer.next();
            }
        }
    }
    public String validarNombre(Scanner leer){
        while(true){
            System.out.println("Cual es el nombre");
            String nombre = leer.nextLine().trim();
            if(!nombre.isEmpty()){
                return nombre;
            }else{
                System.out.println("No se admiten vacios");
            }
        }
    }
}
